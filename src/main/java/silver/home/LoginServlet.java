package silver.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import silver.home.persistence.LoginManager;

/**
 * @author mountassirbrahim
 *
 */



public class LoginServlet extends HttpServlet {

	

	
    RequestDispatcher dispatcher;

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * TODO
     * void
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String email = request.getParameter("email");
            String pass = request.getParameter("password");
            System.out.println("Email : "+email+" ::: Pass : "+pass);
            LoginManager manager=new LoginManager();
            if (manager.isValidLogin(email, pass)) {;
                request.setAttribute("email", email);
                dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request,response);

                //response.sendRedirect("index.jsp");
            } else {
                //error login
                response.sendRedirect("login.jsp");
                dispatcher = request.getRequestDispatcher("login.jsp");
            }

        } finally {
            out.close();
        }
    }

  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
}
