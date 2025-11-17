package tema5;

public class Ejercicio23 {
    public static void main(String[] args) {
        
        int numero;
        int digito;
        int posicion = 1;
        int volteado=0;
        int longitud=0;

        // String.valueOf

        try {
            System.out.print("Introduzca un número entero: ");
            numero=Integer.parseInt(System.console().readLine());

            System.out.print("Introduzca un dígito: ");
            digito=Integer.parseInt(System.console().readLine());

            System.out.printf("Contando de izquierda a derecha, el %d aparece dentro del %d en las siguientes posiciones: ",digito, numero);

            // giramos el número
            while (numero > 0) {
                volteado = (volteado*10) + (numero%10);
                numero /= 10;
                longitud++;
            }

            // calcular la longitud del número
            // longitud

            // calculamos posiciones
            for ( ; longitud > 0; longitud--) {
                if (volteado%10 == digito) {
                    System.out.printf("%d ",posicion);
                }
                volteado /=10;
                posicion++;
            }
        } catch ( Exception exception) {
            System.out.println("***Error número no válido.");
        }
    }
}
