package webapp2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ItaliaFranciaGermania extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false", "root",
					"root");

			Statement createStatement = connection.createStatement();

			ResultSet resultSet = createStatement.executeQuery("select name from city where countrycode ='DEU'");
			while (resultSet.next()) {
				Paesi.getGer().add(resultSet.getString("name"));
			}
			ResultSet resultSet1 = createStatement.executeQuery("select name from city where countrycode ='FRA'");
			while (resultSet1.next()) {
				Paesi.getFra().add(resultSet1.getString("name"));
			}
			ResultSet resultSet2 = createStatement.executeQuery("select name from city where countrycode ='ITA'");
			while (resultSet2.next()) {
				Paesi.getIta().add(resultSet2.getString("name"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String attribute = request.getParameter("attribute");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/newcity.jsp");
		if (attribute.equals("ITA")) {

			request.setAttribute("lista", Paesi.getIta());
		} else if (attribute.equals("FRA")) {
			request.setAttribute("lista", Paesi.getFra());
		} else if (attribute.equals("DEU")) {
			request.setAttribute("lista", Paesi.getGer());
		} else {

			dispatcher = request.getRequestDispatcher("/altra.jsp");
			request.setAttribute("stringa", "torna indietro e inserisci valore corretto");

		}
		dispatcher.forward(request, response);
	}
}