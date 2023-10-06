<?php
//6. Crear una función que retorne el nombre del mes a partir de un número entre 1 y 12.

function mes(){
    $meses = array("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
        $numero = readline("Escriba el numero de mes que desea conocer: ");
        $numero = $numero-1;
        echo "El numero de mes ingresado corresponde a $meses[$numero]";
}

mes();
?>