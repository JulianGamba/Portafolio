<?php

require_once('contacto.php');

class Agenda
{
    private $agendas = array();

    public function __construct()
    {
        $this->agendas = array();
    }

    public function registrarContacto()
    {
        for ($i = 0; $i < 10; $i++) {
            $nombre = readline("Escriba el nombre: ");
            $numero = readline("Escriba el numero: ");

            $contacto = new Contacto($nombre, $numero);
            $this->agendas[] = $contacto;
        }
    }

    public function listarContacto()
    {
        echo "LISTA DE CONTACTOS\n";
        foreach ($this->agendas as $contacto) {
            $nombre = $contacto->getNombre();
            $numero = $contacto->getNumero();
            echo "$nombre $numero\n";
        }
    }

    public function buscarContacto()
    {
        $nombre1 = readline("Escriba el nombre que desea buscar: ");
        foreach ($this->agendas as $contacto) {
            $nombre = $contacto->getNombre();
            $numero = $contacto->getNumero();

            if ($nombre1 == $nombre) {
                echo "El número del contacto es: $numero\n";
                return;
            }
        }
        echo "No se encontró el contacto.\n";
    }
}

?>