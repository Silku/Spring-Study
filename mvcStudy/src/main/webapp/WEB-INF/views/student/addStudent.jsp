<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>  
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>추가 학생 정보 확인 </h1>
	<!-- 태그라이브러리/form안에있는 form기능을 쓰겠다 -->
		<table>
			<tr>
				<td>
					ID
				</td>
				<td>
					${student.id}
				</td>
			</tr>
			<tr>				
				<td>
					NAME
				</td>
				<td>
					${student.name }
				</td>
			</tr>
			<tr>
				<td>
					PHONE
				</td>
				<td>
					${student.phone }
				</td>
			</tr>
			<tr>
				<td>
					당신의 유출된 비밀번호입니다.
				</td>
				<td>
					${student.pwd }
				</td>
			</tr>
		</table>		
</body>
</html>