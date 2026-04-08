import java.io.*;

public class QuitaComentarios {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("[ERROR] Número de parámetros incorrecto.");
            System.out.println("Uso: java QuitaComentarios <archivo_original> <archivo_limpio>");
            return;
        }

        String archivoEntrada = args[0];
        String archivoSalida  = args[1];

        try (
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            PrintWriter pw   = new PrintWriter(new BufferedWriter(new FileWriter(archivoSalida)))
        ) {
            String linea;
            boolean dentroComentarioBloque = false;

            while ((linea = br.readLine()) != null) {
                StringBuilder resultado = new StringBuilder();
                int i = 0;

                while (i < linea.length()) {

                    // Dentro de un comentario de bloque: buscar cierre */
                    if (dentroComentarioBloque) {
                        if (i + 1 < linea.length()
                                && linea.charAt(i) == '*'
                                && linea.charAt(i + 1) == '/') {
                            dentroComentarioBloque = false;
                            i += 2; // saltamos el cierre */
                        } else {
                            i++; // ignoramos el caracter, seguimos dentro del bloque
                        }

                    // Inicio de comentario de bloque /*
                    } else if (i + 1 < linea.length()
                            && linea.charAt(i) == '/'
                            && linea.charAt(i + 1) == '*') {
                        dentroComentarioBloque = true;
                        i += 2;

                    // Inicio de comentario de línea //  → ignoramos el resto
                    } else if (i + 1 < linea.length()
                            && linea.charAt(i) == '/'
                            && linea.charAt(i + 1) == '/') {
                        break; // descartamos lo que queda de la línea

                    // Caracter normal: lo conservamos
                    } else {
                        resultado.append(linea.charAt(i));
                        i++;
                    }
                }

                // Solo escribimos la línea si tiene contenido real (no queda vacía)
                String lineaLimpia = resultado.toString().stripTrailing();
                if (!lineaLimpia.isBlank()) {
                    pw.println(lineaLimpia);
                }
            }

            System.out.println("[INFO] Archivo limpio generado: " + archivoSalida);

        } catch (FileNotFoundException fnfe) {
            System.out.println("[ERROR] No se encuentra el archivo: " + archivoEntrada);
        } catch (IOException ioe) {
            System.out.println("[ERROR] Error de E/S: " + ioe.getMessage());
        }
    }
}
