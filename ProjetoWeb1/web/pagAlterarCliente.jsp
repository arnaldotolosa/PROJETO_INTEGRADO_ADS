<%-- 
    Document   : pagAlterarCliente
    Created on : 12/05/2021, 14:33:31
    Author     : PC - SAMSUNG
--%>
<%@page import="controller.ClienteControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Cliente"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            for (Cliente c : new ClientControl().listar("where id")) {
        %>
        <h1>Alterar</h1>
        <form name="formAlterar" method="post">
            <label>ID</label>
            <input type="text" name="id" value="<%=c.getId()%>" readonly="true" />
            <br />
            <label>Nome</label>
            <input type="text" name="nome" value="<%=c.getNome()%>" />
            <br />
            <input type="text" name="idade" value="<%=c.getIdade()%>" />
            <br />
            <input type="submit" name="alterar" value="Alterar"
           onclick="return confirm('Deseja realmente alterar?')"  />
        </form>
            <%
                }
                   try {
                       String id2 = request.getParameter("id");
                       String nome = request.getParameter("nome");
                       String idade = request.getParameter("idade"); 
                       new ClienteControl().alterar(nome, idade, id2);
                       response.sedRedirect("pagListarCliente.jsp");
}catch (Exception e){                
            %>
    </body>
</html>
