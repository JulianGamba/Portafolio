<?php

//14. El número de pulsaciones que debe tener una persona por cada 10 segundos de ejercicio aeróbico se calcula con la fórmula:    
//Género femenino (1): número de pulsaciones = (220 - edad en años)/10
//Género masculino (2): número de pulsaciones = (210 - edad en años)/10
//Lea la edad y el género y muestre el número de pulsaciones.

echo "A continuación el usuario podrá saber el numero de pulsaciones que debe tener según su género y edad \n";

echo "1 = Hombre \n";
echo "2 = Mujer \n";
$opcion = readline("Escoja el número que corresponde a su género: ");

switch ($opcion){
    case "1";
    echo"Usted es Hombre \n";
        $edad = readline("Escriba su edad: ");
        $pulsaciones = (210-$edad)/10;
        echo "El número de pulsaciones que usted debe tener es $pulsaciones";
    break;
    case "2";
        echo"Usted es Mujer \n";
        $edad = readline("Escriba su edad: ");
        $pulsaciones = (220-$edad)/10;
        echo "El número de pulsaciones que usted debe tener es $pulsaciones";
    break;
    default:
    echo "seleccione un valor válido";
    break;
}
?>