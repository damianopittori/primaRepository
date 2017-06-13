package webapp2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryCity extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false","root","root");
		    Statement createStatement = connection.createStatement();
		    
		    ResultSet resultSet =createStatement.executeQuery("select code from country");
		    ArrayList<String> listaCode= new ArrayList<String>();
		    while(resultSet.next()){
			    String code=resultSet.getString("code");
			    listaCode.add(code);
		       
			
		    }
		    request.setAttribute("listaCode", listaCode);
		    RequestDispatcher dispatcher= request.getRequestDispatcher("/cc.jsp");
		    dispatcher.forward(request, response);
		  
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
    		
    		String attribute = request.getParameter("code") ;
    		
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false","root","root");
		    PreparedStatement prepared=connection.prepareStatement("select name from city where CountryCode=?" );
		    prepared.setString(1,attribute);
		    ResultSet resultSet=prepared.executeQuery();
		    ArrayList<String> listaCity= new ArrayList<String>();

		     while(resultSet.next()){
			    String nome=resultSet.getString("name");
			    listaCity.add(nome);
		       
			
		    }
		    request.setAttribute("listaCity", listaCity);
		    RequestDispatcher dispatcher= request.getRequestDispatcher("/cc.jsp");
		    dispatcher.forward(request, response);
		  
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
				super.doPost(request, response);
	}

}
