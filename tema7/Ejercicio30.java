package tema7;

public class Ejercicio30 {

    public static final int MAXFILA = 3;
    public static final int MAXCOLUMNA = 3;
    public static final int TOTAL = MAXFILA*MAXCOLUMNA;

    public static char simbolo = ' ';
    public static void main(String[] args) {
        int[][] coleccion = new int[MAXFILA][MAXCOLUMNA];
        dibujarJuego(coleccion);


        //System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
    }

    public static void dibujarJuego(int datos[][]){
        for (int i = 0; i < MAXCOLUMNA; i++){
            System.out.print("-----");
        }
        System.out.println("");
        System.out.print("a |");
        for (int l = 0; l < MAXCOLUMNA; l++){
            System.out.printf("%s  |",simbolo);
        }
        System.out.println("");
        for (int i = 0; i < MAXCOLUMNA; i++){
            System.out.print("-----");
        }
        System.out.println("");
        System.out.print("b |");
        for (int l = 0; l < MAXCOLUMNA; l++){
            System.out.printf("%s  |",simbolo);
        }
        System.out.println("");
        for (int i = 0; i < MAXCOLUMNA; i++){
            System.out.print("-----");
        }
        System.out.println("");
        System.out.print("c |");
        for (int l = 0; l < MAXCOLUMNA; l++){
            System.out.printf("%s  |",simbolo);
        }
        System.out.println("");
        for (int i = 0; i < MAXCOLUMNA; i++){
            System.out.print("-----");
        }
        System.out.println("");
        for (int i= 1; i <=MAXCOLUMNA;i++ )
        System.out.printf("   %d",i);
    }

}
