package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.HTMLTemplateService;
import com.revature.service.UpdateSuperhumanService;

/**
 * Servlet implementation class shUpdateServlet
 */
@WebServlet("/shUpdateServlet")
public class ShUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShUpdateServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HTMLTemplateService htmlTemplate = new HTMLTemplateService();
		UpdateSuperhumanService updateService = new UpdateSuperhumanService();
		String superid = request.getParameter("superhero_id");
		String superheroName = request.getParameter("superhero_name");
		String alias = request.getParameter("superhero_alias");
		String hometown = request.getParameter("superhero_hometown");
		String nemesis = request.getParameter("superhero_nemesis");
		String affiliationid = request.getParameter("superhero_affiliationid");

			
		updateService.updateSuperhuman(Integer.parseInt(superid), superheroName, alias, hometown, nemesis,
				Integer.parseInt(affiliationid));
		
		out.println(htmlTemplate.displayHeader());

		out.println(htmlTemplate.displayNav());
		out.println("<h2>Superhuman Updated...</h2>");
		out.println("<a href='http://localhost:8080/Project1.0/'>HOME</a>");
		out.println(htmlTemplate.displayFooter());
		doGet(request, response);
	}

}
