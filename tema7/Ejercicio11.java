package tema7;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAXIMO=8;

        int[] coleccion = new int[MAXIMO];
        
        System.out.println("Introduzca 8 números enteros,pulse INTRO después de cada número: ");
        
        for (int i = 0; i < MAXIMO; i++){
            coleccion[i] = sc.nextInt();
        }

        for (int i = 0; i <MAXIMO;i++){
            if (coleccion[i]%2==0){
                System.out.println(coleccion[i]+ " par");
            } else {
                System.out.println(coleccion[i]+" impar");
            }
        }
    }
}
