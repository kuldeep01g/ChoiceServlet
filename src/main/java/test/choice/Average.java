package test.choice;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/av")

public class Average extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int x=Integer.parseInt(req.getParameter("v1"));
		int y=Integer.parseInt(req.getParameter("v2"));
		float z=(float)(x+y)/2;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("The Average is :"+z+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
		
		/*
		int x=Integer.parseInt(req.getParameter("v1"));
		int y=Integer.parseInt(req.getParameter("v2"));
		int z=x+y;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("The Sum is : "+z+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
		 */
	}

}
