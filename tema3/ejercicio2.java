package tema3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        double cambio = 166.386;
        double pesetas;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de euros que quiere convertir: ");
        double euros = sc.nextDouble();

        pesetas = (euros * cambio);

        System.out.printf("%.2f euros son %.0f pesetas.", euros, pesetas);

    }
}
