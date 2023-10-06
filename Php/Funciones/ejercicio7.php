<?php
//7. Desarrollar una función que calcule el IVA aplicable a un producto, la función debe recibir 
//el total del producto y el IVA para aplicar, sino no se pasa un IVA, por defecto deberá tener 10%.

function iva(){
    $total = readline("Escriba el total de los productos que ha comprado: ");
    $iva = readline("Escriba el iva que se aplicará a los productos que ha comprado: ");
        if($iva > 0){
        $resultado = $total -($total*$iva)/100;
        echo"El valor total a pagar con iva aplicado es $resultado";
        } else if($iva == 0 or $iva == null){
            $resultado = $total -($total*10)/100;
            echo"El valor total a pagar con iva aplicado es $resultado"; 
        } else {
        echo"Los valores registrados no son válidos";
        }
    }

iva(); 
?>