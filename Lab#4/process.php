<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" type="text/css" href="styles/response_style.css">
	</head>
	<body>
		<?php
			header('Content-type: text/html; charset=utf-8');
			setlocale(LC_TIME, "ro_utf8", "ro_RO.UTF-8", "ro_RO.utf-8", "ro", "ro_RO", "Romanian_Romania.1250");
			
			$date = $_GET['getby'];
			
			// Create connection
			$conn = new mysqli("localhost", "root", "", "weather_db");
			// Check connection
			if ($conn->connect_error) {
				die("Connection failed: " . $conn->connect_error);
			}

			$date_obj = new DateTime($date);
			$shown = false;
			
			for($x = 0; $x<3; $x++){		
				$sql = "SELECT * FROM `row` WHERE DATE='".$date."' ORDER BY `row`.`Time` ASC";
				$result = $conn->query($sql);

				if ($result->num_rows > 0) {			
					echo '<div class="Meteo">';
					if(!$shown){
						$shown = true;
						echo '<div class="Title1">';
						echo '<div class="Title1_Time"> <br></div>';
						echo '<div class="Title1_Temperature">Temperatura,<br>°C</div>';
						echo '<div class="Title1_Pressure">Pres. atm., mm/Hg</div>';
						echo '<div class="Title1_Wind">Viteza vânt. m/s</div>', '<br>', '</div>';	
					}
					
					echo '<div class="Title2">', utf8_encode(ucwords(strftime("%A, %d %B", strtotime($date)))), '</div>';
					
					while($row = $result->fetch_assoc()) {
						echo '<div class="Row">';
						echo '<div class="Time">', $row["Time"], '</div>';
						echo '<div class="Image">', '<img src="/images/', $row["Image"], '.png" alt="', $row["Image"], '" width="43" height="43" />', '</div>';
						echo '<div class="Temperature">', $row["Temperature"], '°</div>';
						echo '<div class="Pressure">', $row["Pressure"], '</div>';
						echo '<div class="Wind">', $row["Wind"], '</div>', '<br>';
						echo '</div>';
					}
					echo '</div>';
					
					$date_obj->modify('+1 day');
					$date = $date_obj->format('Y-m-d');			
				} else {
					echo '<br><div class="TopBody">Nu sunt date pentru ziua ', $date, ' în baza de date.</div>';
					break;
				}
			}
			 $conn->close();
		 ?>
	</body>
</html>