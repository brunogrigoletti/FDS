<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>TESTE DE JSP</title>
 </head>
 <body>
 <h1>HelloWorld, <%= request.getParameter("NOME")%>!!</h1>
 </body>
</html>