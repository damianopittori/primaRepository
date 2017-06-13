<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Titolo della JSP</title>
</head>
<body>
<!-- Benvenuti al cazzo
<form action="ciao">
Inserisci il valore di a :<br>
<input type = "text" name ="a"><br>
<input type = "submit" value="invia"><br>

</form>

<form action="salve">
Inserisci il valore di a :<br>
<input type = "text" name ="a"><br>
<input type = "submit" value="invia"><br>

</form>

</form>

<form action="mps">
<input type = "radio" name = "attribute" value = "mattina" checked>mattina<br>
<input type = "radio" name = "attribute" value = "pomeriggio">pomeriggio<br>
<input type = "radio" name = "attribute" value = "sera">sera<br>
<input type = "submit" value="invia"><br>
</form>

<form action="cb">
  <input type = "checkbox" name = "attribute" value = "mela">mela<br>
<input type = "checkbox" name = "attribute" value = "banana">arancia<br>
<input type = "checkbox" name = "attribute" value = "arancia">susina<br>
<input type = "checkbox" name = "attribute" value = "susina">banana<br>
<input type = "checkbox" name = "attribute" value = "pera">pera<br>
<input type = "submit" value="invia"><br>
</form> -->

<!-- <form action = "np">
Inserisci il valore di a :<br>
<input type = "text" name ="attribute"><br>
<input type = "submit" value="invia"><br>

</form> -->

<!-- <form action ="city">
Scegli tra ITA FRA DEU per stampare le citta rispettive
<input type = "text" name ="attribute"><br>
<input type = "submit" value="invia"><br>
</form> -->




<form action="country">
<select name="code"> 

<% ArrayList<String> listaCode=( ArrayList<String>)request.getAttribute("listaCode"); %>
  <% for(String temp:listaCode){%>
  <option value="<%=temp%>"><%=temp%></option>
<% }%> 
</select> 
<input type="submit" value="invia"><br>
 </form>

<%-- <%
String valore =(String)request.getAttribute("valore");
if(valore!=null){
%>
<%=valore %>
<%} %>

<form action ="invioDati" method ="post">
<input type = "text" name="val">
<input type = "submit">
</form> --%>

</body>
</html>