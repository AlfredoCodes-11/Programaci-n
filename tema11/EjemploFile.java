package tema11;

import java.io.File;

public class EjemploFile {
    public static void main(String[] args) {
        
        File archivo = new File(".");
        String[] listado = archivo.list();

        for (int i=0; i < listado.length; i++){
            System.out.println(listado[i]);
        }

        File esdla = new File(".archivo/texto.txt");

        if (esdla.exists()) {
            System.out.println("Se ha encontrado el archivo en el directorio");
        } else {
            System.out.println("No se ha encontrado el archivo en el directorio");
        }
    }
}
