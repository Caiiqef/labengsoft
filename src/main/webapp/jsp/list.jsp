<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="model.Doenca" %>
<!DOCTYPE html>
<html>
    <head> 
        <title>Listar</title>
        <meta charset="utf-8">
    </head>
    <body> 
        <center>
        <%
			List<Doenca> doencas = (List<Doenca>) request.getAttribute("doencas");
            for(Doenca doenca: doencas){
                out.print("Doenca: " + doenca.getNome() + "<br/>");
                out.print("Sintomas: " + doenca.getSintomas() + "<br/>");
            } 		
        %>
        <a class="nav-link" href="/App Servlet/"> Voltar</a>
        </center>       
    </body>    
</html>