package tema5;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;

        System.out.print("Introduce tu edad: ");
        edad=Integer.parseInt(System.console().readLine());

        for (int i=1; i <=edad; i++) {
            System.out.print(i+ " ");
        }
    }
}
