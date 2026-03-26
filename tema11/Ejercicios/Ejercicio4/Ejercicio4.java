package tema11.Ejercicios.Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        int lineas = 0;
        int palabras = 0;
        int caracteres = 0;
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            

            while ((linea = br.readLine()) != null) {
                lineas++;

                caracteres += linea.length();

                String[] palabrasLinea = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    palabras += palabrasLinea.length;
                }
            }

            System.out.println("Total líneas leídas: " + lineas);
            System.out.println("Total de palabras: " + palabras);
            System.out.println("Total de caracteres: " + caracteres);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
