package tema10.Ejercicios.Ejercicio20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionariob {
    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sinonimos = new ArrayList<>();
        String palabra = "";
        String traduccion = "";
        String resultado = "";
        String respuesta = "";
        String nuevaPalabra = "";
        String nuevaTraduccion = "";

        diccionario.put("caliente",  "hot");
        diccionario.put("rojo",      "red");
        diccionario.put("ardiente",  "hot");
        diccionario.put("verde",     "green");
        diccionario.put("agujetas",  "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro",    "iron");
        diccionario.put("grande",    "big");

        System.out.print("Introduzca una palabra y le daré los sinónimos: ");
        palabra = sc.nextLine().toLowerCase();

        while (!palabra.equals("salir")) {

            sinonimos.clear();

            if (!diccionario.containsKey(palabra)) {

                System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
                respuesta = sc.nextLine().toLowerCase();

                if (respuesta.equals("s")) {
                    System.out.print("Introduzca la traducción de " + palabra + " en inglés: ");
                    nuevaTraduccion = sc.nextLine().toLowerCase();
                    diccionario.put(palabra, nuevaTraduccion);
                }

            } else {

                traduccion = diccionario.get(palabra);

                for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
                    if (entrada.getValue().equals(traduccion) && !entrada.getKey().equals(palabra)) {
                        sinonimos.add(entrada.getKey());
                    }
                }

                if (sinonimos.isEmpty()) {

                    System.out.print("No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): ");
                    respuesta = sc.nextLine().toLowerCase();

                    if (respuesta.equals("s")) {
                        System.out.print("Introduzca un sinónimo de " + palabra + ": ");
                        nuevaPalabra = sc.nextLine().toLowerCase();
                        diccionario.put(nuevaPalabra, traduccion);
                        System.out.println("Gracias por enseñarme nuevos sinónimos.");
                    }

                } else {

                    resultado = "Sinónimos de " + palabra + ": ";
                    for (int i = 0; i < sinonimos.size(); i++) {
                        if (i < sinonimos.size() - 1) {
                            resultado = resultado + sinonimos.get(i) + ", ";
                        } else {
                            resultado = resultado + sinonimos.get(i);
                        }
                    }
                    System.out.println(resultado);
                }
            }

            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            palabra = sc.nextLine().toLowerCase();
        }

        sc.close();
        System.out.println("¡Hasta luego!");
    }
}
