package tema5;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero=0;
        int total=0;
        int suma=0;

        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");

        do{
            suma = suma+numero;
            System.out.print("? " );
            numero=Integer.parseInt(System.console().readLine());
            if (numero>0) {
                suma = suma+numero;
                total++;
            }
        } while (numero>0);

        System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d.",total,suma) ;
    }
}

// el while y el do while se suele utiliza cuando no se sabe a ciencia cierta 
// cuantas veces se va a ejecuatr el bucle y el for cuando si lo sé
