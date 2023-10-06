<?php

//Escriba un programa para mostrar el patrón como un triángulo rectángulo con un número. El patrón como:
//1
//12
//123
//1234
//12345

echo "A continuación podremos ver un patrón con la cantidad máxima indicada por el usuario \n";

$max = readline("Escriba el número del máximo de fila que se mostrará siguiendo el patrón: ");
for($i = 1; $i <= $max; $i++){
    $xd = $xd.$i;
    echo"$xd \n";
}

?>