package tema10.EJERCICIO;

import java.util.HashMap;
import java.util.Map.Entry;;

public class Mapas {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        
        mapa.put(924, "Cindy Nero");
        mapa.put(921, "Amalia Núñez");
        mapa.put(700, "Cesar Vázquez");
        mapa.put(219, "Victor Tilla");
        mapa.put(537, "Alan Brito");
        mapa.put(605, "Esteban Quito");

        // comprobar si existe un elemento
        if (mapa.containsKey(999)) {System.out.println("Si, el elemento existe.");}
        else {System.out.println("No, no existe");}

        if (mapa.get(999)==null){System.out.println("No existe.");}
        else {System.out.println("Si, existe.");}

        // recuperamos un valor asociado a una clave
        System.out.println(mapa.get(219));

        System.out.println("ELIGE CLAVE\n==============================");
        for (Integer indice: mapa.keySet()){
            System.out.printf("%d\n", indice);
        }


        System.out.println("COLECCIÓN DE NOMBRES\n==============================");
        for (String valor: mapa.values()){
            System.out.printf("%s\n", valor);
        }


        System.out.println("ELEMENTOS DEL MAPA\n===============================");
        for (Entry item : mapa.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
