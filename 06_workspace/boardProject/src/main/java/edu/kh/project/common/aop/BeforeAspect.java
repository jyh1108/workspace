package edu.kh.project.common.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import edu.kh.project.member.model.dto.Member;

@Component
@Aspect //공통관심사가 작성된  클라스임을 지정
//			Pointcut(타겟처리) + Advice(수행할 코드)
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(BeforeAspect.class);
	
//	@Before("execution(* edu.kh.project..*Impl*.*(..))") 
	
	// 지정된 클래스.메서드에 작성된 @pointcut() 어노테이션의 내요을 타겟으로 삼음
	@Order(1) //순서,하나의 타겟에 대한 여러 advice 수행 시 순서 지정 
	@Before("CommonPointcut.serviceImplPointcut()")
	public void bedoreLog(JoinPoint jp) {  // advice수행할 코드
		
		// 매개변수 joinPoint : apo의 부가 기능이 적용된 대상의
		// 객체, 메서드, 파라미터 정보를 얻을 수 있게 해주는 객체
		
		// 대상 객체의 간단한 클래스명(패키지 제외)
		String className = jp.getTarget().getClass().getSimpleName();
		
		// 메서드 선언부(= 메서드 시그니처) 에서 메서드명만 받아옴
		String methodName = jp.getSignature().getName();
		
		String str = "------------------------------------------------------------------\n";

		str +="[Start] : " + className + " _ " + methodName + "()\n";
		
	    str += "[Parameter] : " + Arrays.toString(jp.getArgs()) + "\n";

	
	    try {
	         // 접속자 IP 얻어오기
	         HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
	         Member loginMember = (Member)req.getSession().getAttribute("loginMember");
	         
	         str += "[ip]" + getRemoteAddr(req);
	         if(loginMember != null) {
	            str += "(email:" + loginMember.getMemberEmail() + ")";
	         }
	      }catch (Exception e) {
	         str += "[스프링 스케쥴러]";
	      }
		logger.info(str);
	}
	
	   public static String getRemoteAddr(HttpServletRequest request) {

	        String ip = null;

	        ip = request.getHeader("X-Forwarded-For");

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("Proxy-Client-IP"); 
	        } 

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("WL-Proxy-Client-IP"); 
	        } 

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("HTTP_CLIENT_IP"); 
	        } 

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("HTTP_X_FORWARDED_FOR"); 
	        }

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("X-Real-IP"); 
	        }

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("X-RealIP"); 
	        }

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getHeader("REMOTE_ADDR");
	        }

	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	            ip = request.getRemoteAddr(); 
	        }

	      return ip;
	   }
}
