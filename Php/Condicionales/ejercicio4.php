<?php

//Solicitar dos números al usuario y calcular cuál es el mayor y cuál el menor, e imprimir el resultado.

echo "A continuación determinaremos entre dos números ingresados por el usuario cuál es mayor, menor o si son iguales \n";

$numero1 = readline("Escriba el primer número: ");
$numero2 = readline("Escriba el segundo número: ");


if ($numero1 > $numero2){
    echo "El número $numero1 es mayor que el número $numero2";
} else if ($numero2 > $numero1){
    echo "El número $numero2 es mayor que el número $numero1";
} else if ($numero1 == $numero2){
    echo "Los números ingresados son los mismos";
} else {
    echo "El número es inváldo";
}

?>