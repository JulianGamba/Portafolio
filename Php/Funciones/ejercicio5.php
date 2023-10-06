<?php
//5. Realizar un algoritmo que incremente un número pasado como valor.

function fibonacci(){
    echo"A continuación la sucesión de fibonacci y el resultado de su suma (cantidad de términos dados por el usuario)\n";

$fib=1;
$xd = 1;
$suma = 2;
$cant = readline("Escriba cuántos términos desea ver y sumar de la sucesión de fibonacci: ");
echo"La sucesión de fibonacci con $cant términos es: 1 1 ";

for ($i=1; $i<=($cant - 2);$i++){
    $k = 1;
    for ($j=1; $j<=1;$j++){
        $fib = $fib + $xd;
    }
    if ($fib > 2 and $k = 1){
        $xd = $fib-$xd;
    }
    $suma = $suma + $fib;
    echo"$fib ";

}
echo"el total de la suma de la cantidad de términos es $suma";


}

fibonacci();
?>