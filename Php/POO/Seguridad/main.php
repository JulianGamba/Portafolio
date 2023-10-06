<?php

require_once ('password.php');

$Password2 = new Password();

$Password2->generar();
$Password2->validar();

?>