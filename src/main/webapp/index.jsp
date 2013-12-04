<jsp:useBean id="someClass" class="ch.born.EchoService" />
<html>
<body>
	<h2><%=someClass.sendMessage()%></h2>
</body>
</html>
