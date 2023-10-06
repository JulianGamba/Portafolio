<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	$nombre = $_POST["nombre"];
	$correo = $_POST["correo"];

	echo "Nombre: " . $nombre . "
";
	echo "Correo electrónico: " . $correo;
	echo"\n";
}

//conexión a la base de datos

$servername = "localhost";
$username = "root";
$password = "LucesBonitas7.";
$dbname = "Correos";

// Establecer la conexión
$conn = mysqli_connect($servername, $username, $password, $dbname);

// Verificar la conexión
if (!$conn) {
    die("Error de conexión: " . mysqli_connect_error());
}
echo "Conexión exitosa";

// Para ejecutar consultas
    
$sql = "SELECT * FROM contactos";
$result = mysqli_query($conn, $sql);

if (mysqli_num_rows($result) > 0) {
  while($row = mysqli_fetch_assoc($result)) {
    echo "Nombre: " . $row["nombre"] . " - Email: " . $row["correo"] . " \n" ;
	echo"\n";
}
} else {
echo "0 resultados";
}
mysqli_close($conn);

?>