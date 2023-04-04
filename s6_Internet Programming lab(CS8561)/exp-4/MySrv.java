import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MySrv extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
    out.println("<HTML>");
    out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
    out.println("<BODY>");

    // Getting HTML parameters from Servlet
    String username = request.getParameter("uname");
    String password = request.getParameter("pwd");

    if((username != null && username.equals("user")) && (password != null && password.equals("pswd"))) {
      out.println("<h1> Welcome to " + username + "</h1>");
    } else {
      out.println("<h1> Login failed </h1>");
      out.println("<a href='./index.html'>Click for Home page</a>");
    }

    out.println("</BODY>");
    out.println("</HTML>");
    out.close();
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
  }
}
