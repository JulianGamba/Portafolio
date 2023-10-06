<?php

//Calcular la hipotenusa con el Teorema de Pitágoras.

echo "a continuación calcularemos la hipotenusa de un triangulo.\n"; 
$catetoa = readline("Escriba el cateto a: \n");
$catetob = readline("Escriba el cateto b: \n");

$hipotenusa = ($catetoa ** 2) + ($catetob ** 2);

$resultado = $hipotenusa ** 0.5;

echo "La hipotenusa del triangulo es igual a: $resultado";

?>