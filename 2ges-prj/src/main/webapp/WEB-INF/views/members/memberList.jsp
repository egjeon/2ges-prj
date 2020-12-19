<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
<h1> -회원정보 출력</h1>
<div class="container">
    <div>
    <c:choose>
    <c:when test="${fn:length(member)== 0}">
    	<h1>유저 정보가 없습니다.</h1>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead> <tr>
                <th>이름</th>
                <th>나이</th>
                <th>주소</th>
                <th>가입일</th>
            </tr>
            </thead>
            <tbody>
          <c:forEach items="${members}" var="member">
                <tr>
                    <td>${member.userName}</td>
                    <td>${member.age}세</td>
                    <td>${member.phone}</td>
                    <td><fmt:formatDate var="resultRegDt" value="${member.regDate}" pattern="yyyy-MM-dd HH:mm:ss"/>${resultRegDt}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
       </c:otherwise>
      </c:choose>
    </div>
</div> <!-- /container -->
</body>
</html>