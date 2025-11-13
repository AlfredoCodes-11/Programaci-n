package tema5;

public class Ejercicio9 {
    public static void main(String[] args) {

        int numero;
        int temporal;
        int ant= 0; //el valor de anterior y de actual son inicialmente 
        int act=1;  // los indicados por la definicion de la serie de Fibonacci

        System.out.println("Por favor, introduzca un número entero: ");
        numero=Integer.parseInt(System.console().readLine());

        while (numero >=1) {

            System.out.print(ant + " ");

            temporal = ant + act;
            ant = act;
            act = temporal;

            numero--;
        }
        
    }
}
