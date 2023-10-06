<?php

//Solicitar tiempo en segundos y transformar a horas y minutos. 

echo "a continuación pasaremos el tiempo del usuario en segundos a horas y minutos.\n"; 
$seg = readline("Escriba el tiempo en segundos: \n");

$hora = ($seg / 3600);
$min = ($seg / 3600)*60;

echo "El tiempo en horas es igual a: $hora\n";
echo "El tiempo en minutos es igual a: $min";

?>