<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- External css added by Prem for Menubar alignments -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Menubar/Menubar.css">
<!-- Ends here External css added by Prem for Menubar alignments -->
<!-- ************************************************************************************ -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Plugin CSS for Menubar Template -->
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Template/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Template/_all-skins.css">
<!-- Material Design fonts -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/icon?family=Material+Icons">

  <!-- Bootstrap Material Design -->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/material/bootstrap-material-design.css">
  
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/material/ripples.min.css">
</head>
<body class="hold-transition skin-blue sidebar-mini sidebar-collapse">
	<div class="wrapper">
		<header class="main-header">

			<a href="index2.html" class="logo"> <span class="logo-mini"><b>SCS</b></span>

				<span class="logo-lg"><b>SmartClinicSystem</b></span>
			</a>
			<nav class="navbar navbar-static-top" role="navigation">

				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a> <label class="navbar-brand headerPart" style=""></label>
				<div class="navbar-custom-menu">

					<ul class="nav navbar-nav">
						<li class="dropdown user user-menu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"> <img src="dist/img/user2-160x160.jpg"
								class="user-image" alt="User Image"> <span
								class="hidden-xs">${AUTH_USER}</span>
						</a>
							<ul class="dropdown-menu">

								<li class="user-header"><img
									src="dist/img/user2-160x160.jpg" class="img-circle"
									alt="User Image">
									<center><b>Login Time</b>
									<p>
										${LoginTime} <br>
										
									</p>
									</center>
									</li>

								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="">
									<center>
										<a href="#" class="btn btn-default btn-flat">View Profile</a>
									</center>
									</div>
									<!-- <div class="pull-right">
										<a href="#" class="btn btn-default btn-flat">Sign out</a>
									</div> -->
								</li> 
							</ul></li>
						<!-- Logout button -->
						<li><a
							href="${pageContext.request.contextPath}/j_spring_security_logout"><i
								class="fa fa-power-off"></i></a></li>


						<!-- Control Sidebar Toggle Button -->
						<li><a href="#" data-toggle="control-sidebar"><i
								class="fa fa-gears"></i></a></li>
					</ul>
				</div>
			</nav>
			
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</header>
		<aside class="main-sidebar">
			<section class="sidebar">
				<div class="user-panel">
					<div class="pull-left image">
						<img src="dist/img/user2-160x160.jpg" class="img-circle"
							alt="User Image">
					</div>
					<div class="pull-left info">
						<p>${AUTH_USER}</p>
						<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
					</div>
				</div>
				<!-- <form action="#" method="get" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="q" class="form-control"
							placeholder="Search..."> <span class="input-group-btn">
							<button type="submit" name="search" id="search-btn"
								class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form> -->

				<ul class="sidebar-menu">
					<li class="header">MAIN MENU LIST</li>
					<li class="active treeview"><a href="Position.html"> <i
							class="fa fa-home"></i> <span style="z-index: 3000 !important;">HOME</span>
					</a></li>
					<li class="treeview"><a href="#"> <i class="fa fa-ship"></i>
							<span>DOCTOR</span> <span class="label label-primary pull-right">4</span>
					</a></li>
					<li class="treeview"><a href="#"> <i
							class="fa fa-credit-card"></i> <span>AP</span> <span
							class="label label-primary pull-right">0</span>
					</a></li>
					<li class="treeview"><a href="#"> <i class="fa fa-money"></i>
							<span>AR</span> <span class="label label-primary pull-right">0</span>
					</a></li>
					<li class="treeview"><a href="#"> <i
							class="fa fa-pencil-square-o"></i> <span>AUDITING</span> <span
							class="label label-primary pull-right">0</span>
					</a></li>
					<li class="treeview"><a href="#"> <i
							class="fa fa-building-o"></i> <span>LOG</span> <span
							class="label label-primary pull-right">0</span>
					</a></li>

				</ul>
			</section>
		</aside>
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Create the tabs -->
			<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
				
			</ul>
			<!-- Tab panes -->
			<div class="tab-content">
				<!-- Home tab content -->
				<div class="tab-pane" id="control-sidebar-home-tab"></div>
			</div>
		</aside>


		<div class="content-wrapper"></div>
		
		<footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 1.0
        </div>
        <strong>Copyright &copy; 2016-2017 <a href="http://www.skyhorsetechnologies.com">Skyhorse Technologies</a>.</strong> All rights reserved.
      </footer>
	</div>


	<!-- Bootstrap and jquery Integration-->

	<script
		src="${pageContext.request.contextPath}/resources/jquery/jquery-2.1.4.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

	<!-- Ends here Bootstrap and jquery Integration -->
	<!-- ************************************************************************************ -->



	<!-- Ends here Plugin CSS for Menubar Template -->

	<!-- ************************************************************************************ -->
	<!-- Plugin JS for Menubar Template -->

	<!-- jQuery UI 1.11.4 -->
	<!-- <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
 -->
	<!-- <script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
 -->
	<!-- AdminLTE App -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/scripts/Template/app.js"></script>
	

	<!-- AdminLTE for demo purposes -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/scripts/Template/demo.js"></script>
	
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/scripts/material/material.min.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/scripts/material/ripples.min.js"></script>
	
	<!--Ends here Plugin JS for Menubar Template -->
	<!-- ************************************************************************************ -->


	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<!-- <script>
      $.widget.bridge('uibutton', $.ui.button);
</script> -->

	<!-- ************************************************************************************ -->

	<script>
		var AdminLTEOptions = {
			//Enable sidebar expand on hover effect for sidebar mini
			//This option is forced to true if both the fixed layout and sidebar mini
			//are used together
			sidebarExpandOnHover : false,
			//BoxRefresh Plugin
			enableBoxRefresh : true,
			//Bootstrap.js tooltip
			enableBSToppltip : true
		};
	</script>
</body>

</html>