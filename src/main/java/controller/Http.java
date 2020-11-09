package controller;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DoencaService;
import model.Doenca;
import model.Ocorrencia;
import model.EpidemService;
import java.util.List;

@WebServlet({"*.action","/"})
public class Http extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                       HttpServletResponse res){
        
        String path = req.getServletPath();
        ServletContext sc = req.getServletContext();
        DoencaService us = new DoencaService();      
          
        List<Doenca> doenca = us.list();			
		req.setAttribute("doencas", doenca);
        switch (path){
            case "/":
               try{
                    sc.getRequestDispatcher("/jsp/index.jsp").forward(req, res);
                } catch (Exception e){}
               break;
            case "/teste":
                try{
                    sc.getRequestDispatcher("/jsp/teste.jsp").forward(req, res);
                } catch (Exception e){}
                break;
            case "/listar":
                try{
                    sc.getRequestDispatcher("/jsp/list.jsp").forward(req, res);
                } catch (Exception e){}
                break;
            case "/criar":
                try{
                    sc.getRequestDispatcher("/jsp/criar.jsp").forward(req, res);
                } catch (Exception e){}
                break;
            default:
                try{
                   sc.getRequestDispatcher("/jsp/notfound.jsp").forward(req, res);
                }catch (Exception e){}               
        }
        
    }  

    @Override
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res) {
        String path = req.getServletPath();
        ServletContext sc = req.getServletContext();
        switch (path) {
            case "/criar":
                try {
                    DoencaService ds = new DoencaService();

                    String nome = req.getParameter("nome");
                    String sintomas = req.getParameter("sintomas");
                    ds.create(nome, sintomas);
                    res.sendRedirect("/App Servlet/listar");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                try {
                    sc.getRequestDispatcher("/jsp/notfound.jsp").forward(req, res);
                } catch (Exception e) {
                }
        }
    }
}