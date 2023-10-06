<?php

//Solicitar al usuario una distancia en metros y transformar a km., cm. o mm. 

echo "a continuación pasaremos la distancia en metros del usuario a km, cm o mm.\n"; 
$distanciam = readline("Escriba la distancia en metros:\n");

$distanciakm = $distanciam * 0.001;
$distanciacm = $distanciam * 100;
$distanciamm = $distanciam * 1000;



echo "La distancia del usuario en km es igual a: $distanciakm\n";
echo "La distancia del usuario en cm es igual a: $distanciacm\n";
echo "La distancia del usuario en mm es igual a: $distanciamm\n";

?>