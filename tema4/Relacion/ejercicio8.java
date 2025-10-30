package tema4.Relacion;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float totalPosi;
        float totalNega;
        float raiz;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax\u00B2 + bx = 0");
        System.out.println("Introduce los valores: ");
        System.out.print("a = ");
        a=sc.nextFloat();
        System.out.print("b = ");
        b=sc.nextFloat();
        System.out.print("c = ");
        c=sc.nextFloat();

        totalPosi= (float) ((-b+Math.sqrt((b*b)-4*a*c))/(2*a));
        totalNega= (float) ((-b-Math.sqrt((b*b)-4*a*c))/(2*a));
        raiz= (float) ((b*b)-4*a*c);

        if (a==0 && b==0 && c==0) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        } else if (a==0 && b==0) {
            System.out.println("La ecuación no tiene solución.");
        } else if (c==0) {
            System.out.printf("x1 = %.1f",totalPosi);
            System.out.printf("\nx2 = %.1f",totalNega);
        } else if (raiz < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else {
            System.out.printf("x1 = %.1f",totalPosi);
            System.out.printf("\nx2 = %.1f",totalNega);
        }
    }
}
