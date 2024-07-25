## API_GATEWAY-LAMBDA-DYNAMO_DB

- Aplicativo en java que contiene la definicion de una lambda en java, la cual recibe un conjunto de datos (TABLA 1), los cuales llegan mediante una peticion POST sobre el servicio API GATEWAY de AWS, y posteriomente son almacenados en una tabla (Employee) de DynamoDB.

</br>

Tabla 1. Datos a ser almacenados

</br>

|  Dato  | tipo de dato |        Descripción         |
|:------:|:------------:|:--------------------------:|
|   id   |    String    | Identificador del registro |
| nombre | String |    Nombre del empleado     |
| email  | String |     Email del empleado     |
| cedula | String |    Cedula del empleado     |
|  rol   | String | Rol que ocupa el empleado  |  


</br>

--- 



## Arquitectura de la solución.

</br>

![Arquitectura de la solución](/Diagrama.drawio.png)
