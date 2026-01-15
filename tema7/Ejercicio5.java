package tema7;

public class Ejercicio5 {
    public static void main(String[] args) {
        final int MAXIMO = 20;
        
        int aleatorio;

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i=0; i<MAXIMO;i++){
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
        }
        

        System.out.print("    n    |");
        System.out.print("    n2   |");
        System.out.print("    n3   |");
        System.out.println("");
        System.out.println("----------------------------------");


        for (int i=0; i<MAXIMO;i++){
            System.out.printf("%8d",numero[i]);
            System.out.print(" |");
            System.out.printf("%8d",cuadrado[i]);
            System.out.print(" |");
            System.out.printf("%8d",cubo[i]);
            System.out.println("");

        }
    }
}
