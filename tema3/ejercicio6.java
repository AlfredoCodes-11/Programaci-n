package tema3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        float base;
        float altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Área de un triángulo");
        System.out.println("--------------------");
        System.out.print("Introduzca la longitud de la base (cm): ");
        base = sc.nextFloat();
        System.out.print("Introduzca la altura (cm): ");
        altura = sc.nextFloat();
        System.out.printf("El área de un triángulo es %.1f cm2", (base*altura)/2);
    }
}
