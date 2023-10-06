<?php

//Programa que permita determinar el salario a pagar a un empleado, 
//teniendo como entradas el salario diario y el número de días trabajados. 
//Tenga en cuenta que al empleado se le debe descontar el 10% por concepto de pensión y 15% por concepto de salud.


echo "a continuación calcularemos el salario a pagar a un empleado.\n"; 
$salariodiario = readline("Escriba el salario diario del empleado: \n");
$diastrabajados = readline("Escriba los días trabajados por el empleado: \n");

$salariofinal = ($salariodiario * $diastrabajados) - ((($salariodiario * $diastrabajados * 10)/100) + (($salariodiario * $diastrabajados * 15)/100));
echo "El salario final que se le pagará al empleado es: $salariofinal";

?>