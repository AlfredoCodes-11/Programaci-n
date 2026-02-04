package tema7;

public class Ejercicio29 {

    public static final int FILS = 8;
    public static final int COLS = 8;
    public static int[][] coleccion = new int[FILS][COLS];
    public static int col;
    public static int fil;
    public static int letra;
    public static int numero;
    
    public static String posicion;

    public static boolean salir=true;
    public static void main(String[] args) {
        
        System.out.print("Introduzca la posición del alfil: ");
        posicion=System.console().readLine().toLowerCase();

        col=(int) posicion.charAt(0)-97;
        fil=(int) posicion.charAt(1)-49;

        System.out.print("El álfil puede moverse a las siguientes posiciones:\n");

        posiciones(col, fil);
    }
    /**
     * 
     * @param col
     * @param fil
     */
    public static void posiciones(int col, int fil){
        if (fil<=FILS && col<=COLS) {
            while (col>0 && fil<FILS-1) {
                letra=(col--)+96;
                numero=(fil++)+50;
                System.out.printf("%c",letra);
                System.out.printf("%c ",numero);
            }
            col=(int) posicion.charAt(0)-97;
            fil=(int) posicion.charAt(1)-49;
            while (col<COLS-1 && fil<FILS-1) {
                letra=(col++)+98;
                numero=(fil++)+50;
                System.out.printf("%c",letra);
                System.out.printf("%c ",numero);
            }
            col=(int) posicion.charAt(0)-97;
            fil=(int) posicion.charAt(1)-49;
            while (col>0 && fil>0) {
                letra=(col--)+96;
                numero=(fil--)+48;
                System.out.printf("%c",letra);
                System.out.printf("%c ",numero);
            }
            col=(int) posicion.charAt(0)-97;
            fil=(int) posicion.charAt(1)-49;
            while (col<COLS-1 && fil>0) {
                letra=(col++)+98;
                numero=(fil--)+48;
                System.out.printf("%c",letra);
                System.out.printf("%c ",numero);
            }
        }
    }
}
