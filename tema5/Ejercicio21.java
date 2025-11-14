package tema5;

public class Ejercicio21 {
    public static void main(String[] args) {
        
        int altura;
        int totalEspacio;
        int totalCaracteres;

        System.out.print("Introduzca la altura de la pirámide: ");
        altura=Integer.parseInt(System.console().readLine());

        totalEspacio=altura-1;
        totalCaracteres=1;

        for (int fila=1; fila <=altura; fila++) {

            // dibujamos espacios
            for (int col=1; col <= totalEspacio; col++) {
                System.out.print(" ");
            }
            
            // dibujo secuencia numérica de la izquierda
            for (int col=1; col <=fila; col++) {
                    System.out.print(col);
            }

            // dibujo la secuencia numérica de la derecha
            for (int col = fila-1; col > 0; col--) {
                System.out.print(col);
            }

            // hacemos salto de linea
            System.out.println("");

            totalEspacio--;
            totalCaracteres+=2;
        }
    }
}
