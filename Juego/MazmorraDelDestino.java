
public class MazmorraDelDestino {
//Te lo entrego por la noche sin terminar porque mañana por la mañana no se si podré entregarlo
// y tampoco sé si dejaras abierta la entrega el viernes entero o solo el horario de clase
    public static final String CLEAR = "\033[H\033[2J";

    public static int vida=100;
    public static int ataque=15;
    public static int defensa=5;
    public static int oro=20;
    public static int pocion=1;
    public static int turno=1;
    public static int opcionMenu;
    public static void main(String[] args) {


        try {

            while (turno<10 && vida<=100 && opcionMenu!=5) {
                System.out.println("1. Explorar mazmorra");
                System.out.println("2. Ver estado del jugador");
                System.out.println("3. Usar poción");
                System.out.println("4. Tienda");
                System.out.println("5. Salir del juego (huye)");
                System.out.print("Introduce tu opción: ");
                opcionMenu=Integer.parseInt(System.console().readLine());



                switch (opcionMenu) {
                    case 1:
                        explorarMazmorra();
                        break;
                    case 2:
                        estadoJugador();
                        break;
                    case 3:
                        usarPocion();
                        break;
                    case 4:
                        tienda();
                        break;
                    case 5:
                        System.out.println("Huiste de la mazmorra.");
                        break;
                    default:
                        System.out.println(CLEAR);
                        System.out.println("*Opción incorrecta*");
                        break;
                }
            }
        
        } catch (Exception e){
            System.out.println("ERROR* El programa ha fallado.");
        }
    }
    

    // Función para ver el estado del Jugador
    public static void estadoJugador(){
        System.out.println(CLEAR);
        System.out.println("Estado del jugador.");
        System.out.printf("Vida %d\n", vida);
        System.out.printf("Ataque %d\n", ataque);
        System.out.printf("Defensa %d\n", defensa);
        System.out.printf("Oro %d\n", oro);
        System.out.printf("Pociones %d\n", pocion);
        System.out.printf("Turno %d\n", turno);
        System.out.print("Presiona ENTER para continuar...");
    }

    //Función para usar una poción 
    public static void usarPocion(){
        System.out.println(CLEAR);

        if (pocion<1){
            System.out.println("No tienes pociones para usar.");
        } else {
            vida = vida + 30;
            if (vida>100){
                vida=100;
            }
        pocion--;
        }
    }

    //Función para entrar en la tienda
    public static void tienda(){
        
        System.out.println(CLEAR);

        int opcion;

        System.out.println("1. Comprar poción (10  de oro).");
        System.out.println("2. Mejorar ataque (+5) por 20 de oro.");
        System.out.println("3. Salir.");
        System.out.print("Elige opción: ");
        opcion=Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                if (oro>=10){
                    pocion++;
                    oro-=10;
                System.out.println("Compraste una poción.");
                System.out.printf("Ahora tienes %d pociones.\n",pocion);
                System.out.printf("Tienes %d de oro.\n",oro);
                } else {
                    System.out.println("Estas pobre, ponte a trabajar.");
                }
                break;
            case 2:
                if (oro>=20){
                    ataque+=5;
                    oro-=20;
                } else {
                    System.out.println("No tienes suficiente oro.");
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }

    //Función para entrar a la Mazmorra
    public static void explorarMazmorra(){

        int eventoMazmorra;
        int vidaEnemigo=40;
        int ataqueEnemigo=10;
        int opcion;
        int dañoAleatorio;
        int dañoJugador;
        int dañoAleatorioEnemigo;
        int dañoEnemigo;
        int dañoFinal;


        eventoMazmorra=(int) (Math.random()*4);

        switch (eventoMazmorra) {
            case 0:
                while (vida>=1 && vidaEnemigo>=1) {
                    System.out.println("1. Atacar.");
                    System.out.println("2. Defenderse.");
                    System.out.println("3. Intentar huir.");
                    System.out.print("Elegir opción: ");
                    opcion=Integer.parseInt(System.console().readLine());

                    switch (opcion) {
                        case 1:
                            dañoAleatorio=(int) (Math.random()*6);
                            dañoJugador=ataque+dañoAleatorio;
                            vidaEnemigo= vidaEnemigo-dañoJugador;
                            dañoAleatorioEnemigo= (int) (Math.random()*4);
                            dañoEnemigo= ataqueEnemigo + dañoAleatorioEnemigo;
                            dañoFinal = dañoEnemigo + defensa;
                            vida= vida -dañoFinal;
                            System.out.printf("Atacas y causas %d de daño.\n",dañoJugador);
                            System.out.printf("El enemigo ataca y te causa %d puntos de daño.\n",dañoFinal);
                            System.out.printf("Vida del jugador: %d\n",vida);
                            System.out.printf("Vida del enemigo: %d\n",vidaEnemigo);


                            break;
                    
                        default:
                            break;
                    }
                }
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}
