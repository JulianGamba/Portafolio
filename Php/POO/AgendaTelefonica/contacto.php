<?php
class Contacto
{
    private $nombre;
    private $numero;

    public function __construct($nombre, $numero)
    {
        $this->nombre = $nombre;
        $this->numero = $numero;
    }

    public function getNombre(){
        return $this->nombre;
    }

    public function setNombre($nombre){
        $this->nombre = $nombre;
    }

    public function getNumero(){
        return $this->numero;
    }

    public function setNumero($numero){
        $this->numero = $numero;
    }
}
?>