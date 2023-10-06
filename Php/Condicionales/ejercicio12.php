<?php

//Un local vende sus productos con la siguiente promoción. Si compra hasta 5 artículos, no hay descuento. 
//Si compra más de 5 artículos, pero menos de 10, el precio unitario se reduce en 5%. 
//Si compra 10 o más artículos, el precio unitario se reduce en 8%. 
//Ingrese un dato de cantidad y el valor del precio unitario original. Calcule y muestre el valor total a pagar.

echo "A continuación el usuario podrá ingresar cantidad y valor de precio unitario para calcular total a pagar\n";

$cant = readline("Escriba la cantidad de productos que ha comprado: ");
$precio = readline("Escriba el precio unitario del producto: ");

if ($cant < 6 ){
    $valortotal = $cant*$precio;
    echo"El valor total a pagar es $valortotal";
} else if ($cant >= 6 and $cant < 10){
    $valor = $cant*$precio;
    $valortotal = $valor-(($valor*5)/100);
    echo"El valor total a pagar es $valortotal";
} else if ($cant >= 10){
    $valor = $cant*$precio;
    $valortotal = $valor-(($valor*8)/100);
    echo"El valor total a pagar es $valortotal";
}

?>