    
<%@page import="controller.ClienteControl"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastrar</h1>
        <form name="formCadastro" method="post">
            <label> Nome </label>
            <input type="text" name="nome" />
            <br />
            <label> Idade </label>
            <input type="text" name="idade" />
            <br />
            <input type="submit" name="salvar" value="Salvar" />
            </form>
        <%
            try {
                string nome = request.getParameter("nome");
                String idade = request.getParameter("idade");
                new clientControl().adicionar (nome, idade);
                out.printIn("Gravado");
            }   catch (Exception e){
            }
           
            %>    
    </body>
</html>
