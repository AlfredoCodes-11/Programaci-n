package tema1ejer2;

import java.util.Scanner;

public class euros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros;
        double pesetas;

        System.out.print("Euros: ");
        euros = sc.nextDouble();  // Lee directamente como double
        pesetas = euros * 166.386;

        System.out.println(euros + " euros son " + pesetas + " pesetas");
    }
}

