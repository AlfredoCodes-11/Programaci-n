package tema10.Ejercicios.Ejercicio19;

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
                System.out.println("No conozco esa palabra");

            } else {
                traduccion = diccionario.get(palabra);

                for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
                    if (entrada.getValue().equals(traduccion) && !entrada.getKey().equals(palabra)) {
                        sinonimos.add(entrada.getKey());
                    }
                }

                if (sinonimos.isEmpty()) {
                    System.out.println("No conozco sinónimos de esa palabra");

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
