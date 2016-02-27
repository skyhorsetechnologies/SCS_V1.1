<html>
<head>
<title>PharmacyPage</title>
</head>
<body>

	<jsp:include page="Menubar.jsp" />
<div id="bodyContent">
	<h3>Pharmacy Page welcomes you</h3>
	</div>
</body>
<script>
	$(document).ready(function() {
		$(".headerPart").text("Pharmacy Dashboard");
		$("title").text("SCS | Pharmacy");
		$("#bodyContent").appendTo($(".content-wrapper"));
	});
</script>
</html>