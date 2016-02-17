<html>
<head><title>Login</title></head>
<body>
 
 	<br /> Please enter your username and password to login ! <br /> <span
				style="color: red">${message}</span> <br />
		
 <form name='f' action="j_spring_security_check" method='POST'>
    <table>
       <tr>
          <td>User:</td>
          <td><input type='text' name='username' value=''></td>
       </tr>
       <tr>
          <td>Password:</td>
          <td><input type='password' name='password' /></td>
       </tr>
       <tr>
          <td><input name="submit" type="submit" value="submit" /></td>
       </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>