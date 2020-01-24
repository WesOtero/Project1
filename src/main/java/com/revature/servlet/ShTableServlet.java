package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.pojo.Superhuman;
import com.revature.service.HTMLTemplateService;
import com.revature.service.ViewAllSuperhumanService;

/**
 * Servlet implementation class shTableServlet
 */
@WebServlet("/shTableServlet")
public class ShTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShTableServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HTMLTemplateService htmlTemplate = new HTMLTemplateService();
		PrintWriter out = response.getWriter();
		ViewAllSuperhumanService viewAllSuperServ = new ViewAllSuperhumanService();
		List<Superhuman> superhumans = viewAllSuperServ.readAllSuperhumans();

		out.println(htmlTemplate.displayHeader());	
		out.println(htmlTemplate.displayNav());
		out.println("<h2>Superhumans:</h2>");	
		out.println("<table  class='table'>");
		out.println("<tr>");
		out.println("<th scope='col'>ID</th>");
		out.println("<th scope='col'>Name</th>");
		out.println("<th scope='col'>Alias</th>");
		out.println("<th scope='col'>Hometown</th>");
		out.println("<th scope='col'>Nemesis</th>");
		out.println("<th scope='col'>Affiliation</th>");
		out.println("</tr>");
		
		for (Superhuman superhuman : superhumans) {
			out.println("<tr scope='row'>"+
					"<td>" + superhuman.getSuperid() + "</td>"+"<td>" + superhuman.getSuperName() + "</td> <td>" + superhuman.getAlias() + "</td> <td>" + superhuman.getNemesis()
							+ "</td> <td>" + superhuman.getHometown() + "</td> <td>" + superhuman.getAlignment() + "</td></tr>");
		}
		
		response.setContentType("text/html");
		
		out.println(htmlTemplate.displayHeader());
		out.println("<a href='http://localhost:8080/Project1.0/'>HOME</a>");
		out.println(htmlTemplate.displayFooter());

	}

}
