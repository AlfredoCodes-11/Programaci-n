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
            case 1,2,3,4,5: System.out.println("Es un dia entre semana");
                break;
            case 6: System.out.println("Es fin de semana");
                break;
            case 7: System.out.println("Es fin de semana");
                break;
            default: System.out.println("No es un día válido");
        }
    }            
}
