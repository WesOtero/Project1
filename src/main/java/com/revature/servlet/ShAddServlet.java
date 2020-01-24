package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.AddSuperhumanService;
import com.revature.service.HTMLTemplateService;

/**
 * Servlet implementation class shAddServlet
 */

@WebServlet("/shAddServlet")
public class ShAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShAddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// Adds a hero
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String superheroName = request.getParameter("superhero_name");
		String alias = request.getParameter("superhero_alias");
		String hometown = request.getParameter("superhero_hometown");
		String nemesis = request.getParameter("superhero_nemesis");
		Integer affiliationid = Integer.parseInt(request.getParameter("superhero_affiliationid"));
		AddSuperhumanService addSuperServ = new AddSuperhumanService();
		
		addSuperServ.addSuperuhman(superheroName, alias, hometown, nemesis, affiliationid);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HTMLTemplateService htmlTemplate = new HTMLTemplateService();
		
		out.println(htmlTemplate.displayHeader());

		out.println(htmlTemplate.displayNav());
		out.println("<h2>Superhuman Added...</h2>");
		out.println("<a href='http://localhost:8080/Project1.0/'>HOME</a>");
		out.println(htmlTemplate.displayFooter());
//		doGet(request, response);	
	}

}
