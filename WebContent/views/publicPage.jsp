<html>
<head>
<title>PublicPage</title>
</head>
<body>
	<jsp:include page="Menubar.jsp" />
<div id="bodyContent">
	<h3>Public Page welcomes you</h3>
	</div>
</body>
<script>
	$(document).ready(function() {
		$(".headerPart").text("Public Dashboard");
		$("title").text("SCS | Public");
		$("#bodyContent").appendTo($(".content-wrapper"));
	});
</script>
</html>