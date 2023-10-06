<?php
//2. Una función que reciba cinco números enteros como argumentos y devuelva el resultado de sumar los cinco números.
//Asigna el resultado de una invocación a la función con los números 2, 5, 1, 8, 10 
//a una variable de nombre $temporal y muestra el resultado.

function suma2(){
    $numeros = array(2,5,1,8,10);
    $resultado = 0;
    $numero2 = null;
    $numero1 = 0;
    foreach($numeros as $numero){
        $numero1 = readline("Escriba el numero: ");
        $resultado = $numero1 + $numero;
        $numero2 = $numero."+".$numero2;
        echo"el resultado de $numero1 + $numero = $resultado \n";
    }
    echo"El resultado es: $resultado \n";
    echo "$numero2 = $resultado";
}

suma2();
?>