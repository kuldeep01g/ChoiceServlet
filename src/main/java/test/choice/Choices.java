package test.choice;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")

public class Choices extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String sb=req.getParameter("sb");
		
		if(sb.equals("Add")) {
			RequestDispatcher rd=req.getRequestDispatcher("ad");
			rd.forward(req, res);
		}else if(sb.equals(sb)){
			RequestDispatcher  rd=req.getRequestDispatcher("av");
			rd.forward(req, res);
			
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("ml");
			rd.forward(req, res);
		}
		
	}

}
