<?php

//Escriba un programa para calcular el factorial de un número dado.

echo "A continuación podremos calcular el factorial de un número dado por el usuario \n";

$max = readline("Escriba el número cuyo factorial desea conocer: ");
$xd = 1;

for($i = 1; $i <= $max; $i++){
    $xd = $xd*$i;
    echo"El factorial del número $i es igual a $xd \n";
}
echo"El factorial es: $xd \n";

?>