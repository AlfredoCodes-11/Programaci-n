package tema4;

import java.util.Scanner;

public class satisfaccion {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Encuesta de satisfacción con el servicio ofrecido:");
        System.out.println("1. Insatisfecho");
        System.out.println("2. Satisfecho");
        System.out.println("3. Muy satisfecho");
        
        System.out.print("\nIntroduce tu opción (1-3): ");
        nota= sc.nextInt();

        if (nota == 1) {
            System.out.println("Lamentamos que no esté satisfecho. ¡Trabajaremos para mejorar!");
        } else if (nota == 2) {
            System.out.println("Gracias por su opinión");
        } else if (nota == 3) {
            System.out.println("Gracias por su opinión. Estamos muy contetos.");
        } else {
            System.out.println("Esa nota no es válida");
        }
    }
}
