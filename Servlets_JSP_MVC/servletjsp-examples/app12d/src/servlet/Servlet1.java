package servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet1" })
@ServletSecurity(@HttpConstraint(rolesAllowed = "manager"))
public class Servlet1 extends HttpServlet {

    private static final long serialVersionUID = -11420L;

    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException,
            IOException {
    	if(request.getParameter("inputName")!=null && (request.getParameter("inputName").trim().equalsIgnoreCase("Logout"))){
    		request.logout();
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/logout.html");
        	dispatcher.forward(request,  response);
    	}else{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/1.jsp");
        	dispatcher.forward(request,  response);
    	}
    }
}