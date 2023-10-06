<?php

//Programa que permita ingresar 5 números y calcular el promedio.

echo "a continuación calcularemos el promedio de 5 números.\n"; 
$numero = readline("Escriba el primer número: \n");
$numero2 = readline("Escriba el segundo número: \n");
$numero3 = readline("Escriba el tercer número: \n");
$numero4 = readline("Escriba el cuarto número: \n");
$numero5 = readline("Escriba el quinto número: \n");

$promedio = ($numero + $numero2 + $numero3 + $numero4 + $numero5)/5;

echo "El promedio de los numeros ingresados es: $promedio";

?>