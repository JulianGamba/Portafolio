<?php
//1. Una función que reciba cinco números enteros como parámetros y muestre por pantalla 
//el resultado de sumar los cinco números (tipo procedimiento, no hay valor devuelto).

function suma(){
    $numeros = range(1,5);
    $resultado = 0;
    $numero2 = null;
    foreach($numeros as $numero){
        $numero = readline("Escriba el numero: ");
        $resultado = $resultado + $numero;
        $numero2 = $numero."+".$numero2;
    }
    echo"El resultado es: $resultado \n";
    echo "$numero2 = $resultado";
}

suma();
?>