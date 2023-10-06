
<?php 

//Escriba un programa para mostrar la tabla de multiplicar de un entero dado.

echo"A continuación la tabla de multiplicar de un entero dado por el ususario \n";

$numero = readline("Escriba el número: ");

for ($i=1; $i<=10;$i++){
    $resultado = $numero * $i;
    echo" $numero * $i = $resultado \n";
}
?>