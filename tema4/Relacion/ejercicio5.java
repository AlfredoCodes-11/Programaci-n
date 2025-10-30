package tema4.Relacion;

public class ejercicio5 {
    public static void main(String[] args) {
        float altura;
        final float G = 9.81f;
        System.out.println("Cálculo del tiempo de caída de un objeto");
        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        altura=Float.parseFloat(System.console().readLine());
        float caida;
        caida = (float)(Math.sqrt(2*altura/G));
        if (altura > 0) {
            System.out.printf("El objeto tarda %.3f segundos",caida); ;
        } else {
            System.out.println("Altura no válida.");
        }
    }
}
