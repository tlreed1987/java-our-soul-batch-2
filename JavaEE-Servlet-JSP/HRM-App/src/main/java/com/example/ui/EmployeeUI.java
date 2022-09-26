package com.example.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.pojos.Employee;


public class EmployeeUI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmployeeUI() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//print the response in HTML
		HttpSession s=req.getSession();
		Employee e=(Employee) s.getAttribute("emp");
		int id=(Integer) s.getAttribute("empid");
		PrintWriter pw=res.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		if(e!=null) {
			pw.println("<p><b>Employee Id : </b>"+e.getId());
			pw.println("<p><b>Name        : </b>"+e.getName());
			pw.println("<p><b>Salary      : </b>"+e.getSalary());
			pw.println("<p><b>Dept Id : </b>"+e.getDeptId());
		}else {
			pw.println("<p><b> Employee with Id "+ id+" doesnt exist");
		}
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
