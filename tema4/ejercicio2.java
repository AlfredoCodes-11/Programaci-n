package tema4;

public class ejercicio2 {
    public static void main(String[] args) {
        float nota;
        System.out.print("¿Qué nota has sacado en el últimp examen? ");
        nota= Float.parseFloat(System.console().readLine());
        if (nota >=0 && nota <=10) {
            if (nota >= 5) {
                System.out.println("¡Enhorabuena! ¡has aprobado!");
            } else {
                System.out.println("Lo siento :( Has suspendido.");
            }
        } else {
            System.out.println("La nota debe ser mayor o igual que 0 y menor o igual a 10");
        }
    }
}