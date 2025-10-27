package tema4.Relacion;

public class ejercicio3 {
    public static void main(String[] args) {
        int horas;
        int sueldo1 = 12;
        int sueldo2= 16;
        
        System.out.print("Introduzca el número de horas tranajadas durante la semana: ");
        horas= Integer.parseInt(System.console().readLine());

        switch (horas) {
            case 0-40 : 
            System.out.printf("El sueldo semanal que le corresponde es de %d euros",horas*sueldo1);
                break;
            default: System.out.printf("El sueldo semanal que le corresponde es de %d euros",horas*sueldo2);
                break;
        }
    }
}
