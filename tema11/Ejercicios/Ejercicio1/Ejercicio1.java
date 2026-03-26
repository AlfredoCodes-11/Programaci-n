package tema11.Ejercicios.Ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("datos.txt");
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write("Hola, este es un archivo de prueba.");
            bw.newLine();
            bw.write("Estamos aprendiendo a leer archivos en Java.");
            bw.newLine();
            bw.write("Cada línea representa un dato diferente.");
            bw.newLine();
            bw.write("Puedes añadir más líneas para probar el programa.");
            bw.newLine();
            bw.write("La lectura de archivos es fundamental en programación.");
            bw.newLine();
            bw.write("¡Sigue practicando y mejorando tus habilidades!");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
