<?php

//Programa que solicite un número al usuario y permita calcular la raíz cuadrada del mismo (sin usar función). 


echo "a continuación calcularemos la raiz cuadrada de un número.\n"; 
$numero = readline("Escriba el número: \n");

$resultado = $numero ** 0.5; 
echo "La raiz cuadrada del numero $numero es igual a: $resultado";

?>