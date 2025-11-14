package tema5;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        // final char CARACTER_DEFECTO='*';

        char caracter;

        int altura;
        int totalEspacio;
        int totalCaracteres;

        System.out.print("Introduzca la altura de la pirámide: ");
        altura=Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el carácter de relleno: ");
        caracter=System.console().readLine().charAt(0);

        totalEspacio=altura-1;
        totalCaracteres=1;

        for (int fila=1; fila <=altura; fila++) {

            // dibujamos espacios
            for (int col=1; col <= totalEspacio; col++) {
                System.out.print(" ");
            }
            
            // dibujamos caracteres
            for (int col=1; col <=totalCaracteres; col++) {
                System.out.print(caracter);
            }

            // hacemos salto de linea
            System.out.println("");

            totalEspacio--;
            totalCaracteres+=2;
        }
    }
}
