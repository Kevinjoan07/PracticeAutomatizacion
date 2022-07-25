#language: es

  Característica: Comprar  libros en la pagina practice.automationtesting.com


    Esquema del escenario: comprar 2 libros de forma exitosa
      Dado que me encuentro en la pagina de compras de practice.automationtesting
      Cuando compro <cantidad> unidades del libro Android Quick Start Guide
         | nombre    | <nombre>   |
         | apellido    | <apellido>    |
         | email    | <email>    |
         | telefono    | <telefono>    |
         | pais    | <pais>    |
         | direccion    | <direccion>    |
         | ciudad    | <ciudad>    |
         | codigozip    | <codigozip>    |


      Entonces verifico que el  sea el correcto <PrecioFinal>

      Ejemplos:
      |  PrecioFinal  | cantidad     | nombre  | apellido   |      email              |telefono     |pais     |ciudad     |codigozip   |direccion           |
      |  945.00       |     2        | kevin   | mosquera   |     prueba@domain.com   |283718973    |colombia |Medellin   |05001       |calle 24 # 12 -19   |
