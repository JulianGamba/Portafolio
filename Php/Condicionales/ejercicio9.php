<?php

//Programa que permita a un usuario tomar una decisión del tipo de pago a usar. 
//Si la cuenta es menor a $150000 pago en efectivo. Si no, si es de $150000 hasta $300000 pago con el celular 
//(dinero electrónico). Si es mayor a $300000 hasta $600000, pago con la tarjeta de débito. 
//Caso contrario, pago con la tarjeta de crédito.

echo "A continuación el usuario podrá escoger el método de pago \n";

echo "1 = Pago en efectivo (menos de 150000) \n";
echo "2 = Pago con el celular (entre 150000 y 300000) \n";
echo "3 = Pago con tarjeta de débito (entre 300000 y 600000) \n";
echo "4 = Pago con tarjeta de crédito (más de 600000) \n";

$opcion = readline("Escoja el número que corresponde al método de pago que desea usar: ");

switch ($opcion){
    case "1";
        echo"Usted ha escogido Pago en efectivo \n";
        $valor = readline("Escriba el valor que va a pagar: ");
        if ($valor > 0 and $valor < 150000){
            echo"Pago realizado \n";
        } else if ($valor >= 150000 and $valor >= 0){
            echo"El valor no corresponde al método de pago, escoja otro \n";
        } else {
            echo"Valor inválido \n";
        }
        echo"Gracias por utilizar nuestros servicios";
    break;
    case "2";
        echo"Usted ha escogido Pago con el celular \n";
        $valor = readline("Escriba el valor que va a pagar: ");
        if ($valor >= 150000 and $valor < 300000){
            echo"Pago realizado \n";
        } else if ($valor < 150000 and $valor >= 300000 and $valor >= 0){
            echo"El valor no corresponde al método de pago, escoja otro \n";
        } else {
            echo"Valor inválido \n";
        }
        echo"Gracias por utilizar nuestros servicios";
    break;
    case "3";
        echo"Usted ha escogido Pago con tarjeta de débito \n";
        $valor = readline("Escriba el valor que va a pagar: ");
        if ($valor >= 300000 and $valor < 600000){
            echo"Pago realizado \n";
        } else if ($valor < 300000 and $valor >= 600000 and $valor >= 0){
            echo"El valor no corresponde al método de pago, escoja otro \n";
        } else {
            echo"Valor inválido \n";
        }
        echo"Gracias por utilizar nuestros servicios";
    break;
    case "4";
        echo"Usted ha escogido Pago con tarjeta de crédito \n";
        $valor = readline("Escriba el valor que va a pagar: ");
        if ($valor >= 600000){
            echo"Pago realizado \n";
        } else if ($valor < 600000 and $valor >= 0){
            echo"El valor no corresponde al método de pago, escoja otro \n";
        } else {
            echo"Valor inválido \n";
        }
        echo"Gracias por utilizar nuestros servicios";
    break;
    default:
    echo "seleccione un valor válido";
    break;
}

?>