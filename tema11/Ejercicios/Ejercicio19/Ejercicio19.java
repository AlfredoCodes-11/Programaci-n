package Ejercicio19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Ejercicio19 {
    public static void main(String[] args) {

        File fichero;
        HashMap<String, String> diccionario;

        String linea;
        String palabra;
        String traduccion;
        String opcion;

        diccionario = new HashMap<String, String>();

        if (args.length != 1 && args.length != 3) {
            System.out.println("Uso:");
            System.out.println("Modo interactivo: java Diccionario fichero.txt");
            System.out.println("Modo directo: java Diccionario fichero.txt palabra traduccion");
        } else {

            fichero = new File(args[0]);

            if (!fichero.exists()) {
                System.out.println("ERROR: el archivo no existe.");
            } else {

                try {
                    // -------- LEER FICHERO --------
                    FileReader archivo = new FileReader(args[0]);
                    BufferedReader br = new BufferedReader(archivo);

                    linea = br.readLine();

                    while (linea != null) {
                        String[] partes = linea.split(" ");
                        diccionario.put(partes[0], partes[1]);
                        linea = br.readLine();
                    }

                    br.close();

                    // -------- CASO 3 ARGUMENTOS --------
                    if (args.length == 3) {

                        palabra = args[1];
                        traduccion = args[2];

                        if (diccionario.containsKey(palabra)) {
                            System.out.println("La palabra \"" + palabra + "\" ya existe en el diccionario.");
                        } else {
                            diccionario.put(palabra, traduccion);
                            System.out.println("Palabra añadida correctamente.");

                            FileWriter archivo2 = new FileWriter(args[0]);
                            BufferedWriter bw = new BufferedWriter(archivo2);

                            for (String clave : diccionario.keySet()) {
                                bw.write(clave + " " + diccionario.get(clave));
                                bw.write("\n");
                            }

                            bw.close();
                        }
                    }

                    // -------- CASO MENU --------
                    else {

                        BufferedReader teclado = new BufferedReader(new java.io.InputStreamReader(System.in));

                        opcion = "";

                        while (!opcion.equals("3")) {

                            System.out.println("1. Buscar palabra");
                            System.out.println("2. Añadir palabra");
                            System.out.println("3. Salir");

                            opcion = teclado.readLine();

                            if (opcion.equals("1")) {

                                System.out.print("Palabra: ");
                                palabra = teclado.readLine();

                                if (diccionario.containsKey(palabra)) {
                                    System.out.println(diccionario.get(palabra));
                                } else {
                                    System.out.println("No encontrada.");
                                }
                            }

                            else if (opcion.equals("2")) {

                                System.out.print("Palabra español: ");
                                palabra = teclado.readLine();

                                System.out.print("Traducción inglés: ");
                                traduccion = teclado.readLine();

                                if (diccionario.containsKey(palabra)) {
                                    System.out.println("La palabra ya existe.");
                                } else {
                                    diccionario.put(palabra, traduccion);
                                    System.out.println("Añadida correctamente.");
                                }
                            }
                        }

                        // Guardar al salir
                        FileWriter archivo2 = new FileWriter(args[0]);
                        BufferedWriter bw = new BufferedWriter(archivo2);

                        for (String clave : diccionario.keySet()) {
                            bw.write(clave + " " + diccionario.get(clave));
                            bw.write("\n");
                        }

                        bw.close();
                    }

                } catch (IOException ioe) {
                    System.out.println("Error con el fichero");
                }
            }
        }
    }
}
