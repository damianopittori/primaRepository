<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%ArrayList<String> listaNazioni = (ArrayList<String>) request.getAttribute("listaCode");%>
	<%ArrayList<String> lista = (ArrayList<String>) request.getAttribute("listaCity");%>
	<%if (listaNazioni != null) {%>
	<form action="ccc" method="post">
		<div>
			<select name="code">
				<option value="0" selected>(Seleziona la nazione:)</option>
				<%for (String name : listaNazioni) {%>
				<option value="<%=name%>">
					<%=name%>
				</option>
				<%	}	%>
			</select>
			<div>
				<input type="submit" value="Scegli">
			</div>
	</form>
	<%	}	%>
	<%if (lista != null) {%>
	La lista delle città della nazione scelta è:
	<br>
	<%for (String nome : lista) {%>
	<%=nome%>
	<br>
	<%	}	%>
	<%	}	%>
</body>
</html>