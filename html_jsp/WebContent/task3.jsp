<%@ page language="java" import="java.util.Date,java.text.SimpleDateFormat" contentType="text/html;  charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%! int sum = 1;
    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
    Date today = new Date();
    String now = format.format(today);
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>訪問回数: <% out.print(sum++); %> </h1>
  <p> 今日の日付: <%=(now)%>
</body>
</html>