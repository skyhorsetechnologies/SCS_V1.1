<html>
<head>
<title>AdminPage</title>
</head>
<body>
	<jsp:include page="Menubar.jsp" />
	<div id="bodyContent">
	<h3>Admin Page welcomes you</h3>
	 <div class="jumbotron">
  <h1>Jumbotron</h1>

  <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>

</div>
	</div>
   
</body>

<script>
	$(document).ready(function() {
		$(".headerPart").text("Admin Dashboard");
		$("title").text("SCS | Admin");
		$("#bodyContent").appendTo($(".content-wrapper"));
	});
</script>

</html>