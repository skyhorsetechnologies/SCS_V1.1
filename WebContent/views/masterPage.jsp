<html>
<head>
<title>MasterPage</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
	<jsp:include page="Menubar.jsp" />
<div id="bodyContent">
	
	<%-- <form:form action="getMasterData.action" commandName="MasterData" method="POST">
	
	
	<form:input type="text" path="CLID" class="input form-control" placeholder="Client Id"></form:input>   
	<button type="submit">click me</button>
	</form:form> --%>
	
	<button id="btn" type="button">CLICK ME/12..!!!</button>
	
	
	
	
	</div>
</body>
<script>

   function testme()
   {
	   
	   
	   
   }


	$(document).ready(function() {
		$(".headerPart").text("Master Dashboard");
		$("title").text("SCS | Master");
		$("#bodyContent").appendTo($(".content-wrapper"));

		   
		   $.ajax({
			   url: "getMasterData.action", 
			   beforeSend: function( xhr ) {alert("ready to send");},
			   success: function(result){
		       alert(result);
		      },
		      error:function(error){
		    	  alert(error);
		      },
		      complete:function(completed){alert("completed");}
		   }); 

		
		
		
		
		
		
	});
</script>
</html>