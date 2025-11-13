package tema5;

public class Ejercicio25 {
    public static void main(String[] args) {
        
        int numero;
        int factorial=1;
        int contador;

        System.out.println("Por favor, introduzca un número entero: ");
        numero=Integer.parseInt(System.console().readLine());

        if (numero==0 || numero==1){
            factorial = 1;
        } else {
            for (contador =1; contador <=numero;contador++){
                factorial *=contador;
            }
        }

        System.out.printf("%d! = %d\n", numero,factorial);
    }
}
