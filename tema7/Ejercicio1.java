package tema7;

import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {

        int usuario;
        
        int[] numero;
        numero = new int[5];

        numero[0]= 11;
        numero[1]= 21;
        numero[2]= 34;
        numero[3]= 65;
        numero[4]= 54;
        
        try {

            System.out.print("Introduce un valor entre 1-5: ");
            usuario=Integer.parseInt(System.console().readLine());

            System.out.println("El número es: "+numero[usuario-1]);
        } catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error: debe introducir un valor del 1 al 5");
        } catch(InputMismatchException ime) {
            System.out.println("Error: debe introducir un valor númerico entero.");
        }
    }
}
