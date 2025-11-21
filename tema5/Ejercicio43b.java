package tema5;

import java.util.Scanner;

public class Ejercicio43b {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b]2J\u001b[H";
        final int MINIMO = 3;

        int lado;
        int temporal;


        Scanner entrada = new Scanner(System.in);

        try {
        
        System.out.println(BORRAR);

        System.out.printf("Introduce la anchura máxima del cuadrado (como mínimo 3): ");
        lado = entrada.nextInt();

        temporal = lado;

        if (lado <MINIMO){
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y altura es 2.");
        } else {
            while (true) {
                do {
                    dibujarCuadrado(lado);
                    Thread.sleep(100);
                    System.out.print(BORRAR);
                    lado--;
                } while (lado >=MINIMO);

                do {
                    dibujarCuadrado(lado);
                    Thread.sleep(100);
                    System.out.print(BORRAR);
                    lado++;
                } while (lado < temporal);
            }
        }

        } catch(Exception exception) {
            System.out.println("ERROR: la aplicación ha falldo.");
        }

    }

    public static void dibujarCuadrado(int lado) {

        for (int j=0; j < lado; j++) {
            for (int i=0; i < lado; i++) {
                if ((j==0) || (j==lado-1) || (i==0) || (i==lado-1) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
}
