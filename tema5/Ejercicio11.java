package tema5;

public class Ejercicio11 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int total=1;
        int exponenInicial;

        System.out.println("Cálculo de una potencia");
        System.out.print("Introduzca la base: ");
        base=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente: ");
        exponente=Integer.parseInt(System.console().readLine());

        exponenInicial=exponente;

        while (exponente > 0) {
            total = total*base;
            exponente--;
        }
        System.out.printf("%d^%d = %d",base,exponenInicial,total);
    }
}
