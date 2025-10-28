package tema4;

public class ejercicio3 {
    public static void main(String[] args) {
       final int NUM1 = 0;
       final int NUM2 =100;
       int num;
        System.out.print("Introduce un valor comprendido entre 1 y 100: ");
        num= Integer.parseInt(System.console().readLine());
        if (num >NUM1 && num <=NUM2) {
            System.out.println("¡Enhorabuena! ¡El valor introducido está en el rango indicado!");
        } else {
            System.out.println("¡Te he dicho un valor entre 1 y 100!");
        }
    }
}
