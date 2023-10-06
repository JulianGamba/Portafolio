<?php
class Password
{
    private $longitud = 13;
    private $password = "";

    public function __construct($longitud = 13)
    {
        $this->longitud = $longitud;
    }

    public function getLongitud()
    {
        return $this->longitud;
    }

    public function setLongitud($longitud)
    {
        $this->longitud = $longitud;
    }

    public function getPassword()
    {
        return $this->password;
    }

    public function generar()
    {
        $password = "";
        for ($i = 0; $i < $this->longitud; $i++) {
            $random = rand(1, 3);
            switch ($random) {
                case 1:
                    $temporal = chr(rand(97, 122)); // minúsculas
                    $password .= $temporal;
                    break;
                case 2:
                    $temporal = chr(rand(65, 90)); // mayúsculas
                    $password .= $temporal;
                    break;
                case 3:
                    $temporal = chr(rand(48, 57)); // números
                    $password .= $temporal;
                    break;
            }
        }
        $this->password = $password;
        echo $this->password;
        echo"\n";
    }

    public function validar()
    {
        $numeros = 0;
        $mayusculas = 0;
        $minusculas = 0;

        for ($i = 0; $i < strlen($this->password); $i++) {
            $caracter = $this->password[$i];

            if (ctype_digit($caracter)) {
                $numeros++;
            } elseif (ctype_upper($caracter)) {
                $mayusculas++;
            } elseif (ctype_lower($caracter)) {
                $minusculas++;
            }
        }

        if ($numeros >= 5 and $mayusculas >= 2 and $minusculas >= 1) {
            echo "La contraseña es segura";
        } else {
            echo "La contraseña no es segura";
        }
    }
}

/*Para saber si una contraseña es segura, debe tener al menos 5 números, 1 minúsculas y 2 mayúsculas. */
?>