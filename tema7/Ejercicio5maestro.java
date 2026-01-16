package tema7;

public class Ejercicio5maestro {

    public static final int MAXIMO = 10;
    public static void main(String[] args) {
        

        int min;
        int max;
        int[]numeros = new int[MAXIMO];


        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
            numeros[0]=Integer.parseInt(System.console().readLine());

            min = numeros[0];
            max= numeros[0];
        for (int i=1; i<MAXIMO;i++){

            numeros[i]=Integer.parseInt(System.console().readLine());
            if (numeros[i] < min) { min = numeros[i];}

            if (numeros[i] > max) {max = numeros[i];}
        }
        System.out.println("Estos son los números con su máximo y mínimo:");
        for (int i =0; i < MAXIMO; i++){
            System.out.printf("%d ", numeros[i]);
            if (numeros[i] == min) {System.out.print("mínimo");}
            if (numeros[i] == max) {System.out.print("máximo");}
            System.out.println("");
        }
    }
}
