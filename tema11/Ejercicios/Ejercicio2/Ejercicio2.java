package tema11.Ejercicios.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {

        String linea;

        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } catch (IOException ioe) {
            System.out.println("Error al leer el archivo.");
        }   
    }
}
