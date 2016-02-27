<html>
<head>
<title>ReceptionPage</title>
</head>
<body>

		<jsp:include page="Menubar.jsp" />
<div id="bodyContent">
	<h3>Reception Page welcomes you</h3>
	</div>
</body>
<script>
	$(document).ready(function() {
		$(".headerPart").text("Reception Dashboard");
		$("title").text("SCS | Reception");
		$("#bodyContent").appendTo($(".content-wrapper"));
	});
</script>
</html>