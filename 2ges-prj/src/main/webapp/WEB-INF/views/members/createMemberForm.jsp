<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div class="container">
<h1> -DB 연동 테스트 </h1>
    <form action="/members/new" method="post">
        <div class="form-group">
            <label for="name">이름 : </label>
            <input type="text" id="name" name="userName" placeholder="이름을 입력하세요." style="height:25px;"><br><br>
            <label for="name">나이 : </label>
            <input type="text" id="age" name="age" placeholder="나이를 입력하세요." style="height:25px; width:130px;"><br><br>
            <label for="name">휴대폰번호 : </label>
            <input type="text" id="phone" name="phone" placeholder="휴대폰 번호를 입력하세요." style="height:35px; width:500px;">
        </div><br>
        <div align="left"><button type="submit">등록</button> </div>
    </form>
</div> <!-- /container -->
</body>
</html>
