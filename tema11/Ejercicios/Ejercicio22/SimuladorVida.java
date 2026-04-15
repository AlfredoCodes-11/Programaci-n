package tema11.Ejercicios.Ejercicio22;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SimuladorVida {
    public static void main(String[] args) {

        FileReader fr;
        BufferedReader br;
        FileWriter fw;
        BufferedWriter bw;

        String linea;
        String archivoEntrada;
        String archivoSalida;
        int generaciones;
        int velocidad;

        int filas = 0;
        int columnas = 0;
        int i;
        int j;
        int g;

        char[][] matriz;
        char[][] nueva;

        int vecinas;

        // Comprobación de argumentos
        if (args.length != 4) {
            System.out.println("[ERROR] Número de argumentos incorrecto.");
            System.out.println("Uso correcto:");
            System.out.println("java SimuladorVida <archivo_entrada> <generaciones> <velocidad> <archivo_salida>");
            return;
        }

        archivoEntrada = args[0];
        generaciones = Integer.parseInt(args[1]);
        velocidad = Integer.parseInt(args[2]);
        archivoSalida = args[3];

        try {
            // ---------- LECTURA ----------
            fr = new FileReader(archivoEntrada);
            br = new BufferedReader(fr);

            // Contar filas
            while ((linea = br.readLine()) != null) {
                filas++;
                columnas = linea.length();
            }

            br.close();

            // Crear matriz
            matriz = new char[filas][columnas];

            // Volver a leer
            fr = new FileReader(archivoEntrada);
            br = new BufferedReader(fr);

            i = 0;
            linea = br.readLine();
            while (linea != null) {
                for (j = 0; j < columnas; j++) {
                    matriz[i][j] = linea.charAt(j);
                }
                i++;
                linea = br.readLine();
            }

            br.close();

            // ---------- SIMULACIÓN ----------
            for (g = 0; g < generaciones; g++) {

                nueva = new char[filas][columnas];

                for (i = 0; i < filas; i++) {
                    for (j = 0; j < columnas; j++) {

                        vecinas = 0;

                        // contar vecinas
                        for (int fi = i - 1; fi <= i + 1; fi++) {
                            for (int co = j - 1; co <= j + 1; co++) {

                                if (fi >= 0 && fi < filas && co >= 0 && co < columnas) {
                                    if (!(fi == i && co == j)) {
                                        if (matriz[fi][co] == '*') {
                                            vecinas++;
                                        }
                                    }
                                }
                            }
                        }

                        // reglas
                        if (matriz[i][j] == '*') {
                            if (vecinas < 2 || vecinas > 3) {
                                nueva[i][j] = '.';
                            } else {
                                nueva[i][j] = '*';
                            }
                        } else {
                            if (vecinas == 3) {
                                nueva[i][j] = '*';
                            } else {
                                nueva[i][j] = '.';
                            }
                        }
                    }
                }

                // copiar nueva → matriz
                for (i = 0; i < filas; i++) {
                    for (j = 0; j < columnas; j++) {
                        matriz[i][j] = nueva[i][j];
                    }
                }

                // mostrar por pantalla
                System.out.println("Generación " + (g + 1));
                for (i = 0; i < filas; i++) {
                    for (j = 0; j < columnas; j++) {
                        System.out.print(matriz[i][j]);
                    }
                    System.out.println();
                }

                // pausa
                try {
                    Thread.sleep(velocidad);
                } catch (InterruptedException e) {
                }

                // limpiar pantalla (según enunciado)
                System.out.print("\033[H\033[2J");
            }

            // ---------- ESCRITURA ----------
            fw = new FileWriter(archivoSalida);
            bw = new BufferedWriter(fw);

            for (i = 0; i < filas; i++) {
                for (j = 0; j < columnas; j++) {
                    bw.write(matriz[i][j]);
                }
                bw.write("\n");
            }

            bw.close();

        } catch (IOException ioe) {
            System.out.println("Error con los ficheros");
        }
    }
}