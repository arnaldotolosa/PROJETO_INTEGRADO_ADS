<%@page import="controller.ClienteControl"%>
<%
// o getParameter pega o ID da  URL vindo da pagina Listar
    String id = request.getParamenter("id");
//chama o m�todo deletar
    new ClienteControl().deletar("Where id=" + id);
//O comando sendRedirect chama a p�gina listar  
    response.sendRedirect ("pagListarCliente.jsp");
%>