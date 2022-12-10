package guide;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
    private String mainMessage; 
    
    public void init() throws ServletException {      
        mainMessage = "Welcome";   
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();   
        
        out.println("<html>");   
        out.println("<head><title>Welcome</title></head>");   
        out.println("<body bgcolor = \"#FFD6FD\">");  

        out.println("<h1>" + mainMessage + "</h1>");      
        out.println("<p>" + "This is an example java servlet website that you may use to as a template to build your super awesome java webapp!" + "</p>"); 
        out.println("<p><small>" + "The button below is an example of how to link two sevlets or webpages together with a button. Click the button to hear a joke." + "</small></p>"); 
        
        out.println("<button type=\"button\" onclick=\"window.location.href=/joke/\">" + "Click me to hear a joke" + "</button>");    
        
        out.println("<p><small>" + Helper.getServiceInfo(this.getClass()) +"</small></p>"); 
        out.println("</body>"); 
        out.println("</html>"); 
    }
}
