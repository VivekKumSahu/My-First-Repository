package helper_servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/Division")
public class Division extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try
		{
			int x=Integer.parseInt(req.getParameter("fnum"));
			int y=Integer.parseInt(req.getParameter("snum"));
			int z=x/y;
			pw.println("<h1>Division Of "+x+" And "+y+" Is "+z+"</h1><br>");
		}
		catch(Exception e)
		{
			pw.println("Enter Only Integer Values...<br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("Calculator.html");
		rd.include(req,res);
	}	
}