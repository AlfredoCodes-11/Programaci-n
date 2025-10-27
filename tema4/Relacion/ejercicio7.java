package tema4.Relacion;

import java.util.Scanner;

public class ejercicio7 {
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
        
        if (total >=0 && total < 5) {
            System.out.println("\nInsuficiente");
        } else if (total >=5 && total <6) {
            System.out.println("\nSuficiente");
        } else if (total >= 6 && total <7 ) {
            System.out.println("\nBien");
        } else if (total >=7 && total <9) {
            System.out.println("\nNotable");
        } else if (total >=9 && total <=10) {
            System.out.println("\nSobresaliente");
        } else {
            System.out.println("\nAlgún dato incorrecto");
        }
    }
}
