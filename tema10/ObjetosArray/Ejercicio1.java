package tema10.ObjetosArray;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        boolean salir=false;
        String color="";

        ArrayList<String> colores = new ArrayList<>();

        do {
            System.out.print("Introduce colores, cuando quieras parar pulsa ENTER: ");
            color=System.console().readLine();
            if (color.equals("")){
                salir = true;
            } else {
                colores.add(color);
            }
        } while (!salir);

        /*if (colores.contains("ROJO")) {
            colores.remove("ROJO");
        }*/


        // Eliminar aquellos colores que contengar la letra R
        /*colores.removeIf((item) -> {
            return item.contains("R");
        });*/

        //colores.removeIf((item) -> item.toLowerCase().contains("r"));

        Collections.sort(colores);

        System.out.println("Tus colores son:");
        /*for (String item: colores){
            System.out.printf("%s  ",item);
        }*/


        // Convertimos la coleccion a un ARRAY:
        // Integer, Float, Persona, Perro, String...
        Object[] listado = colores.toArray();

        for(int i = 0 ; i < listado.length; i++){
            System.out.printf("%s  ", listado[i]);
        }
    }
}
