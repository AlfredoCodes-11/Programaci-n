package tema4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-Lunes");
        System.out.println("2-Martes");
        System.out.println("3-Miércoles");
        System.out.println("4-Jueves");
        System.out.println("5-Viernes");
        System.out.println("6-Sábado");
        System.out.println("7-Domingo");

        System.out.print("\nIntroduce el día de la semana: ");
        num = sc.nextInt();

        if (num >=1 && num <=5) {
            System.out.println("Es un día entre semana");
        } else if (num ==6 || num ==7){
            System.out.println("Es fin de semana");
        } else {
            System.out.println("**Error: no se corresponde con ningún día de semana");
        }
    }
}
