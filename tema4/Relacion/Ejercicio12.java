package tema4.Relacion;

public class Ejercicio12 {
    public static void main(String[] args) {

        int numero;
        String parImpar;
        String divisible;

        System.out.print("Introduce un número entero: ");
        numero =Integer.parseInt(System.console().readLine());
        parImpar=(numero%2==0)?"par":"impar";
        divisible=(numero%5==0)?"divisible":"no divisible";

        System.out.printf("El numero introducido es %s y %s entre 5.\n", parImpar,divisible);
    }
}
