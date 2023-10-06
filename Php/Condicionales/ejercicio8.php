<?php

//Solicitar tres números al usuario e imprimirlos en orden ascendente y descendente. 

echo "A continuación el usuario ingresará tres números y serán devueltos en orden ascendente y descendente \n";

$numero1 = readline("Escriba el primer número: ");
$numero2 = readline("Escriba el segundo número: ");
$numero3 = readline("Escriba el tercer número: ");

if ($numero1 > $numero2 and $numero2 > $numero3){
    echo "El número mayor es $numero1, el del medio es $numero2 y el menor es $numero3";
} else if ($numero1 > $numero3 and $numero3 > $numero2){
    echo "El número mayor es $numero1, el del medio es $numero3 y el menor es $numero2";
} else if ($numero2 > $numero1 and $numero1 > $numero3){
    echo "El número mayor es $numero2, el del medio es $numero1 y el menor es $numero3";
} else if ($numero2 > $numero3 and $numero3 > $numero1){
    echo "El número mayor es $numero2, el del medio es $numero3 y el menor es $numero1";
} else if ($numero3 > $numero2 and $numero2 > $numero1){
    echo "El número mayor es $numero3, el del medio es $numero2 y el menor es $numero1";
} else if ($numero3 > $numero1 and $numero1 > $numero2){
    echo "El número mayor es $numero3, el del medio es $numero1 y el menor es $numero2";
}

?>