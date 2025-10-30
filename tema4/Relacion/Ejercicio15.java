package tema4.Relacion;

public class Ejercicio15 {
    public static void main(String[] args) {

        int numero;
        int digito;
        char digitoCaracter;
        String cadena;

        System.out.print("Introduce un número entero: ");
        numero=Integer.parseInt(System.console().readLine());
        
        // digito= Math.abs(numero)%10;
       // digito=numero%10;
        //if (digito < 0) {
         //   digito=-1*digito;
       // }
        cadena=String.valueOf(numero);
        digitoCaracter=cadena.charAt(cadena.length()-1);
        System.out.printf("El último dígito del número introducido es el %c.\n",digitoCaracter);
    }
}
