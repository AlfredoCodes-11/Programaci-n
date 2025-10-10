package tema3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        float base;
        double iva;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base imponible (precio del artículo sin IVA): ");
        base=sc.nextFloat();
        iva=base*0.21;
        System.out.println("Base imponible\t"+base+" \u20AC");
        System.out.println("IVA (21%)\t"+base*0.21+" \u20AC");
        System.out.printf("--------------------\n");
        System.out.printf("Total\t\t%.2f \u20AC",base+iva);

    }
}
