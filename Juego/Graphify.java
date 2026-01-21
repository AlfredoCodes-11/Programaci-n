import java.util.Scanner;

/**
 * Alfredo Codes Sánchez
 */

class Graphify {

    // Definición de constante LIMPIAR PANTALLA
    public static final String CLEAR = "\033[H\033[2J";

    // Definición de constantes de COLOR
    public static final String RESET = "\033[0m"; 
    public static final String RED_BACKGROUND    = "\033[41m";
    public static final String GREEN_BACKGROUND  = "\033[42m";
    public static final String BLUE_BACKGROUND   = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    // Definición de constantes de SÍMBOLOS COLOR
    public static final String HORIZONTAL       = "\u2550";     // ═
    public static final String VERTICAL         = "\u2551";     // ║

    public static final String ESQUINA_SUP_IZQ  = "\u2554";     // ╔
    public static final String ESQUINA_SUP_DER  = "\u2557";     // ╗
    public static final String ESQUINA_INF_IZQ  = "\u255A";     // ╚
    public static final String ESQUINA_INF_DER  = "\u255D";     // ╝

    public static final String CRUCE_IZQ        = "\u2560";     // ╠
    public static final String CRUCE_DER        = "\u2563";     // ╣
    public static final String CRUCE_SUP        = "\u2566";     // ╦
    public static final String CRUCE_CEN        = "\u256C";     // ╬
    public static final String CRUCE_INF        = "\u2569";     // ╩

    /**
     * GRAPHIFY: algoritmo principal
     * @param args
     */
    public static void main(String[] args) {


        long numA;
        long numB;
        long numeroRandom;

        char color=' ';

        boolean elegirColor;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print(CLEAR) ;   // limpiamos la pantalla
            System.out.println("GRAPHIFY");
            System.out.println("====================");
            System.out.print("Introduce el valor mínimo del rango: ");
            numA = sc.nextLong();
            System.out.print("Introduce el valor máximo del rango: ");
            numB = sc.nextLong();

            // Comprobamos si los dos números introducidos son positivos
            if (numA < 0 || numB < 0 ) {
                System.out.println("Error: Ambos valores deben ser positivos.");
            } else {
                System.out.print("Dibujo la gráfica en blanco y negro o en color (B|C): ");
                color = System.console().readLine().toLowerCase().charAt(0);
                elegirColor=color!='c';
                if (numB < numA) { // Gráfica cuando numB es menor a numA
                    numeroRandom=generarNumeroAleatorioIntercambio(numA, numB);
                    dibujarGrafico(numeroRandom, elegirColor);

                } else {
                    numeroRandom=generarNumeroAleatorio(numA, numB);
                    dibujarGrafico(numeroRandom, elegirColor);

                }
            }
                if (color == 'c') {
                    System.out.println("Lo siento, aún no hemos implementado esta opción");

                }
        } catch (Exception e) {
                System.out.println("Error***. La app ha fallado.");
        }

        
    }

    // Generamos el número aleatorio
    public static long generarNumeroAleatorio(long numA, long numB) {
        long numeroAleatorio = (long)(Math.random()*(numB - numA +1)+numA);
        return numeroAleatorio;
    }

    // Generamos el número aleatorio en caso de que numA sea menor a numB
    public static long generarNumeroAleatorioIntercambio(long numA, long numB) {
        long numeroAleatorio = (long)(Math.random()*(numA - numB +1)+numB);
        return numeroAleatorio;
    }

    // Invertimos el numero random
    public static long invertirNumero(long numero) {
        long volteado=0;

        while (numero > 0) {
            volteado= (volteado*10) + numero%10;
            numero/=10;
        }
        return volteado;
    }

    // medimos la longitud del número
    public static int longitudNumero(long numero) {
        int longitud;
        longitud= String.valueOf(numero).length();
        return longitud;
    }

    // Calculamos cual es el digito mayor del número
    public static int calcularDigitoMayor(long numero) {
        int mayor=0;
        int digito;
        while (numero > 0) {
            digito = (int)numero%10;
            if (digito > mayor){
                mayor = digito;
            }
            numero/=10;
        }
        return mayor;
    }

    //Función para dibujar el gráfico
    public static void dibujarGrafico(long numero, boolean tipo) {

        long posicion;
        long invertido;
        
        int tope;
        int longitud;

        invertido=invertirNumero(numero);
        longitud=longitudNumero(numero);
        tope =calcularDigitoMayor(numero)+1;

        if (tipo ==true){

            while (longitud > 0) {
                posicion = invertido%10;

                for (int i = 0; i<tope; i++){
                    System.out.print(" ---");
                }
                
                System.out.println("");
                for (int j = 0; j<=tope; j++){
                    if (j==0){
                        System.out.print("| "+posicion);
                    } else if (j>0 && j<tope && j!=0){
                        if (j <=posicion) {
                            System.out.print(" | *");
                        } else {
                            System.out.print(" |  ");
                        }
                    } else if (j==tope){
                        System.out.print(" |");
                    }
                }

                System.out.println(""); 
                invertido/=10;
                longitud--;
            }
            for (int i = 0; i<tope; i++){
                System.out.print(" ---");
            }
        }



    }

}