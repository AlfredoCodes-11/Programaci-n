package tema3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        double cambio = 166.386;
        double euros;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de pesetas que quiere convertir: ");
        double pesetas = sc.nextDouble();

        euros = (pesetas / cambio);

        System.out.printf("%.0f euros son %.2f pesetas.", pesetas, euros);
    }
}
