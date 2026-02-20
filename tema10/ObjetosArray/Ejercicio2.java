package tema10.ObjetosArray;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int tamano;
        int suma = 0;
        int maximo=0;
        int minimo=100;
        double media;
        ArrayList<Integer> numeros = new ArrayList<>();

        tamano = (int) ((Math.random()*11)+10);

        rellenar(tamano, numeros);

        for(int num:numeros){
            suma += num;

            if (num > maximo){
                maximo = num;
            }

            if (num < minimo) {
                minimo = num;
            }
        }

        media = suma / numeros.size();

        System.out.printf("SUMA  : %d\n",suma);
        System.out.printf("MEDIA : %.2f\n",((double)suma)/numeros.size());
        System.out.printf("MÁXIMO: %d\n",maximo);
        System.out.printf("MÍNIMO: %d\n",minimo);
    }

    public static void rellenar(int tamano, ArrayList<Integer> lista){
        int numero;
        for(int i=0; i < tamano; i++){
            numero = (int) (Math.random()*101);
            lista.add(numero);
        }
    }
}
