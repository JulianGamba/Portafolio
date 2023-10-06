
<?php 

//Escribe un programa para leer 10 números del teclado y encontrar su suma y promedio.

echo"A continuación el promedio de 10 números dados por el usuario \n";

$suma=0;

for ($i=1; $i<=10;$i++){
    $numero = readline("Escriba el número $i: ");
    $suma = $suma + $numero;
}

$promedio = $suma/10;
echo"el total de la suma es $suma y el promedio es: $promedio";

?>