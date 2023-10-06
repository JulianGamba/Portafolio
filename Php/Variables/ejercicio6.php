<?php

//Programa que permita calcular el 30%, el 60% y el 90% de cualquier número.

echo "a continuación calcularemos el 30%, el 60% y el 90% del número que usted escriba \n"; 
$numero = readline("Escriba el número: ");
$numerofinal = (30*$numero)/100;
$numerofinal2 = (60*$numero)/100;
$numerofinal3 = (90*$numero)/100;

echo "El 30% de su número es: $numerofinal \n";
echo "El 60% de su número es: $numerofinal2 \n";
echo "El 90% de su número es: $numerofinal3 \n";

?>