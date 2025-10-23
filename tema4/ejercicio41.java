package tema4;

import java.util.Scanner;

public class ejercicio41 {
    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-Lunes");
        System.out.println("2-Martes");
        System.out.println("3-Miércoles");
        System.out.println("4-Jueves");
        System.out.println("5-Viernes");
        System.out.println("6-Sábado");
        System.out.println("7-Domingo");

        System.out.print("\nIntroduce el día de la semana: ");
        dia = sc.nextInt();

        switch (dia) {
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
