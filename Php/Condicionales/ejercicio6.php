<?php

//Crear un programa con un menú de opciones, que permita calcular las áreas de figuras geométricas 
//(cuadrado, rectángulo, triángulo, círculo, rombo y trapecio).

echo "A continuación el usuario podrá calcular el área de la figura geométrica que escoja \n";

echo "1 = Cuadrado \n";
echo "2 = Rectángulo \n";
echo "3 = Triángulo \n";
echo "4 = Círculo \n";
echo "5 = Rombo \n";
echo "6 = Trapecio \n";
$opcion = readline("Escoja el número de la figura geométrica cuya área desea conocer: ");

switch ($opcion){
    case "1";
        $numero = readline("Escriba la longitud del lado del cuadrado: ");
        $area = $numero*$numero;
        echo "El area del cuadrado es igual a $area";
    break;
    case "2";
        $numero1 = readline("Escriba la longitud del primer lado del rectángulo: ");
        $numero2 = readline("Escriba la longitud del segundo lado del rectángulo: ");
        $area = $numero1*$numero2;
        echo "El area del rectángulo es igual a $area";
    break;
    case "3";
        $base = readline("Escriba la longitud de la base del triángulo: ");
        $altura = readline("Escriba la longitud de la altura del triángulo: ");
        $area = ($base*$altura)/2;
        echo "El area del triángulo es igual a $area";
    break;
    case "4";
        $radio = readline("Escriba la longitud del radio del círculo: ");
        $area = $radio*$radio*3.1415;
        echo "El area del círculo es igual a $area";
    break;
    case "5";
        $diagMayor = readline("Escriba la longitud de la diagonal mayor del rombo: ");
        $diagMenor = readline("Escriba la longitud de la diagonal menor del rombo: ");
        $area = ($diagMayor*$diagMenor)/2;
        echo "El area del rombo es igual a $area";
    break;
    case "6";
        $baseMayor = readline("Escriba la longitud de la base mayor del trapecio: ");
        $baseMenor = readline("Escriba la longitud de la base menor del trapecio: ");      
        $altura = readline("Escriba la longitud de la altura del trapecio: ");      
        $area = (($baseMayor+$baseMenor)/2)*$altura;
        echo "El area del trapecio es igual a $area";
    break;
    default:
    echo "seleccione un valor válido";
    break;
}


?>