<?php

//Leer el número de llantas de una compra y mostrar el valor que debe pagarse. 
//El almacén las vende con la siguiente política: Si se compran menos de 6 llantas, 
//el precio unitario es $240000. Si se compran 6 o 7, el precio unitario es $221000, 
//y si se compran más de 7 llantas, el precio unitario es $180000.

echo "A continuación el usuario podrá ver el valor total de la cantidad de llantas que compre\n";

$cant = readline("Escriba la cantidad de llantas que ha comprado: ");

if ($cant < 6 ){
    $valortotal = $cant*240000;
    echo"El valor total a pagar es $valortotal";
} else if ($cant >= 6 and $cant < 8){
    $valortotal = $cant*221000;
    echo"El valor total a pagar es $valortotal";
} else if ($cant >= 8){
    $valortotal = $cant*180000;
    echo"El valor total a pagar es $valortotal";
}

?>