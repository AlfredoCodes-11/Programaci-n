Desarrolar un minijuego RPG llamado "Demonio" donde se van a similar torneos. El jugador introduce su nombre por consola al ejecutar el programa, y este lee un archivo con los mounstros rivales, que ddesordenara para hacerlos enfrentarse el heroe de la aventura simulando los combates. Todo el registro de batallas se irá guardando en un nuevo archivo.

¿Como se invoca el programa?
java Demonio <archivo_entrada> <nombre_heroe> <archivo_salida>

Si no hay exactsmente 3 parametros el programa emitira un error junto con la ayuda y se detendrá.
Vamos a utilizar POO, colecciones, ficheros y lineas de comandos.

¿Qué estructura tendrá el archivo de bestias?
<nombre_enemigo>,<vidaMaxima>,<ataqueMaximo>

¿Como funciona el programa?
Si los argumentos son correctos:
1. se carga el contenido del archivo de enemigos a una coleccion apropiada.
[INFO] Cargando 3 mounstros del bestiario...

2. Se mostrara un mensaje de inicio de batalla
[INFO] ¡Comienza el torneo para Heroe (Vida: 100, Ataque: 15)!

3. A continuacion, la aplicacion ira enfrentando en una batalla a cada enemigo con el heroe.

---RONDA 1---
Heroese enfrenta a Goblin
Heroe ataca a Goblin y le quita 15 de vida. Goblin se queda con 5.
Goblin ataca a Heroe y le quita 5 de vida. Heroe se queda con 95.
Heroe ataca a Goblin y le quita 15 de vida. ¡Goblin ha muerto!

REGLAS DE ATAQUE:
1. El heroe siempre ataca primero.
2. El daño inflingido por el heroe oscilara entre 1 y el ataqueMAximo (ambos inclusive).
3. Ataca el enemigo.
4. El daño inflingido por el enemigo oscilara entre 0 y el ataqueMAximo del enemigo (ambos inclusive).
5. Evaluar la vida tanto del heroe como del enemigo.
    a. Si el heroe esta muerto, se acaba la partida.
    b. Si el heroe esta vivo y el enemigo tambien, repetimos todo lo anterior.
    c. Si el heroe esta vivo y el enemigo muerto, gana el heroe y pasamos a la siguiente ronda donde atacamos al mounstro.

6. Se registra toda la evolucion de la ronda en el archivo de salida.

HACER EN CASA:
1. Crea una clase llamada Personaje con atributos nombre, vida y ataque.
2. Crea metodos:
    a. estaVivo: devuekve si el enemigo aun tiene puntos de vida o no.
    b. atacar: que recibe un Personaje (enemigo). Este metodo encapsula la logica de ataque explicada anteriormente. DEJAD EL CUERPO DEL METODO VACIO.
