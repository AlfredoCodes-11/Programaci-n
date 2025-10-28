package tema4;

public class ejercicio1 {
    public static void main(String[] args) {
        int edad;
        System.out.print("Introduce tu edad: ");
        edad = Integer.parseInt(System.console().readLine());

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            if (18 <=edad && edad < 65 ) {
                System.out.println("Estás en activo");
            } else {
                System.out.println("Estás jubilado");
            }
        }
    }
}
