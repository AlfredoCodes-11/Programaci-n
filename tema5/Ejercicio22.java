package tema5;

public class Ejercicio22 {
    public static void main(String[] args) {
        
        int numero;
        int temporal;
        int resultado=0;

        System.out.print("Introduzca un número entero: ");
        numero=Integer.parseInt(System.console().readLine());

        temporal=numero;

        // giramos el número
        while (temporal > 0) {
            resultado = (resultado*10) + temporal%10;
            temporal /=10;
        }

        System.out.printf("Si le damos la vuelta al %d tenemos el %d\n", numero, resultado);

    }
}
