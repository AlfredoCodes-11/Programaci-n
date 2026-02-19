package tema10.ObjetosArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ObjetosArray1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(2);
        numeros.add(3);
        numeros.add(7);
        numeros.add(13);

        numeros.add(1,34);

        if (numeros.contains(20)) {System.out.println("El número se ha encontrado.");}
        else {System.out.println("El número no esta en la lista.");}

        int pos = numeros.indexOf(7);

        if (pos != -1) {System.out.printf("El número se ha encontrado en la posición %d\n",pos);}

        System.out.println("total de elementos que contiene la lista: "+ numeros.size());

        numeros.remove(1);

        //FOREACH
        for (int item: numeros){
            System.out.printf("%d  ",item);
        }

        for (int i=0; i < numeros.size();i++){
            System.out.printf("%d  ", numeros.get(i));
        }

        // Convertimos la coleccion a un ARRAY:
        // Integer, Float, Persona, Perro, String...
        Object[] listado = numeros.toArray();

        for(int i = 0 ; i < listado.length; i++){
            System.out.printf("%s", listado[i]);
        }

        System.out.println("FIN ------");
    }
}
