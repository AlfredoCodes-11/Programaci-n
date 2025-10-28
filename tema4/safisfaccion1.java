package tema4;

import java.util.Scanner;

public class safisfaccion1 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Encuesta de satisfacción con el servicio ofrecido:");
        System.out.println("1. Insatisfecho");
        System.out.println("2. Satisfecho");
        System.out.println("3. Muy satisfecho");
    
        System.out.print("\nIntroduce tu opción (1-3): ");
        nota= sc.nextInt();

        switch (nota) {
            case 1: System.out.println("Lamentamos que no esté satisfecho. ¡Trabajaremos para mejorar!");
                break;
            case 2: System.out.println("Gracias por su opinión");
                break;
            case 3: System.out.println("Gracias por su opinión. Estamos muy contetos.");
                break;
            default: System.out.println("Esa nota no es válida");
        }
    }
}
