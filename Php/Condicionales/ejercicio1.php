<?php

//Solicitar número al usuario y determinar si es par, impar o es cero. 

echo "A continuación determinaremos si un número es par o impar \n";

$numero = readline("Escriba un número: ");

$numero2 = $numero%2;

if ($numero2 == 0 and $numero != 0){
    echo "El número ingresado es par";
} else if (($numero2 == 1 or $numero2 == -1) and $numero != 0){
    echo "El número ingresado es impar";
} else if ($numero == 0){
    echo "El número ingresado es igual a 0";
} else {
    echo "El número es inváldo";
}

?>