import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/AppServlet"})
public class primeiroServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try{
            PrintWriter pw = resp.getWriter();
            pw.write("Wep App - Servlet <br>");
            pw.write(new String ("Nome e RA: ".getBytes(), "UTF-8") + "Caique Fernandes | 1460481821013 <br>"); 
            pw.write("Professor: Fabricio Galende Marques");
            // pw.write("Nome: Caíque Fernandes!");
        }catch(IOException ioe){
            System.out.println("Impossível escrever na resposta.");
        }
        
    }
}