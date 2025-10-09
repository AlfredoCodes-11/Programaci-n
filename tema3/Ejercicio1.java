package tema3;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Este programa multiplca dos números enteros.");
        System.out.print("Por favor, introduzca el primer número: ");
        num1=Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        num2=Integer.parseInt(System.console().readLine());
        System.out.printf("%d * %d = %d \n", num1 , num2 ,  num1*num2);
    }
}
