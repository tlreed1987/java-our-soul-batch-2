package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi.qTESLA;


@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HelloWorld() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String name= request.getParameter("q");
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("<html>");
				pw.println("<head></head>");
				pw.println("<body>");
				pw.println("Hello <b>"+ name +"</b>, Welcome to Emonics Academy");
				pw.println("</body>");
				pw.println("</html>");
				pw.close();
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
