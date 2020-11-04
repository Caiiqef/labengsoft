<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- <%@page import="java.util.List" %>
<%@page import="model.Usuario" %> -->
<!DOCTYPE html>
<html>
    <head> 
        <title> Usuarios </title>
        <meta charset="utf-8">
    </head>
    <body>        
        <%
			List<Usuario> users = (List<Usuario>) request.getAttribute("users");
            for(Usuario user: users){
                out.print("Usuário: " + user.getNome() + "<br/>");                
            } 		
        %>
    </body>    
</html>