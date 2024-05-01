package guide;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Objects;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JokeServlet extends HttpServlet {
    private final String FEEDBACK_KEY = "feedback";
    private final String REACTION_KEY = "reaction";

    private String[][] jokes;
    
    public void init() throws ServletException {      
        jokes = new String[][] {
            {"What is a tree's favorite soda?", "Root Beer."},
            {"What do you call a bear with no teeth?", "A gummy bear"},
            {"Can February March?", "No, but April May!"},
            {"What type of computer sings the best?", "A Dell"},
            {"What do you call an iPhone charger?", "Apple juice"},
            {"What do runners eat before a race?", "Nothing they fast"},
            {"Why can't your nose be 12 inches long?", "Because it'd be a foot!"},
        };
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int selectionIndex = new Random().nextInt(jokes.length);
        String[] jokeArray = jokes[selectionIndex];
        
        Helper helper = new Helper();
        request.setAttribute("serviceInfo", helper.getServiceInfo(this.getClass()));
        request.setAttribute("jokeQuestion", jokeArray[0]);
        request.setAttribute("jokeAnswer", jokeArray[1]);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jokes.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new IOException(e);
        } 
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String feedback = request.getParameter(FEEDBACK_KEY);
        String reaction = request.getParameter(REACTION_KEY);


        PrintWriter out = response.getWriter();  

        out.println("<html>");   
        out.println("<head><title>Jokes Feedback</title></head>");   
        out.println("<body bgcolor = \"#D6FDFF\">");  

        out.println("<h1>" + "Thank you for your feedback" + "</h1>");  
        
        if(Objects.isNull(feedback) || feedback.isBlank()){
            feedback = "You did not have any feedback";
        }else{
            feedback = "Your reaction was: \"" + feedback+"\"";
        }

        if(Objects.isNull(reaction) || feedback.isBlank()){
            reaction = "You did not have any reaction";
        }else{
            reaction = "You " + (reaction.equals("yes") ? "liked": "did not like") + " the joke";
        }

        out.println("<p>" + reaction + "</p>");  
        out.println("<p>" + feedback + "</p>");
        out.println("<button type=\"button\" onclick=\"window.location.href=/joke/\">" + "Show another joke" + "</button>");        
        out.println("<p><small>" + Helper.getServiceInfo(this.getClass()) +"</small></p>"); 

        out.println("</body>"); 
        out.println("</html>"); 
    }
}
