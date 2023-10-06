<?php
class Libro
{
    private $autor;
    private $libro;
    private $paginas;

    public function __construct()
    {
        $this->autor = readline("Escriba el nombre del autor: ");
        $this->libro = readline("Escriba el nombre del libro: ");
        $this->paginas = readline("Escriba la cantidad de páginas del libro: ");
    }

    public function mostrar(){
        echo "El libro {$this->libro} del autor {$this->autor} tiene {$this->paginas} páginas\n";
    }

    public function comparar(){
        $libro1 = readline("Escriba la cantidad de páginas del libro 1 para comparar: ");
        $libro2 = readline("Escriba la cantidad de páginas del libro 2 para comparar: ");
        if ($libro1 > $libro2){
            echo "el primer libro tiene más páginas";
        } else if ($libro2 > $libro1){
            echo "El segundo libro tiene más paginas";
        } else if ($libro1 == $libro2){
            echo "Ambos libros tienen la mis ma cantidad de páginas";
        } else {
            echo"Escriba una cantidad válida de páginas";
        }
    }
}
?>