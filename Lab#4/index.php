<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" type="text/css" href="/styles/top_style.css">
		<script>
			function showMeteo(str){
				if (str == "") {
					document.getElementById("listofMeteo").innerHTML = "<br>";
					return;
				 } else {
					if (window.XMLHttpRequest) {
						// code for IE7+, Firefox, Chrome, Opera, Safari
						xmlhttp = new XMLHttpRequest();
					} else {
						// code for IE6, IE5
						xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
					 }
					xmlhttp.onreadystatechange = function() {
						if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
							document.getElementById("listofMeteo").innerHTML = xmlhttp.responseText;
						 }
					};
					xmlhttp.open("GET","process.php?getby="+str,true);
					xmlhttp.send();
				}
			}
		</script>
	</head>

	<body onload=showMeteo("2016-04-16") bgcolor="#EEEEEE">
		<div class="Page">
			<div>
				<div class="TopLeft" ></div>
				<div class="TopCenter" ></div>
				<div class="TopRight" ></div>
			</div>
			<div class="Block">
				<div class="Title">Arhivă Meteo</div>
				<div class="TopBody">
					<p>Alege data, începînd cu care se vor afişa prognozele meteo pentru 3 zile, în Chişinău.</p>
					<form>
						<input type="date" name="date"  value="2016-04-16" min="2016-04-16" max="2016-04-23" onchange="showMeteo(this.value)" />
					</form>
				</div>
				<div id="listofMeteo" />
			</div>
		</div>
	</body>
</html>