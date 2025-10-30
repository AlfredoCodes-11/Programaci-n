package tema4.Relacion;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        final int MEDIANOCHE=86400;
        int horas;
        int minutos;
        int horasSegundos;
        int minutosSegundos;
        int total;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        horas=sc.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos=sc.nextInt();

        horasSegundos=horas*3600;
        minutosSegundos=minutos*60;
        total=MEDIANOCHE-(horasSegundos+minutosSegundos);

        if (horas<=24 && minutos<=60) {
            System.out.printf("Desde las %d:%d hasta la medianoche faltan %d segundos.",horas,minutos,total);
        } else {
            System.out.println("Hora no válida Hora (0-24), Minutos (0-60).");
        }
    }
}
