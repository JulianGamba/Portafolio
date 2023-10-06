<?php

//Solicitar notas de 0.0 a 5.0 a un estudiante y calcular promedio.  
//Mostrar como "Aprobó" si el promedio es mayor o igual a 3.0, o mostrar "No aprobó" si su nota es menor a 3.0. 

echo "A continuación el usuario ingresará sus notas y se le dirá si aprobó o no la materia \n";

$numero1 = readline("Escriba la primera nota: ");
$numero2 = readline("Escriba la segunda nota: ");
$numero3 = readline("Escriba la tercera nota: ");
$numero4 = readline("Escriba la cuarta nota: ");
$numero5 = readline("Escriba la quinta nota: ");

$promedio = ($numero1 + $numero2 + $numero3 + $numero4 + $numero5)/5;

if ($promedio >= 3.0 and $promedio < 5){
    echo "Aprobó :D";
} else if ($promedio < 3.0){
    echo "No Aprobó ):";
} else if ($promedio > 5.0){
    echo "Su nota ha superado el límite";
} else if ($promedio < 0){
    echo "Su nota está por debajo del límite :c";
} else {
    echo "El número es inváldo";
}

?>