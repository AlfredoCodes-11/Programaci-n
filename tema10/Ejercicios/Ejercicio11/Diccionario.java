package tema10.Ejercicios.Ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Diccionario {
    public static void main(String[] args) {
        
     
        HashMap<String, String> diccionario = new HashMap<>();
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        HashSet<String> conjunto = new HashSet<>();
        String[] claves = diccionario.keySet().toArray(new String[0]);

        int aciertos =0;
        int errores =0;
        int palabra;
        String respuesta;
        

        diccionario.put("coche", "Car");
        diccionario.put("manzana", "Apple");
        diccionario.put("gato", "Cat");
        diccionario.put("perro", "Dog");
        diccionario.put("teléfono", "Phone");
        diccionario.put("ordenador", "Computer");
        diccionario.put("pantalla", "Screen");
        diccionario.put("naranja", "Orange");
        diccionario.put("azul", "Blue");
        diccionario.put("mesa", "Table");
        diccionario.put("silla", "Chair");
        diccionario.put("tenedor", "Fork");
        diccionario.put("cuchara", "Spoon");
        diccionario.put("cuchillo", "Knife");
        diccionario.put("miel", "Honey");
        diccionario.put("tomate", "Tomato");
        diccionario.put("patata", "Potato");
        diccionario.put("lechuga", "Lettuce");
        diccionario.put("pared", "Wall");
        diccionario.put("suelo", "Floor");


        do {
            palabra = ((int)(Math.random()*20));
            conjunto.add(claves[palabra]);
        } while (conjunto.size() < 5);
        

        for (int i = 0; i < 5; i++) {
            palabra = ((int)(Math.random()*20));
            conjunto.add(claves[palabra]);

            System.out.print("Traduce " + palabra + " al inglés: ");
            respuesta=System.console().readLine().toLowerCase();

            if (respuesta.equals(diccionario.get(palabra))) {
                aciertos++;
            } else {
                errores++;
            }
        }

        System.out.println("\nEl resultado es:");
        System.out.printf("Aciertos: %d",aciertos);
        System.out.printf("Errores: %d",errores);

        
    }
}
