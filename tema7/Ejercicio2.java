package tema7;

import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int numero;
        int respuesta;

        int[] array;
        array = new int[5];

        

        try {

            leer(array);

            System.out.print("Introduce un valor entre 1-5: ");
            respuesta=Integer.parseInt(System.console().readLine());

            System.out.println("El número es: "+array[respuesta-1]);
        } catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error: debe introducir un valor del 1 al 5");
        } catch(InputMismatchException ime) {
            System.out.println("Error: debe introducir un valor númerico entero.");
        }
    }

    /**
     * @param datos
     */
    public static void leer(int[] array) throws InputMismatchException {

        try {

            for (int i=0; i<5; i++){
                System.out.print("Introduzca un valor para el espacio "+ (i+1) + ": ");
                array[i]=Integer.parseInt(System.console().readLine());
            }
        } catch(InputMismatchException ime){
            throw ime;
        }
    }

    /**
     * @param datos
     */
    public static void mostrar(int[] datos) {

    }
}
