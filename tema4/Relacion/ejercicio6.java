package tema4.Relacion;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la primera nota: ");
        nota1=sc.nextFloat();
        System.out.print("Ahora introduzca la segunda nota: ");
        nota2=sc.nextFloat();
        System.out.print("Por último introduzca la tercera nota: ");
        nota3=sc.nextFloat();
        float total = (nota1+nota2+nota3)/3;
        System.out.printf("La media es de %.2f", total) ;
    }
}
