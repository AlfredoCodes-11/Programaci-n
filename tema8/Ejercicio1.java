package tema8;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        
        System.out.println(leerValor());
    }



    public static int leerValor() {

        int numero;
        
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            if (numero <= 2) {
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.print("Introduzca un nuevo valor: ");
            }
        } while ( numero <= 2 );
        
        sc.close();

        return numero;
    }
}
