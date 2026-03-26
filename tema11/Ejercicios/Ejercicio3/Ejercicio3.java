package tema11.Ejercicios.Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {

        String origen;
        String linea;

        System.out.print("Introduce el nombre del archivo origen: ");
        origen = System.console().readLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(origen));
            BufferedWriter bw = new BufferedWriter(new FileWriter("destino.txt"));

            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            bw.close();

            System.out.println("Archivo copiado correctamente");
        } catch (IOException ioe) {
            System.out.println("Error al copiar el archivo.");
        }
    }
}
