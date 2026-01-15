package tema7;

import java.util.InputMismatchException;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int numero;
        int respuesta;

        int[] array;
        array = new int[10];

        try{

            leer(array);

            for (int i=9; i>=0; i--){
                System.out.print(" "+array[i]);
            }
        } catch (InputMismatchException ime) {
            System.out.println("Error: debe introducir un valor númerico entero.");
        } catch (NumberFormatException nfe) {
            System.out.println("Error: debe introducir un valor numerico");
        }
    }

    public static void leer(int[] datos) {
        for (int i=0; i<10; i++){
            System.out.print("Introduzca un valor para el espacio "+ (i+1) + ": ");
            datos[i]=Integer.parseInt(System.console().readLine());
        }
    }
}
