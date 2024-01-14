package main_servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/choice")
public class Choice_Class implements Servlet
{
     public void init(ServletConfig sc) throws ServletException
     {
    	 
     }
     
     public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
     {
    	  String s1=req.getParameter("s1");
    	  if(s1.equals("Addition"))
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Addition");
    		  rd.forward(req,res);
    	  }
    	  else if(s1.equals("Subtraction"))
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Subtraction");
    		  rd.forward(req,res);
    	  }
    	  else if(s1.equals("Multiplication"))
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Multiplication");
    		  rd.forward(req,res);
    	  }
    	  else if(s1.equals("Division"))
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Division");
    		  rd.forward(req,res);
    	  }
    	  else if(s1.equals("Modulo Division"))
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Modulo_Division");
    		  rd.forward(req,res);
    	  }
    	  else if(s1.equals("Greater Value"))
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Greater_Value");
    		  rd.forward(req,res);
    	  }
    	  else
    	  {
    		  RequestDispatcher rd=req.getRequestDispatcher("Smaller_Value");
    		  rd.forward(req,res);
    	  }
     }
     
     public void destroy()
     {
    	 
     }
     
     public String getServletInfo()
     {
    	 return ""; 
     }
     
     public ServletConfig getServletConfig()
     {
    	 return this.getServletConfig();
     }
}