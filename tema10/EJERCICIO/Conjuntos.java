package tema10.EJERCICIO;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        // HashSet<String> frutas = new HashSet<>();
        
        // frutas.add("Manzana");
        // frutas.add("Pera");
        // frutas.add("Plátano");
        // frutas.add("Uvas");
        // frutas.add("Frutas del bosque");
        // frutas.add("Kiwi");
        // frutas.add("Melocotón");
        // frutas.add("Sandía");
        // frutas.add("Melón");


        // if (frutas.add("Uvas")) {
        //     System.out.println("El elemento se ha insertado correctamente");
        // } else {
        //     System.out.println("El elemento ya existía en la colección");
        // }

        // for (String item: frutas){
        //     System.out.println(item);
        // }

        // //comprobar si la coleccion contiene un elemento
        // System.out.println("¿Contiene el elemento Kiwi?" + frutas.contains("Kiwi"));
        // System.out.println("¿Contiene el elemento Naranja?" + frutas.contains("Naranja"));

        HashSet<Integer> conjuntoA = new HashSet<>(Set.of(8,13,21,4));
        HashSet<Integer> conjuntoB = new HashSet<>(Set.of(5,13,17,1));

        System.out.println("CONJUNTOS\n==================================");
        System.out.println(conjuntoA);
        System.out.println(conjuntoB);


        /*System.out.println("UNION\n==================================");
        conjuntoA.addAll(conjuntoB);
        System.out.println(conjuntoA);*/

        /*System.out.println("INTERSECCIÓN\n==================================");
        conjuntoA.retainAll(conjuntoB);
        System.out.println(conjuntoA);*/


        System.out.println("DIFERENCIA\n==================================");
        conjuntoA.removeAll(conjuntoB);
        System.out.println(conjuntoA);
    }
}
