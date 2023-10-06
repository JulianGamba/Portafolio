<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="Style.css" rel="stylesheet">
    <title>iMC</title>
</head>

<body>
    <div id="estilos">
    <form name="formulario" action="IMC.php" method="post">
            <label>Escriba la estatura en        metros</label>
            <input type="number" step="0.001" id="talla" name="talla" required>

            <label>Escriba el peso en kilogramos</label>
            <input type="number" step="0.001" id="peso" name="peso" required>

            <button type="submit">Enviar</button>
    </form>
</body>
<br>
Su talla es
<?php print $_POST['talla']; ?> y su peso es 
<?php print $_POST['peso'];?><br>

<?php 
$talla = $_POST['talla'];
$peso = $_POST['peso'];
$imc = $peso/($talla*$talla);

if ($imc < 18.5 and $imc > 0){
    echo"Su IMC es $imc, usted está en estado de desnutrición";
} else if ($imc >= 18.5 and $imc <= 24.9){
    echo"Su IMC es $imc, usted está en estado de normalidad";
} else if ($imc >= 25 and $imc <= 29.9){
    echo"Su IMC es $imc, usted está en estado de sobrepeso";
} else if ($imc >= 30 and $imc <= 34.9){
    echo"Su IMC es $imc, usted está en estado de obesidad I";
} else if ($imc >= 35 and $imc <= 34.9){
    echo"Su IMC es $imc, usted está en estado de obesidad II";
} else if ($imc >= 40 and $imc <= 49.9){
    echo"Su IMC es $imc, usted está en estado de obesidad III";
} else if ($imc >= 50){
    echo"Su IMC es $imc, usted está en estado de obesidad IV";
} else {
    echo"Valor incorrecto";
}

?>
</div>

</html>