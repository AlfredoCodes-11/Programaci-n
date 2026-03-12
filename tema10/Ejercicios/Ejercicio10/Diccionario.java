package tema10.Ejercicios.Ejercicio10;

import java.util.HashMap;

public class Diccionario {
    public static void main(String[] args) {
        
        String palabra;
        HashMap<String, String> diccionario = new HashMap<>();

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


        System.out.print("Escribe tu palabra en español: ");
        palabra=System.console().readLine().toLowerCase();


        if (diccionario.containsKey(palabra)) {
            System.out.println("Inglés: "+diccionario.get(palabra));
        } else {
            System.out.println("No esta traducida aun esa palabra.");
        }
        
    }
}
