package tema7;

public class Ejercicio29 {

    public static final int FILS = 8;
    public static final int COLS = 8;
    public static int[][] coleccion = new int[FILS][COLS];
    public static String posicion;
    public static int col;
    public static int fil;
    public static int numero;
    public static char letra;
    public static int letra1;

    public static boolean salir=true;
    public static void main(String[] args) {
        
        System.out.print("Introduzca la posición del alfil: ");
        posicion=System.console().readLine().toLowerCase();

        col=(int) posicion.charAt(0)-97;
        fil=(int) posicion.charAt(1)-49;

        System.out.printf("El álfil puede moverse a las siguientes posiciones: %d %d\n",fil,col);
        if (fil<=FILS || col<=COLS) {
            while (col>0 && fil<FILS-1) {
                letra1=(fil++)+49;
                letra = (char)(letra1);
                System.out.printf("%c ",letra);
            }
        }
        /*while (col < 7 && fil < 7){
            for (int i = 0; i < )
        }

        System.out.printf("Fila: %d   Colm: %d",fil,col);*/
    }

    public static void posiciones(int[][] coleccion, boolean salir){
            if (fil<=FILS || col<=COLS && salir ) {
                for (int i =0;i<FILS;i++){
                    System.out.printf("%d ",coleccion[fil++][col--]);
                }
            } else {
                salir=false;
            }
    }
}
