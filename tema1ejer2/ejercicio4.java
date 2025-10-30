package tema1ejer2;

public class ejercicio4 {
    public static void main(String[] args) {
        String euros;
        double pesetas;
        double cambio=166.386;
        System.out.println("Euros: ");
        euros=System.console().readLine();
        pesetas=Double.parseDouble(euros);
        pesetas=pesetas*cambio;
        System.out.println(euros+" euros son "+ pesetas+ " pesetas");
    }
}