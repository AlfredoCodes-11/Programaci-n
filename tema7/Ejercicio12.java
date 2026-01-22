package tema7;

public class Ejercicio12 {
    public static final int MAXIMO = 10;

    public static int[] coleccion = new int[MAXIMO];
    public static void main(String[] args) {

        System.out.println("Introduce 10 valores para el array:");

        for (int i = 0; i < MAXIMO; i++){
            coleccion[i]=Integer.parseInt(System.console().readLine());
        }

        dibujarGrafica(coleccion);

        
    }
    public static void dibujarGrafica(int[] datos){
        System.out.print("Índice |");
        for (int i = 0; i < MAXIMO; i++){
            System.out.printf("%3d  |", i);
        }

        System.out.println();
        System.out.print("--------");

        for (int i = 1; i <= MAXIMO; i++){
            System.out.print("------");
        }

        System.out.println();

        System.out.print("Valor  |");

        for (int i = 0; i < MAXIMO; i++){
            System.out.printf("%3d  |",datos[i]);
        }
    }
}
