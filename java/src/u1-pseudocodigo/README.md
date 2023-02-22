# U1. Pseudocodigo

Su principal función es la de representar por pasos la solución a un problema o algoritmo, de la forma más detallada posible, utilizando un lenguaje cercano al de programación. 

El pseudocódigo no puede ejecutarse en un ordenador ya que entonces dejaría de ser pseudocódigo, como su propio nombre indica, se trata de un código falso (pseudo = falso), es un código escrito para que lo entienda el ser humano y no la máquina.

### Herramientas
**PSeInt**: herramienta que asiste con un simple e intuitivo pseudolenguaje en español y que además incluye un editor de diagramas de flujo.

### Sintaxis del pseudocódigo
Un programa escrito en pseudocódigo debe permitir instrucciones primitivas, de proceso, de control, de descripción y compuestas.
Se divide en dos bloques:
- Bloque de **Declaraciones**:  se especifica los datos que utiliza el programa (constantes, variables, tablas...)
- Bloque de **Instrucciones**: constituido por el conjunto de operaciones que se han de realizar para obtener los resultados deseados

### Clasificacion de instrucciones
- **Declaracion**: indican al procesador que reserve espacio en la memoria para los datos del programa,
indicando su nombre, tipo y caracteristicas.
- **Primitivas**: Son aquellas que ejecuta el procesador de modo inmediato. Tipos:
  - **Asignacion**: NombreVariable -> valor
  - **Entrada**: leer NombreVariable
  - **Salida**: imprimir/escribir Expresion
- **Compuestas**: llamadas a subprogramas.
- **Control**
  - **Alternativas** (condicionales)
    - **Simple**
    - **Doble**
    - **Multiple**
  - **Repetitivas** (bucles)
    - **Para**
    - **Mientras**
    - **Repetir**

### Estructura de un algoritmo en pseudocódigo
Todo algoritmo en pseudocódigo tiene la siguiente estructura general:

- Comienza con la palabra clave **Proceso** (o alternativamente Algoritmo, son sinónimos) seguida del **nombre del programa**.
- Le sigue una **secuencia** (Estructura de control secuencial) de instrucciones. Una secuencia de instrucciones es una lista de una o más instrucciones y/o estructuras de control.
- Finaliza con la palabra **FinProceso** (o FinAlgoritmo).

La identación no es significativo, pero se recomienda para que el código sea más legible.
No se diferencia entre mayúsculas y minúsculas. Preferible las minúsculas, aunque a veces se añaden automáticamente los nombres con la primera letra en mayúsculas.


### Comentarios
Se pueden introducir comentarios luego de una instrucción, o en líneas separadas, mediante el uso de la doble barra ( // ).
Todo lo que precede a //, hasta el fin de la línea, no será tomado en cuenta al interpretar el algoritmo.


[U2. Principios basicos >](../u2_principios_basicos)