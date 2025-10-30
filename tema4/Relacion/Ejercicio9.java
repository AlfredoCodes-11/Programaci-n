package tema4.Relacion;

public class Ejercicio9 {
    public static void main(String[] args) {
        int mes;
        int dia;

        System.out.println("Este programa te dirá cuál es tu horóscopo.");
        System.out.print("Introduce el número del mes en que nació (1-12): ");
        mes=Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduce el día: ");
        dia=Integer.parseInt(System.console().readLine());
        if (dia>=32){
            System.out.println("Fecha no válida.");
            } else if (mes==1 && dia<=19) {
            System.out.println("Su horóscopo es capricornio.");
            } else if (mes==12 && dia>=22) {
            System.out.println("Su horóscopo es capricornio.");
            } else if (mes==1 && dia>=20) {
            System.out.println("Su horóscopo es acuario.");
            } else if (mes==2 && dia<=18) {
            System.out.println("Su horóscopo es acuario.");
            } else if (mes==2 && dia>=19) {
            System.out.println("Su horóscopo es piscis.");
            } else if (mes==3 && dia<=20) {
            System.out.println("Su horóscopo es piscis.");
            } else if (mes==3 && dia>=21) {
            System.out.println("Su horóscopo es aries.");
            } else if (mes==4 && dia<=19) {
            System.out.println("Su horóscopo es aries.");
            } else if (mes==4 && dia>=20) {
            System.out.println("Su horóscopo es tauro.");
            } else if (mes==5 && dia<=20) {
            System.out.println("Su horóscopo es tauro.");
            } else if (mes==5 && dia>=21) {
            System.out.println("Su horóscopo es géminis.");
            } else if (mes==6 && dia<=20) {
            System.out.println("Su horóscopo es géminis.");
            } else if (mes==6 && dia>=21) {
            System.out.println("Su horóscopo es cáncer.");
            } else if (mes==7 && dia<=22) {
            System.out.println("Su horóscopo es cáncer.");
            } else if (mes==7 && dia>=23) {
            System.out.println("Su horóscopo es leo.");
            } else if (mes==8 && dia<=22) {
            System.out.println("Su horóscopo es leo.");
            } else if (mes==8 && dia>=23) {
            System.out.println("Su horóscopo es virgo.");
            } else if (mes==9 && dia<=22) {
            System.out.println("Su horóscopo es virgo.");
            } else if (mes==9 && dia>=23) {
            System.out.println("Su horóscopo es libra.");
            } else if (mes==10 && dia<=22) {
            System.out.println("Su horóscopo es libra.");
            } else if (mes==10 && dia>=23) {
            System.out.println("Su horóscopo es escorpio.");
            } else if (mes==11 && dia<=21) {
            System.out.println("Su horóscopo es escorpio.");
            } else if (mes==11 && dia>=22) {
            System.out.println("Su horóscopo es sagitario.");
            } else if (mes==12 && dia<=21) {
            System.out.println("Su horóscopo es sagitario.");
        } else {
            System.out.println("Fecha no válida.");
        }
    }
}
