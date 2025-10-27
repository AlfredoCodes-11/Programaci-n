package tema4.Relacion;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String dia;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana y diré qué asignatura toca a primera hora ese día: ");
        dia=sc.nextLine();

        if (dia.equalsIgnoreCase("lunes")){
            System.out.printf("\033[1mPROGRAMACIÓN\033[0m");
        } else if (dia.equalsIgnoreCase("martes")) {
            System.out.printf("\033[1mBASE DE DATOS\033[0m");
        } else if (dia.equalsIgnoreCase("miércoles")) {
            System.out.printf("\033[1mSISTEMA INFORMÁTICOS\033[0m");
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.printf("\033[1mLENGUAJE DE MARCAS\033[0m");
        } else if (dia.equalsIgnoreCase("viernes")) {
            System.out.printf("\033[1mPROGRAMACIÓN\033[0m");
        } else {
            System.out.printf("Día no válido (comprueba que este bien escrito con sus tildes si tiene).");
        }
    }
}
