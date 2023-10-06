<?php

//Solicitar número al usuario y determinar si es negativo, positivo o cero.

echo "A continuación determinaremos si un número es negativo, positivo o si es 0 \n";

$numero = readline("Escriba un número: ");

if ($numero > 0){
    echo "El número ingresado es positivo";
} else if ($numero < 0){
    echo "El número ingresado es negativo";
} else if ($numero == 0){
    echo "El número ingresado es igual a 0";
} else {
    echo "El número es inváldo";
}

?>