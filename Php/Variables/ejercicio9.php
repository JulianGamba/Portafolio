<?php

//Programa que permita a una tienda saber el valor que pagara un cliente por la compra 
//de varios elementos de la misma referencia. Debe tener como entradas el valor unitario, 
//la cantidad de productos comprados y al valor final se debe adicionar el 16% correspondiente al IVA.


echo "a continuación calcularemos el valor que pagará un cliente.\n"; 
$producto = readline("Escriba el nombre del producto: \n");
$valorproducto = readline("Escriba el valor unitario del producto: \n");
$cantidadproducto = readline("Escriba cuantos productos de esta referencia ha llevado: \n");

$valorfinal = ($valorproducto * $cantidadproducto) + (($valorproducto * $cantidadproducto * 16)/100);
echo "El valor final con iva incluido que se pagará por $producto es: $valorfinal";

?>