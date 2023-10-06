<?php

//11. El precio que debe pagar un cliente por una pizza depende del tamaño seleccionado
//Si cada ingrediente adicional cuesta $4.000. Escribir un programa que solicite al empleado encargado
//de registrar las ventas, el tamaño de la pizza y el número de ingredientes adicionales
//y muestre al cliente el precio que debe pagar.

echo "A continuación el usuario podrá ingresar el tamaño de pizza, ingredientes adicionales y ver el valor a pagar \n";

echo "1 = Tamaño 1 \n";
echo "2 = Tamaño 2 \n";
echo "3 = Tamaño 3 \n";
$opcion = readline("Escoja el número que corresponde al tamaño de pizza que comprará: ");

switch ($opcion){
    case "1";
    echo"Usted ha escogido el tamaño 1 de pizza con un costo de 15000 \n";
        $ad = readline("Escriba la cantidad de ingredientes adicionales: ");
        $total = 15000+(4000*$ad);
        echo "El valor a pagar es $total";
    break;
    case "2";
        echo"Usted ha escogido el tamaño 2 de pizza con un costo de 24000 \n";
        $ad = readline("Escriba la cantidad de ingredientes adicionales: ");
        $total = 24000+(4000*$ad);
        echo "El valor a pagar es $total";
    break;
    case "3";
        echo"Usted ha escogido el tamaño 3 de pizza con un costo de 36000 \n";
        $ad = readline("Escriba la cantidad de ingredientes adicionales: ");
        $total = 36000+(4000*$ad);
        echo "El valor a pagar es $total";
    break;
    default:
    echo "seleccione un valor válido";
    break;
}


?>