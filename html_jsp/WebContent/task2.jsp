<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%! int add(int a, int b){
        return a - b;
    }
%>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
  <h1>125 - 15 = <%= add(125, 15) %></h1>
  <h1>17 - 21 = <%=add(17, 21) %></h1>

</body>
</html>