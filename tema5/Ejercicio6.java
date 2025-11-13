package tema5;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        long numero;
        long numero1;
        int digitos=1;

        System.out.println("\033[1mNÚMERO DE DÍGITOS DE UN NÚMERO\033[0m");
        System.out.print("Introduzca un número y le diré cuántos dígitos tiene: ");
        numero=Long.parseLong(System.console().readLine());

        numero1= Math.abs(numero);
        while (numero1 >= 10){
            digitos++;
            numero1/=10;
        }

        System.out.printf("%d tiene %d digito/s",numero,digitos);
    }
}
