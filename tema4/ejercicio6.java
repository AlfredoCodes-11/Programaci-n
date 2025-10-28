package tema4;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int num;
        float valor1;
        float valor2;
        float calc;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-Área del cuadrado");
        System.out.println("2-Área del rectángulo");
        System.out.println("3-Área del triángulo");

        System.out.print("Introduce el área que quieras calcular: ");
        num=sc.nextInt();


        switch (num) {
            case 1: System.out.print("Introduce lado 1 del cuadrado: ");
                    valor1=sc.nextFloat();
                    System.out.print("Introduce lado 2 del cuadrado: ");
                    valor2=sc.nextFloat();
                    calc= valor1*valor2;
                    System.out.printf("El área del cuadrado es: %.2f",calc);
                break;
            case 2: System.out.print("Introduce base del rectángulo: ");
                    valor1=sc.nextFloat();
                    System.out.print("Introduce altura del rectángulo: ");
                    valor2=sc.nextFloat();
                    calc= valor1*valor2;
                    System.out.printf("El área del rectángulo es: %.2f",calc);
                break;
            case 3: System.out.print("Introduce base del triángulo: ");
                    valor1=sc.nextFloat();
                    System.out.print("Introduce altura del triángulo: ");
                    valor2=sc.nextFloat();
                    calc= (valor1*valor2)/2;
                    System.out.printf("El área del triángulo es: %.2f",calc);
                break;
            default: System.out.print("Número no válido");
                break;
        }
    }
}
