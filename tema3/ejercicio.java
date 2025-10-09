package tema3;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa multiplca dos números enteros.");
        System.out.print("Por favor, introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2= sc.nextInt();
        System.out.printf("%d * %d = %d \n", num1 , num2 ,  num1*num2);
    }
}
