<?php

//Un reporte de salud muestra una tabla diferente del índice de masa corporal IMC de una persona
 //que se calcula con la fórmula IMC=P/T en donde P es el peso en Kg. y T es la talla en metros. 
 //Lea un valor de P y de T, calcule el IMC y muestre su estado según la siguiente tabla:

echo "A continuación el usuario podrá ver su IMC y su estado\n";

$peso = readline("Escriba su peso: ");
$altura = readline("Escriba su altura: ");

$imc = $peso/($altura*$altura);

if ($imc < 18.5 and $imc > 0){
    echo"Su IMC es $imc, usted está en estado de desnutrición";
} else if ($imc >= 18.5 and $imc <= 24.9){
    echo"Su IMC es $imc, usted está en estado de normalidad";
} else if ($imc >= 25 and $imc <= 29.9){
    echo"Su IMC es $imc, usted está en estado de sobrepeso";
} else if ($imc >= 30 and $imc <= 34.9){
    echo"Su IMC es $imc, usted está en estado de obesidad I";
} else if ($imc >= 35 and $imc <= 34.9){
    echo"Su IMC es $imc, usted está en estado de obesidad II";
} else if ($imc >= 40 and $imc <= 49.9){
    echo"Su IMC es $imc, usted está en estado de obesidad III";
} else if ($imc >= 50){
    echo"Su IMC es $imc, usted está en estado de obesidad IV";
} else {
    echo"Valor incorrecto";
}

?>