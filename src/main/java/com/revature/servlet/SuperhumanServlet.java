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
import com.revature.service.AddSuperhumanService;
import com.revature.service.ViewAllSuperhumanService;

/**
 * Servlet implementation class SuperhumanServlet
 */

@WebServlet("/superhumanServlet")
public class SuperhumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SuperhumanServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		ViewAllSuperhumanService viewAllSuperServ = new ViewAllSuperhumanService();
		List<Superhuman> superhumans = viewAllSuperServ.readAllSuperhumans();
		response.getWriter().append("Super Humans");

		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		for (Superhuman superhuman : superhumans) {
			out.println(
					"<li>" + superhuman.getSuperName() + ", " + superhuman.getAlias() + ", " + superhuman.getNemesis()
							+ ", " + superhuman.getHometown() + ", " + superhuman.getAlignment() + "</li>");
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
		String superheroName = request.getParameter("superhero_name");
		String alias = request.getParameter("superhero_alias");
		String hometown = request.getParameter("superhero_hometown");
		String nemesis = request.getParameter("superhero_nemesis");
		String affiliationid = request.getParameter("superhero_afiliationid");
		AddSuperhumanService addSuperServ = new AddSuperhumanService();
		addSuperServ.addSuperuhman(superheroName, alias, hometown, nemesis, Integer.parseInt(affiliationid));
	}

}
