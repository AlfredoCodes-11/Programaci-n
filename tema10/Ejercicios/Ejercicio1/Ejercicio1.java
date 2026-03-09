package tema10.Ejercicios.Ejercicio1;

import java.util.HashSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Juan");
        nombres.add("Isaac");
        nombres.add("Javier");
        nombres.add("Jorge");
        nombres.add("Jose");

        for(String item: nombres){
            System.out.println(item);
        }
    }
}
