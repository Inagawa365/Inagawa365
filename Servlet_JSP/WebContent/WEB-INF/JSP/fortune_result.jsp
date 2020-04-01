<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="practice.FortuneBean" %>
<%
//リクエストスコープからインスタンスを取得
    FortuneBean fortuneBean = (FortuneBean)request.getAttribute("result");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fortune Result</title>
</head>
<body>
    <h1>↓<%= fortuneBean.getToday() %>↓</h1>
    <h1><%= fortuneBean.getFortune() %></h1>
</body>
</html>