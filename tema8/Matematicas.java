package tema8;

import java.util.Scanner;

public class Matematicas {
    public static int voltea(int numero) {

         int volteado = 0 ;

         while (numero > 0) {
            volteado = (volteado*10) + (numero%10);
            numero /=10;
         }
         return volteado;
        
    }

    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    public static boolean esPrimo(int numero) {
        
        boolean x=true;

        if (numero < 2) {
            for (int i = numero /2; i >= 2; i--) {
                if (numero % i ==0) {
                    x=false;
                }
            }
        } else {
            x=true;
        }
        return x;
    }

    public static int siguientePrimo(int numero) {
        while (!esPrimo(++numero)){};

        return numero;
    }

    public static double potencia(int base, int exponente) {
        double n=1;
        if (exponente == 0) {
            n=1;
        } else if (exponente < 0) {
            n= 1/potencia(base, -exponente);
        } else {
            for (int i = 0; i < Math.abs(exponente); i++){
            n = n*base;
            }
        }
        return n;
    }
}


