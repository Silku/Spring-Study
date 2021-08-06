<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생 정보 등록</h1>
	<form:form method="post" action ="/student/addStudent" commandName="student">
	<!-- 태그라이브러리/form안에있는 form기능을 쓰겠다 -->
		<table>
			<tr>
				<td>
					<form:label path="id">ID</form:label>
				</td>
				<td>
					<form:input path="id"  placeholder ="아이디를 입력하세요"/>
				</td>
			</tr>	
			<tr>				
				<td>
					<form:label path="pwd">비번</form:label>
				</td>
				<td>
					<form:password path="pwd"  placeholder ="비밀번호를 입력하세요"/>
				</td>
			</tr>
			<tr>				
				<td>
					<form:label path="name">성명</form:label>
				</td>
				<td>
					<form:input path="name"  placeholder ="이름을 입력하세요"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="phone">phone</form:label>
				</td>
				<td>
					<form:input path="phone"  placeholder ="휴대폰 번호를 입력하세요"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력완료">
				</td>
			</tr>
		</table>		
	</form:form>
</body>
</html>