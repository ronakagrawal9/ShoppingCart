package com.events.in;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class display extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShoppingCart", "root",
					"root1234");
			Statement st = con.createStatement();

			PreparedStatement ps = con.prepareStatement("select * from adduser where name=?");
			ps.setString(1, name);
			out.print("<body background='images/soft.jpg'>");
			out.print("<table align=center width=80% border=1 margin-top=150px>");
			out.print("<caption>User Details:</caption>");

			ResultSet rs = ps.executeQuery();

			/* Printing column names */
			ResultSetMetaData rsmd = rs.getMetaData();
			int total = rsmd.getColumnCount();
			out.print("<tr>");
			for (int i = 1; i <= total; i++) {
				out.print("<th>" + rsmd.getColumnName(i) + "</th>");
			}

			out.print("</tr>");

			/* Printing result */

			while (rs.next()) {
				out.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "  </td><td>" + rs.getString(3)
						+ "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5)
						+ " <input type='checkbox'></td><td>" + rs.getString(6) + "<input type='checkbox'></td><td>"
						+ rs.getString(7)
						+ "<input type='checkbox'></td><td><button>Start Service</buuton></td><td><button>Stop Service</buuton></td></tr>");

			}
			out.print("</body>");
			out.print("</table>");

		} catch (Exception e2) {
			e2.printStackTrace();
		}

		finally {
			out.close();
		}

	}
}