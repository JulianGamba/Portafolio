<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    {{-- <link rel="stylesheet" href="{{ asset('css/style.css') }}">  --}}
    <title>Club Leones plan-acondicionamiento</title>
    <style>
        body {
            /* background-color: #e3f2f7; */
            font-family: Arial, sans-serif;
        }
    
        h1 {
            text-align: center;
            margin-top: 50px;
        }
    
        .empresa {
            float: right;
            font-size: 40px;
            color: #02225a;
            display: block;
        }
    
        .table {
            border: 1px solid #02225a;
            width: 100%;
            margin-bottom: 20px;
        }
    
        .table th,
        .table td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #02225a;
        }
    
        .table th {
            background-color: #02225a;
            color: #fff;
        }
    
        .table-striped tbody tr:nth-of-type(odd) {
            background-color: #f1f1f1;
        }
    
        /* Estilo para las tablas de test */
        .table-test {
            margin-top: 20px;
            border-collapse: collapse;
            width: 100%;
        }
    
        .table-test th,
        .table-test td {
            padding: 10px;
            border: 1px solid #02225a;
            text-align: left;
        }
    
        .table-test .fila1 {
            background-color: #02225a;
            color: #fff;
        }
    
        .table-test .fila2 {
            background-color: #f1f1f1;
        }
    
        /* Estilo para la tabla de "planacondicionamiento" */
        .table-planacondicionamiento {
            margin-top: 20px;
            border-collapse: collapse;
            width: 100%;
        }
    
        .table-planacondicionamiento th,
        .table-planacondicionamiento td {
            padding: 10px;
            border: 1px solid #02225a;
            text-align: left;
        }
    
        .table-planacondicionamiento .fila1 {
            background-color: #02225a;
            color: #fff;
        }
    
        .table-planacondicionamiento .fila2 {
            background-color: #f1f1f1;
        }
    </style>
    
    </head>
    <body class="body">
        <p class="empresa">Club Leones</p>
        <h1>Reporte entrenamiento</h1>
    
        <table class="table table-striped">
            <thead>
                <tr class="fila1">
                    <th scope="col">Id entrenamiento</th>
                    <th scope="col">Fecha</th>
                    <th scope="col">Hora</th>
                    <th scope="col">Tipo de entrenamiento</th>
                    <th scope="col">Descripcion</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($entrenamiento as $item)
                <tr class="fila2">
                    <td>{{$item->id_entrenamiento}}</td>
                    <td>{{$item->fecha}}</td>
                    <td>{{$item->hora}}</td>
                    <td>{{$item->tipo_entrenamiento}}</td>
                    <td>{{$item->descripcion}}</td>
                </tr>
                @endforeach
            </tbody>
        </table>
    </body>
          {{-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script> --}}
</body>
</html>