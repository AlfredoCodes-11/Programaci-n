package Ejercicio9;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) {

        File directorio;
        File fichero;
        String ruta;
        String nombre;
        String[] lista;
        int i;

        if (args.length != 2) {
            System.out.println("Uso: java GestionDirectorio <ruta_directorio> <fichero_borrar>");
        } else {

            ruta = args[0];
            nombre = args[1];

            directorio = new File(ruta);

            if (!directorio.exists()) {
                System.out.println("El directorio no existe.");
            } else {

                lista = directorio.list();

                System.out.println("Contenido del directorio:");

                for (i = 0; i < lista.length; i++) {

                    fichero = new File(ruta + "/" + lista[i]);

                    if (fichero.list() != null) {
                        System.out.println(lista[i] + " [CARPETA]");
                    } else {
                        System.out.println(lista[i] + " [ARCHIVO]");
                    }
                }

                fichero = new File(ruta + "/" + nombre);

                if (fichero.exists()) {

                    if (fichero.delete()) {
                        System.out.println("El fichero se ha borrado correctamente.");
                    } else {
                        System.out.println("No se pudo borrar el fichero.");
                    }

                } else {
                    System.out.println("El fichero no existe.");
                }
            }
        }
    }
}
