<?php

//Escriba un programa para hacer un patrón como una pirámide con números aumentados en 1.
//   1
//  2 3
// 4 5 6
//7 8 9 10

echo "A continuación podremos ver un patrón con la cantidad máxima indicada por el usuario \n";

$max = readline("Escriba el número del máximo de filas que tendrá el patrón: ");

$xd = 0;
for($i = 1; $i <= $max; $i++){
    $esp = $esp." ";
}

for($i = 1; $i <= $max; $i++){
    $espa = substr($esp, 0, -1);
    echo"$espa";
    for($j = 1; $j <= $i; $j++){
        $xdd = $xd++;
        echo"$xd ";
        $xd = $xd;

    }
    echo "\n";
    $esp = $espa;
}   

?>