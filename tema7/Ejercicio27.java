package tema7;

public class Ejercicio27 {

   
    public static final int VACIO = 0;
    public static final int TESORO = 1;
    public static final int MINA = 2;
    public static final int INTENTO = 3;
     public static final int FILAS = 4;
    public static final int COLUMNA = 5;
    public static boolean encontradoMina = false;
    public static boolean encontradoTesoro = false;
    public static String hueco = "";
    public static int x;
    public static int y;
    public static int minaY;
    public static int minaX;
    public static int tesoroX;
    public static int tesoroY;

    public static void main(String[] args) {
        int[][] coleccion = new int[COLUMNA][FILAS];

        for(int i =0; i < COLUMNA-1; i++) {
            for(int t = 0; t < FILAS-1; t++) {
                coleccion[i][t] = VACIO;
            }
        }

        
        minaY=(int)(Math.random()*4);        
        minaX=(int)(Math.random()*5);
        coleccion[minaY][minaX]=MINA;

        do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
            coleccion[tesoroX][tesoroY] = TESORO;

        System.out.println("¡BUSCA EL TESORO!");
        dibujarMapa(coleccion);

        while (!encontradoMina || !encontradoTesoro){
            System.out.print("\nCoordenada x: ");
            x=Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            y=Integer.parseInt(System.console().readLine());
            
        }
    }

    public static void dibujarMapa(int[][] datos){
        for (int i =0; i < FILAS; i++ ){
            System.out.printf("%d|",i);
            for (int l = 0; l < COLUMNA; l++){
                System.out.printf("%s",hueco);
            }
            System.out.println("");
        }
        System.out.print(" ");
        for(int t =0; t<COLUMNA;t++){
            System.out.print("--");
        }
        System.out.println("");
        System.out.print("  ");
        for (int z=0; z<COLUMNA;z++){
            System.out.printf("%d ",z);
        }
    }
}
