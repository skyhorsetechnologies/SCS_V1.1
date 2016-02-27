<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>LoginPage</title>
<script src="resources/jquery/jquery-2.1.4.js"></script>
 <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
      <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
      
      
      <!-- Login css -->
      <link rel="stylesheet" href="resources/styles/login/style.css">
      
<style>

h1{
font-size: 1em !important;
color: red !important;
margin-top: 0px !important;
margin-bottom: 0px !important;
}

 body {
	background:url("resources/images/login/background.jpg") no-repeat center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
	position: relative;
	font-family: 'Open Sans', sans-serif;
	padding: 0;
	margin: 0;
	height: 100%;
	width: 100%;
} 
</style>
</head>
<body >
<!-- <div id="map"></div> -->

<div class="container col-lg-12" style="
    padding-top: 0px !important;
    padding-bottom: 0px !important;
    background-color:white !important;">
	<!-- <div id="map1" class="loginDiv well col-lg-12">
			
		</div> -->
		<div class="loginDiv col-lg-3" style="z-index:300000 !important; right: 30px;  top: 150px;  height: auto;">
			<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
			<div class="row">
				<div class=" form-box col-lg-12 ">
					<div class="form-top" style="background-color:#F5F5F5 !important;">
						<div class="form-top-left">
							<h3>Login</h3>
							<p>Enter your username and password to log on:</p>
							<span style="color: red">${message}</span>
						</div>
						<div class="form-top-right">
							<i class="fa fa-lock"></i>
						</div>
						
					</div>
					<div class="form-bottom" style="background-color:#5387C1 !important;">
						<form role="form" action="j_spring_security_check" method="post" class="login-form"
							name="userForm">
							
							<div class="form-group">

								<label class="sr-only" for="username">Username</label> <input
									type="text" required 
									name='username'
									placeholder="Username" class="form-username form-control"
									id="form-username" >
							</div>

							<div class="form-group">
								<label class="sr-only" for="password">Password</label> <input
									type="password" name="password" placeholder="Password"
									class="form-password form-control" id="form-password" required
									>
							</div>
							<button type="submit" class="btn btn-info" id="btnSubmit" ng-disabled="userForm.$invalid" >Sign
								in</button>
							
						</form>
					</div>
				</div>
			</div>
		</div>


</div>



<style>

.loginDiv{
right:0px;

}

.loginDiv {
 
  position: absolute;
  
}
.form-box {
    margin-top: 0px;
}

.well{


}
.form-top
{
padding-bottom:0px !important;
}
.backstretch
{
 background-color:transparent !important; 


}
.btn-info{
color:black !important;
background-color:#ddd !important
}

.btn-info:hover
{
color:white !important;
background-color:#31b0d5 !important;
}

.form-username:focus,.form-password:focus
{
border:2px solid #DDD !important;
}
</style>


</body>

<script>
/* function gotoMypage(id)
{
//alert("1"+id);	

//$("#btnSubmit").html("Logging in...");
	
}
 */
</script>
</html>

<%-- <html>
<head>
<title>Login</title>
</head>
<body>

	<br /> Please enter your username and password to login !
	<br />
	<span style="color: red">${message}</span>
	<br />

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
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
</body>
</html> --%>



