<%@page import="controller.ClienteControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar</title>
    </head>
    <body>
    <center>
        <h1> Listar Clientes</h1> 
        <table border="1" > <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Idade</th>
                    <th>Alterar</th>
                    <th>Excluir</th>
                </tr>
            </thead><tbody>
                <%
                    String query ="";
                    for (Cliente cl : new ClietControl ().listar(query)){
                %>
                <tr>
                    <td><%=cl.getId()%></td>
                    <td><%=cl.getNome()%></td>
                    <td><%=cl.getIdade()%></td>
                    <td> 
                        <a href="pagAlterarCliente.jsp?id=<%=cl.getId()%>">Alterar</a>
                    </td>
                    <td>
                        <a href="pagExcluirCliente.jsp?id=<%=cl.getId()%>"
                           onclick="return confirm('Deseja realmente excluir?')">Excluir</a>
                        
                    </td>
                </tr>
                <% } %> 
                    
            </tbody>  
        </table>
    </center>
    </body>
</html>
