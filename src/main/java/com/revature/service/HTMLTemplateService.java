package com.revature.service;

public class HTMLTemplateService implements HTMLTemplate {
	@Override
	public String displayHeader() {
		return "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"utf-8\">\r\n"
				+ "<title>Marvel Superhumans</title>\r\n" + "	<link rel=\"stylesheet\"\r\n"
				+ "		href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\r\n"
				+ "		integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\r\n"
				+ "		crossorigin=\"anonymous\">\r\n" + "\r\n"
				+ "<link rel=\"icon\" type=\"image/x-icon\" href=\"index.ico\">\r\n" + "</head>\r\n"
				+ "<body class=\"text-center\" style='background-color: #F0F0F0;'>";
	}
 
	public String displayNav() {
		return "<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\" style='margin-bottom: 60px;'>\r\n" + 
				"		<a class=\"navbar-brand\" href='http://localhost:8080/Project1.0/'> <img\r\n" + 
				"			src=\"https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2F2.bp.blogspot.com%2F-CfcNNFkQgKg%2FVVA2-IZrYMI%2FAAAAAAAACW4%2F2UKFilGssf0%2Fs1600%2FMarvel-comics-logo-vector.png&f=1&nofb=1\"\r\n" + 
				"			alt=\"Smiley face\"  height=\"110\" width=\"240\">\r\n" + 
				"		</a>\r\n" + 
				"		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
				"			data-target=\"#navbarSupportedContent\"\r\n" + 
				"			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n" + 
				"			aria-label=\"Toggle navigation\">\r\n" + 
				"			<span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"		</button>\r\n" + 
				"\r\n" + 
				"		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n" + 
				"			<!-- Nothing to see -->\r\n" + 
				"		</div>\r\n" + 
				"	</nav>";
	}

	@Override
	public String displayFooter() {
		return "	<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\r\n"
				+ "		integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n" + "	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\r\n"
				+ "		integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n" + "	<script\r\n"
				+ "		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\r\n"
				+ "		integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n" + "\r\n" + "\r\n" + "</body>";
	}

}
