<?php

//Escriba un programa para mostrar un patrón como Z con asteriscos. 
//*******
//     *
//    *
//   *
//  *
// *
//*******

echo "A continuación podremos ver un patrón con la cantidad máxima indicada por el usuario \n";

$max = readline("Escriba el número del máximo de columnas que tendrá el patrón: ");
$xd = "*";
$xdd = "*";
$xddd = "*";

for($i = 1; $i < $max; $i++){
    $xd = "*".$xd;
}
echo"$xd \n";

for($i = 2; $i < $max; $i++){
    $xdd = " ".$xdd;
    echo"$xdd \n";
}


$xd = "*";
for($i = 1; $i < $max; $i++){
    $xddd = "*".$xddd;
}
echo"$xddd \n";

?>