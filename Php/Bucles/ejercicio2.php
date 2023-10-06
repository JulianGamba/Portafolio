<?php 

//Escriba un programa para encontrar la suma de los primeros 20 números naturales. El total es 210. 

echo"A continuación el resultado de la suma de los 20 primeros números naturales \n";

$suma=0;

for ($i=1; $i<=20;$i++){
    $suma = $suma + $i;    
}
echo"el total de la suma es $suma";
?>