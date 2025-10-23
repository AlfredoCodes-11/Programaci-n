package tema4;

public class ejercicio21 {
    public static void main(String[] args) {
        float nota;

        System.out.print("¿Qué nota has sacado en el últimp examen? ");
        nota= Float.parseFloat(System.console().readLine());
        if (nota >=0 && nota <=10) {
            System.out.println((nota >= 5) ? "¡Enhorabuena! ¡has aprobado!" : "Lo siento :( Has suspendido.");
        } else {
            System.out.println("La nota debe ser mayor o igual que 0 y menor o igual a 10");
        }
    }
}