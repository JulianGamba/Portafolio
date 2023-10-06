<?php

//Conversión de temperaturas. Crear un menú de opciones. 

echo "A continuación el usuario podrá ver la equivalencia de temperaturas \n";

echo "1 = Celsius \n";
echo "2 = Fahrenheit \n";
echo "3 = Kelvin \n";
$opcion = readline("Escoja el número de la temperatura que dese ingresar: ");

switch ($opcion){
    case "1";
    echo "Usted ha escogido Celsius \n";
    echo "1 = Fahrenheit \n";
    echo "2 = Kelvin \n";
    $opcion2 = readline("Escoja el número de la temperatura cuya equivalencia desea conocer: ");

    switch ($opcion2){
        case "1";
        echo "Convertiremos de grados Celsius a grados Fahrenheit \n";
        $temp = readline("Escriba la temperatura: ");
        $tempfinal = $temp*1.8+32;
        echo "La temperatura en grados Fahrenheit es $tempfinal";
        break;
        case "2";
        echo "Convertiremos de grados Celsius a grados Kelvin \n";
        $temp = readline("Escriba la temperatura: ");
        $tempfinal = $temp+273.15;
        echo "La temperatura en grados Kelvin es $tempfinal";
        break;
        default:
        echo "seleccione un valor válido";
        break;
    }        
    break;
    case "2";
    echo "Usted ha escogido Fahrenheit \n";
    echo "1 = Celsius \n";
    echo "2 = Kelvin \n";
    $opcion2 = readline("Escoja el número de la temperatura cuya equivalencia desea conocer: ");

    switch ($opcion2){
        case "1";
        echo "Convertiremos de grados Fahrenheit a grados Celsius \n";
        $temp = readline("Escriba la temperatura: ");
        $tempfinal = ($temp-32)/1.8;
        echo "La temperatura en grados Celsius es $tempfinal";
        break;
        case "2";
        echo "Convertiremos de grados Fahrenheit a grados Kelvin \n";
        $temp = readline("Escriba la temperatura: ");
        $tempfinal = ($temp+459.67)/1.8;
        echo "La temperatura en grados Kelvin es $tempfinal";
        break;
        default:
        echo "seleccione un valor válido";
        break;
    }        
    break;
    case "3";
    echo "Usted ha escogido Kelvin \n";
    echo "1 = Celcius \n";
    echo "2 = Fahrenheit \n";
    $opcion2 = readline("Escoja el número de la temperatura cuya equivalencia desea conocer: ");

    switch ($opcion2){
        case "1";
        echo "Convertiremos de grados Kelvin a grados Celcius \n";
        $temp = readline("Escriba la temperatura: ");
        $tempfinal = $temp-273.15;
        echo "La temperatura en grados Celcius es $tempfinal";
        break;
        case "2";
        echo "Convertiremos de grados Kelvin a grados Fahrenheit \n";
        $temp = readline("Escriba la temperatura: ");
        $tempfinal = $temp*1.8-459.67;
        echo "La temperatura en grados Fahrenheit es $tempfinal";
        break;
        default:
        echo "seleccione un valor válido";
        break;
    }        
    break;
    default:
    echo "seleccione un valor válido";
    break;
}


?>