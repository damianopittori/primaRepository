<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert</title>
</head>
<body>
<form action="citta">
<select name="code"> 

<% ArrayList<String> listaCode=( ArrayList<String>)request.getAttribute("listaCode"); %>
  <% for(int i =0; i<listaCode.size(); i++){%>
  <% String temp=listaCode.get(i); %>
  <option value="<%=temp%>"><%=temp%></option>
<% }%> 
</select> 
<input type="submit" value="invia"><br>
 </form>
</body>
</html>