package tema5;

import java.util.Scanner;

public class Ejercicio43m {
    public static void main(String[] args) {
        
        int anchura;
        int altura;

        Scanner entrada = new Scanner(System.in);

        try {

        System.out.print("Introduce la anchura del rectángulo (como mínimo 2): ");
        anchura = entrada.nextInt();

        System.out.print("Introduce la altura (como mínimo 2): ");
        altura = entrada.nextInt();

        if ((anchura <= 2) || (altura <= 2)){
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y altura es 2.");
        } else {

            for (int j=0; j < altura; j++) {
                for (int i=0; i < anchura; i++) {
                    if ((j==0) || (j==altura-1) || (i==0) || (i==anchura-1) ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println("");
            }
        }

        } catch(Exception exception) {
            System.out.println("ERROR: la aplicación ha falldo.");
        }

    }
}
