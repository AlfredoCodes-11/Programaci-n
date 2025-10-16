package tema3;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        float mb;
        float kb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de Mb: ");
        mb=sc.nextFloat();
        kb=mb*1024;
        System.out.printf("%.2fMb son %.2fKb",mb,kb) ;
    }
}