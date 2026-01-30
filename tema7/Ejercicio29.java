package tema7;

public class Ejercicio29 {

    public static final int FILS = 8;
    public static final int COLS = 8;
    public static int[][] coleccion = new int[FILS][COLS];
    public static String posicion;
    public static int col;
    public static int fil;
    public static void main(String[] args) {
        
        System.out.print("Introduzca la posición del alfil: ");
        posicion=System.console().readLine().toLowerCase();

        col=(int) posicion.charAt(0)-97;
        fil=(int) posicion.charAt(1)-49;

        System.out.printf("El álfil puede moverse a las siguientes posiciones: %d %d",fil,col);
        /*while (col < 7 && fil < 7){
            for (int i = 0; i < )
        }

        System.out.printf("Fila: %d   Colm: %d",fil,col);*/
    }

    public static void inicializarArray(int[][] coleccion){
        for (int i = 0; i < FILS; i++){
            for (int l = 0; l < COLS; l++){
                
            }
        }
    }
}
