<%-- Book 크랠스 임모트 (jsp 표현식 쏠때 사용 el필요) --%>
<%@page import="edu.kh.jsp.model.dto.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EL 결과</title>
</head>
<body>
    <h1>EL을 이용해서 출력</h1>

    <h3>파라미터</h3>

    <ul>
    <li> \${param.name속성값} : request 담긴 파라미터 얻어오기(1게)</li>
    <li> \${ paramValues } : 모든 파라미터를 배열로 얻어오기</li>
    <li> \${ paramValues.name속성값[인덱스] } :
        name 일치하는 파라미터 중 지정된 인덱스번째 value

    </ul>

    <p>
        이름 : ${param.inputName} <br>
        이름 : ${param.inputAge} <br>

        opt : ${param.opt}
        opt[0] : ${paramValues.opt[0]}
        opt[1] : ${paramValues.opt[1]}
        opt[2] : ${paramValues.opt[2]}
    </p>

    <hr>

    <h3>세팅된 속성(attribute) 출력하기</h3>

    <ul>
    <li>기본 : \${ key } (key는 세팅한 속성의 key값)</li> 
    <li> 배열 또는 List : \${ key[index] }</li>
    <li> DTO 또는 Map : \${ key.필드명 또는 K}</li>
    </ul>

    <p>
        address(jsp표현식) : <%= request.getAttribute("address")%> <br>
        address(EL) : ${address} <br>
        
        score : ${score} <br>
        strList : $[strList] <br>
        book : ${book} {br} <br>

        <br>

        strList[0] : ${strList[0]}
        strList[1] : ${strList[1]}
        strList[2] : ${strList[2]}
        strList[3] : ${strList[3]} (3번인덱스 가루 없음)
    </p>

    <br><br>

    <%-- book의 tilte(jsp 표현힉) :
        <%= ( (Book)request.getAttribute("book") ).getTitle() %> --%>

        <br>

        <%-- EL은 import 필요 없다 --%>
        book의 title필드(EL) : ${book.title} <br>
        book의 writer(EL) : ${book.writer} <br>
        book의 price(EL) : ${book.price} <br>

        <hr>
        <h1>EL은 null, 비어있다를 같은 것으로 생각한다! </h1>

        ${list1} / ${list2}

        <h4>empty 연산자</h4>

        ${empty list1} / ${empty list2}
</body>
</html>