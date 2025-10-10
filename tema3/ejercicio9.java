package tema3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        float altura;
        float base;
        double volumen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Volumen de un cono");
        System.out.println("---------------");
        System.out.print("Introduzca la altura (cm): ");
        altura=sc.nextFloat();
        System.out.print("Introduzca el radio de la base (cm): ");
        base=sc.nextFloat();
        volumen=(1.0/3.0)*Math.PI*Math.pow(base,2)*altura;
        System.out.printf("El volumen del cono es de %f cm³",volumen);
    }
}
