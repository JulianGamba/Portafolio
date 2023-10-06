<?php

//Preguntar al usuario el nombre y la edad, si es mayor o igual a 18 años mostrar 
//el mensaje "Usted es mayor de edad", de lo contrario "Usted es menor de edad". Si el número ingresado es negativo o 
//la edad ingresada es mayor a 100 años, mostrar al usuario un mensaje de ingresar una edad válida.

echo "Bienvenido\n";

$nombre = readline("Escriba su nombre: ");
$edad = readline("Escriba su edad: ");

if ($edad >= 18 and $edad <= 100) {
    echo "$nombre, Usted es mayor de edad";
} else if ($edad < 18 and $edad > 0) {
    echo "$nombre, Usted es menor de edad";
} else {
    echo "$nombre, Por favor ingrese una edad válida";
}

?>