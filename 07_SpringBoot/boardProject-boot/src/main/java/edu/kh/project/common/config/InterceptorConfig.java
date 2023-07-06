package edu.kh.project.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import edu.kh.project.common.interceptor.BoardTypeInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

	@Bean 
	public BoardTypeInterceptor boardTypeInterceptor() {
		return new BoardTypeInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//bean으로 등록된 boardTypeInterceptor를 얻어와 인터넵터로 등록
		registry.addInterceptor(boardTypeInterceptor())
		.addPathPatterns("/**") // 가로첼 경로 지정 (여러개 작성 시 ,로 구분)
		.excludePathPatterns("/css/**","/image/**", "/js/**");//가로체지 않을 경로
		
	}
}
