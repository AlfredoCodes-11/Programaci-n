package tema5;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        

        int numero;
        int contador=0;
        int maxPar=0;
        int contadorImpar=0;
        int sumaImpar=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");
        numero= sc.nextInt();

        while (numero > 0) {
            numero= sc.nextInt();
            contador ++;
            if (esPar(numero)==true){
                if (numero > maxPar){
                    maxPar = numero;
                }
            } else {
                sumaImpar+=numero;
                contadorImpar++;
            }
        }

        System.out.printf("Ha introducido %d números positivos.\n", contador);
        System.out.printf("La media de los impares es %d.\n", sumaImpar/contadorImpar);
        System.out.printf("El máximo de los pares es %d\n", maxPar);

    }


    public static boolean esPar(int numero) {
        boolean pares = numero%2==0;
        return pares;
    }
}
