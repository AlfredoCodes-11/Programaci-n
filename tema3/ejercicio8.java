package tema3;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int salario ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas tranajadas durante la semana: ");
        salario=sc.nextInt();
        System.out.printf("Su salario semanal es de %d euros.",salario*12);
    }
}
