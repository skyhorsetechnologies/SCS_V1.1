<html>
<head>
<title>MasterPage</title>
</head>
<body>
	<jsp:include page="Menubar.jsp" />
<div id="bodyContent">
	<h3>Master Page welcomes you</h3>
	</div>
</body>
<script>
	$(document).ready(function() {
		$(".headerPart").text("Master Dashboard");
		$("title").text("SCS | Master");
		$("#bodyContent").appendTo($(".content-wrapper"));
		
	});
</script>
</html>