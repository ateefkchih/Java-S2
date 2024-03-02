package web;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

public class ImcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ImcServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//response.setContentType("text/html; charset=UTF-8");	
        float poids = Float.parseFloat(request.getParameter("poids"));
        float taille = Float.parseFloat(request.getParameter("taille"));

        Imc imc = new Imc(taille, poids);
        float res= imc.calcul();
        
			try (PrintWriter out = response.getWriter())
				{
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title> IMC-Servlet</title>");
	            out.println("</head>");
	            out.println("<body>");
	            out.println("IMC: " + res + "<br>");
	            out.println("</body>");
	            out.println("</html>");
			}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}