<?php

require_once ('agenda.php');

$Contact = new Agenda();

$Contact->registrarContacto();
$Contact->listarContacto();
$Contact->buscarContacto();

?>