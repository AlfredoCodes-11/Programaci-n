package tema11.Repaso;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import clases.*;
import tema11.Repaso.clases.Enemigo;
import tema11.Repaso.clases.Heroe;

public class Demonio {

    private static ArrayList<Enemigo> enemigos;
    private static Heroe heroe;
    public static void main(String[] args) {
        
        if (args.length < 3) {
            error();
        } else {
            // inicializamos la coleccion de enemigos
            enemigos = new ArrayList<>();

            // creamos el heroe de la partida
            heroe = new Heroe(args[1]);

            // cargamos el archivo de enemigos
            cargarEnemigos(args[0]);
            //jugamos
            jugar();
        }
       
    }

    private static void error() {
        System.out.println("[ERROR] Faltan parámetros");
        System.out.println("java Demonio <archivo_entrada> <nombre_heroe> <archivo_salida>");
    }

    private static void cargarEnemigos(String nombreArchivo){
        String linea;
        String[] datos;
        try {
            // abrimos el archivo en modo lectura
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(archivo);

            linea = br.readLine();
            

            while (linea != null) {
                datos = linea.split(",");
                enemigos.add(new Enemigo(datos[0], Integer.parseInt(datos[1]), Integer.parseInt(datos[2])));
                linea = br.readLine();
            }
            br.close();

            System.out.printf("[INFO] Se han cargado %d monstruos del bestiario...",enemigos.size());

        } catch(FileNotFoundException fnfe) {
            System.out.println("[ERROR] No se encuentra el archivo de enemigos.");
        } catch (IOException ioe){
            System.out.println("[ERROR] Se ha producido un error de lectura.");
        }
    }

    private static void jugar(){
        int ronda = 0;
        Enemigo enemigo;
        boolean jugando = true;

        System.out.println("[INFO] ¡Comienza el torneo para xxxxx!");

        enemigo = enemigos.get(ronda);
        
        System.out.printf("--- RONDA %d ----\n",ronda);

        do {
            

            System.out.printf("%s se enfrenta a %s\n",heroe.getNombre(),enemigo.getNombre());
            heroe.atacar(enemigo);

           
            heroe.atacar(enemigo);

            if (enemigo.estaVivo()) {
                System.out.printf("%s se enfrenta a %s\n",enemigo.getNombre(),heroe.getNombre());
                enemigo.atacar(heroe);
            } else {
                ronda++;
                // recuperamos el enemigo
                enemigo = enemigos.get(ronda);

                // mostramos marcador de batalla
                System.out.printf("--- RONDA %d ----\n",ronda);
            }

            jugando = heroe.estaVivo();



        } while (jugando);

    }
}
