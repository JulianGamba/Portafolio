<?php

//Escriba un programa para mostrar el patrón como triángulo con un asterisco. El patrón como:
//*
//**
//***
//**
//*

echo "A continuación podremos ver un patrón con la cantidad máxima indicada por el usuario \n";

$max = readline("Escriba el número del máximo de figuras al que llegará el patrón antes de devolverse: ");
$xd = "*";

echo"* \n";
for($i = 1; $i < $max; $i++){
    $xd = "*".$xd;
    echo"$xd \n";
}
for ($i = 1; $i < $max; $i++){
    $xd = substr($xd, 0, -1);
    echo"$xd \n";
}

?>