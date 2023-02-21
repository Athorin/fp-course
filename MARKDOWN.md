# SINTAXIS MARKDOWN

## Índice de sintaxis Markdown
En el lenguaje Markdown encontrarás tres tipos de elementos básicos que a su vez engloban el resto de la sintaxis. Considera esto una cheat sheet con la que guiarte.

- Elementos de bloque
  - Párrafos y saltos de línea
  - Encabezados
  - Citas
  - Listas
  - Códigos de bloque
  - Reglas horizontales
- Elementos de línea
  - Énfasis
  - Links o enlaces
  - Código
  - Imágenes 
- Elementos varios 
  - Links automáticos
  - Omitir Markdown

## Elementos de bloque

### Párrafos y saltos de línea

Para generar un nuevo párrafo en Markdown simplemente separa el texto mediante una línea en blanco (pulsando dos veces intro)

Al igual que sucede con HTML, Markdown no soporta dobles líneas en blanco, así que si intentas generarlas estas se convertirán en una sola al procesarse.

Para realizar un salto de línea y empezar una frase en una línea siguiente dentro del mismo párrafo, tendrás que pulsar dos veces la barra espaciadora antes de pulsar una vez intro.

### Encabezados

Se usan las # almohadillas. Debes usarlos añadiendo uno por cada nivel.

# # Encabezado 1
## ## Encabezado 2
### ### Encabezado 3
#### #### Encabezado 4
##### ##### Encabezado 5
###### ###### Encabezado 6

### Citas
Las citas se generar utilizando el carácter mayor que > al comienzo del bloque de texto.

> Esto es una cita

Si la cita en cuestión se compone de varios párrafos, deberás añadir el mismo símbolo > al comienzo de cada uno de ellos.
Incluso puedes concatenar varios >> para crear citas anidadas.

> Esto sería una cita como la que acabas de ver.
>
> > Dentro de ella puedes anidar otra cita.
>
> La cita principal llegaría hasta aquí. 

### Listas

#### Listas desordenadas
Para crear listas desordenadas utiliza * asteriscos, - guiones, o + símbolo de suma.

- Elemento de lista 1
- Elemento de lista 2
* Elemento de lista 3
* Elemento de lista 4
+ Elemento de lista 5
+ Elemento de lista 6

Para generar **listas anidadas** dentro de otras, simplemente tendrás que añadir **cuatro espacios en blanco antes del siguiente *, - o +.

- Elemento de lista 1
- Elemento de lista 2
    - Elemento de lista 3
    - Elemento de lista 4
        - Elemento de lista 5
        - Elemento de lista 6

#### Listas ordenadas
Debes utilizar la sintaxis de tipo: «número.» 1.. 
Al igual que ocurre con las listas desordenadas, también podrás anidarlas o combinarlas.

1. Elemento de lista 1
2.  Elemento de lista 2
    - Elemento de lista 3
    - Elemento de lista 4
        1. Elemento de lista 5
        2. Elemento de lista 6

### Códigos de bloque
Si quieres crear un bloque entero que contenga código. 
Lo único que tienes que hacer es encerrar dicho párrafo entre dos líneas formadas por tres ~ virgulillas.

~~~
Creando códigos de bloque.
Puedes añadir tantas líneas y párrafos como quieras.  
~~~

### Reglas horizontales
Las reglas horizontales se utilizan para separar secciones de una manera visual.

Para crearlas, en una línea en blanco deberás incluir tres de los siguientes elementos: 
- asteriscos
- guiones
- o guiones bajos.


***
---
___


## Elementos de línea
### Énfasis (negritas y cursivas)
Markdown utiliza asteriscos o guiones bajos para enfatizar.

Simplemente tendrás que envolver palabras o textos en éstos símbolos para conseguir cursivas o negritas.

ESPERADO --- MARKDOWN

*cursiva* ----------->  * cursiva *

_cursiva_ -----------> _ _cursiva_ _

**negrita** ----------> ** negrita **

__negrita__	----------> __ negrita __

Por supuesto si quieres utilizar los dos tipos de énfasis no tienes más que combinar la sintaxis, envolviendo la palabra entre tres asteriscos o tres guiones bajos.

ESPERADO -------------- MARKDOWN

***cursiva y negrita***	--> *** cursiva y negrita ***

___cursiva y negrita___	--> ___ cursiva y negrita ___


### Links o enlaces

#### En línea
Se encuentran en línea con el texto.

Se crean escribiendo la palabra o texto enlazada entre [] corchetes, y el link en cuestión entre () paréntesis.

[[enlace en línea](http://www.limni.net)](http://www.limni.net) --> [enlace en línea](http://www.limni.net)

#### Como referencia
La desventaja del método anterior, es que si utilizas links demasiado complejos o largos pueden dificultarte la lectura de tu texto.

Para solucionarlo y crear tu contenido de una manera más ordenada puedes generar enlaces de referencia.

Esto quiere decir que en tu texto enlazarás palabras o códigos concretos (formados por letras y/o números), que en otro lugar más apartado de tu documento tendrás definidos como determinadas URL.

\[nombre que quieres darle a tu enlace]\[nombre de tu referencia]

\[nombre de tu referencia]: http:www.tuenlace.com

La referencia puede estar incluida en cualquier parte del documento, así puedes organizarte mejor y de una manera más limpia, recopilando todas tus referencias en un mismo lugar.



### Código
En según que tipo de publicaciones (sobre todo las de carácter técnico), necesitarás añadir pequeñas secciones donde mostrar código de otro lenguaje, atajos de teclado, o demás contenido que no debería ser tratado como tal.

Para ello tienes disponible dos alternativas.

#### Código puro \<code>
La forma más sencilla de escribir código en Markdown es envolver el texto entre dos comillas sencillas `. Esto se corresponde con la etiqueta HTML \<code>/ </code>

`Esto es una línea de código` --> 'Esto es una línea de código'


#### Texto preformateado \<pre>
La otra manera de añadir código en Markdown es comenzar el párrafo con cuatro espacios en blanco. Esto se corresponde con la etiqueta HTML \<pre>


    Esto es una línea de código

(4 espacios en blanco) Esto es una línea de código

Ojo, ¡estos espacios deberás incluirlos en cada línea que escribas! Para añadir código en bloque es mejor utilizar la sintaxis que viste anteriormente: códigos de bloque.


### Imágenes
Insertar una imagen con Markdown se realiza de una manera prácticamente idéntica a insertar links.

Solo que en este caso, deberás añadir un símbolo de ! exclamación al principio y el enlace no será otro que la ubicación de la imagen.

!\[Texto alternativo](/ruta/a/la/imagen.jpg)

El texto alternativo es lo que se mostraría si la carga de la imagen fallase.

También podrás añadir un título alternativo entrecomillándolo al final de la ruta. Esto sería el título mostrado al dejar el cursor del ratón sobre la imagen.

!\[Texto alternativo](/ruta/a/la/imagen.jpg "Título alternativo")

Ya que al añadir imágenes también estás tratando con URLs, puedes utilizar el método que viste anteriormente para incluir links mediante referencias, solo que en este caso los enlaces de referencia serán aquellos donde se encuentre tu imagen.


De esta forma podrías insertar una imagen

!\[nombre de la imagen]\[img1]

O dos, sin ensuciar tu espacio de escritura.

!\[nombre de la imagen2]\[img2]

\[img1]: /ruta/a/la/imagen.jpg "Título alternativo"

\[img2]: /ruta/a/la/imagen2.jpg "Título alternativo"


## Elementos varios
### Omitir Markdown
Si has llegado hasta aquí es probable que te estés preguntando cómo he conseguido escribir ciertos símbolos como * asteriscos o _ guiones bajos, sin que Markdown los interprete para convertirlos en negritas, cursivas…

Esto es muy sencillo, ya que en este lenguaje existe un elemento estrella para especificar que todo lo que escribas a continuación, no se interprete como Markdown.

Se trata de la barra invertida \.

Escribiéndola justo delante de cualquiera de los elementos que verás a continuación, los mismos no tendrán efecto a la hora de convertirse en negritas, cursivas, links…

\  barra invertida

`  acento invertido

\*  asterisco

_  guión bajo

{} llaves

[] corchetes

() paréntesis

\#  almohadilla

\+  símbolo de suma

\-  guión

.  punto

!  exclamación
