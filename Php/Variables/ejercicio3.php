<?php

//Programa para calcular la distancia recorrida en un movimiento rectilíneo. 
//Recuerde $x=v*t$ donde $v$ es velocidad y $t$ es tiempo. Solicitar al usuario 
//velocidad en kilómetros por hora (Km/h) y tiempo en horas (h) para obtener la distancia en kilómetros (Km).


$v = readline("Escriba la velocidad (en kilometros): ");
$t = readline("Escriba el tiempo (en horas): ");
$d = $v*$t;

echo "El distancia recorrida en este movimiento retilineo es: $d km"




?>