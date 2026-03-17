package tema10.Ejercicios.Ejercicio19;

import java.util.HashMap;
import java.util.Map.Entry;

public class Diccionario {
    public static void main(String[] args) {
        
        String palabra;
        String valor;
        String sinonimos="";

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");


        System.out.print("Indroduzca una palabra y le daré los sinónimos: ");
        palabra=System.console().readLine().toLowerCase();

        if (!diccionario.containsKey(palabra)){
            System.out.println("No conozco esa palabra.");
        } else {
            valor= diccionario.get(palabra);
            if (!diccionario.containsValue(valor)) {
                System.out.println("No conozco sinónimos de esa palabras.");
            }

            for(Entry item: diccionario.entrySet()){
                if (item.getValue().equals(valor) && !item.getKey().equals(palabra) && sinonimos.equals("")) {
                    sinonimos= (String)item.getKey();
                    sinonimos+= ", ";
                } else if (item.getValue().equals(valor) && !item.getKey().equals(palabra)){
                    sinonimos+= (String)item.getKey();
                }
                
            }

            System.out.printf("Sinónimos de %s: %s", palabra, sinonimos);
        }
 }   
}
