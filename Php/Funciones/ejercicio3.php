<?php
//3. Una función que reciba como parámetros el valor del radio de la base y la altura de un cilindro 
//y devuelva el volumen del cilindro, teniendo en cuenta que el volumen de un cilindro se calcula como 
//Volumen = númeroPi * radio * radio * Altura, siendo númeroPi = 3.1416 aproximadamente o usa la constante de PI.

function cilindro(){
    $radio = readline("Escriba el radio del cilindro: ");
    $altura = readline("Escriba la altura del cilindro: ");
    $volumen = 3.1415 * $radio * $radio * $altura;
    echo"El volumen del cilindro es $volumen";
}

cilindro();
?>