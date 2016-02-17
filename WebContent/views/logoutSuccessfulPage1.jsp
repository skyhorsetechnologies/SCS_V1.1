<html>
<head><title>Logout1</title></head>
<body>
  <h1>Logout Successful here!</h1>
</body>

<a href="${pageContext.request.contextPath}/">Homepage</a>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</html>