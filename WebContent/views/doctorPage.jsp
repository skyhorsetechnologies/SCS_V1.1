<html>
<head>

<title>DoctorPage</title>
</head>
<body>

	<jsp:include page="Menubar.jsp" />

<div id="bodyContent">
	<h3>Doctor Page welcomes you</h3>
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