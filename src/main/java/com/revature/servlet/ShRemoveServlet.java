package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.HTMLTemplateService;
import com.revature.service.RemoveSuperhumanService;

/**
 * Servlet implementation class shRemoveServlet
 */

@WebServlet("/shRemoveServlet")
public class ShRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShRemoveServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RemoveSuperhumanService removeService = new RemoveSuperhumanService();
		String superid = request.getParameter("superhero_id");
		removeService.removeSuperhuman(Integer.parseInt(superid));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HTMLTemplateService htmlTemplate = new HTMLTemplateService();

		out.println(htmlTemplate.displayHeader());

		out.println(htmlTemplate.displayNav());
		out.println("<h2>Superhuman Removed...</h2>");
		out.println("<a href='http://localhost:8080/Project1.0/'>HOME</a>");
		out.println(htmlTemplate.displayFooter());
		doGet(request, response);
	}

}
