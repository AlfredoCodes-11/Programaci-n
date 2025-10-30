package tema5;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        int total=0;
        int suma=0;

        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");
        System.out.print("? " );
        numero=Integer.parseInt(System.console().readLine());

        while (numero>0) {
            suma = suma+numero;
            System.out.print("? " );
            numero=Integer.parseInt(System.console().readLine());
            total++;
        }
        System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d.",total,suma) ;
    }
}
