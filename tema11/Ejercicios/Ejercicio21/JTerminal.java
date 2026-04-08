import java.io.*;

public class JTerminal {

    public static void main(String[] args) {

        if (args.length == 0) {
            ayuda();
            return;
        }

        String comando = args[0];

        switch (comando) {
            case "info"      -> info(args);
            case "creardir"  -> creardir(args);
            case "escribir"  -> escribir(args);
            case "leer"      -> leer(args);
            default          -> System.out.println("ERROR: Comando no reconocido.");
        }
    }

    // ─────────────────────────────────────────────
    // a) info <ruta>
    // ─────────────────────────────────────────────
    private static void info(String[] args) {
        if (args.length < 2) {
            System.out.println("ERROR: Falta la ruta.");
            System.out.println("  java JTerminal info <ruta>");
            return;
        }

        File f = new File(args[1]);

        if (!f.exists()) {
            System.out.println("[ERROR] La ruta especificada no existe.");
            return;
        }

        System.out.println("[INFO] Nombre: "  + f.getName());
        System.out.println("[INFO] Tipo: "    + (f.isFile() ? "Archivo" : "Carpeta"));
        System.out.println("[INFO] Tamaño: "  + f.length() + " bytes");
        System.out.printf("[INFO] Permisos: Lectura (%s) | Escritura (%s)%n",
                f.canRead()  ? "SI" : "NO",
                f.canWrite() ? "SI" : "NO");
    }

    // ─────────────────────────────────────────────
    // b) creardir <ruta>
    // ─────────────────────────────────────────────
    private static void creardir(String[] args) {
        if (args.length < 2) {
            System.out.println("ERROR: Falta la ruta.");
            System.out.println("  java JTerminal creardir <ruta>");
            return;
        }

        File f = new File(args[1]);

        if (f.exists()) {
            System.out.println("[AVISO] La carpeta ya existe.");
        } else if (f.mkdir()) {
            System.out.println("[ÉXITO] Carpeta creada correctamente.");
        } else {
            System.out.println("[ERROR] No se ha podido crear la carpeta.");
        }
    }

    // ─────────────────────────────────────────────
    // c) escribir <ruta> "texto"
    // ─────────────────────────────────────────────
    private static void escribir(String[] args) {
        if (args.length < 3) {
            System.out.println("ERROR: Faltan parámetros.");
            System.out.println("  java JTerminal escribir <ruta> \"texto\"");
            return;
        }

        File f = new File(args[1]);
        String texto = args[2];

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
            // true = modo append (no borra lo anterior)
            bw.write(texto);
            bw.newLine();
            System.out.println("[ÉXITO] Texto añadido a " + f.getName() + " correctamente.");
        } catch (IOException e) {
            System.out.println("Error: no se ha podido leer el archivo");
        }
    }

    // ─────────────────────────────────────────────
    // d) leer <ruta>
    // ─────────────────────────────────────────────
    private static void leer(String[] args) {
        if (args.length < 2) {
            System.out.println("ERROR: Falta la ruta.");
            System.out.println("  java JTerminal leer <ruta>");
            return;
        }

        File f = new File(args[1]);

        if (!f.exists() || !f.isFile()) {
            System.out.println("[ERROR] El archivo no existe o no es un archivo de texto.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            System.out.println("--- CONTENIDO DE " + f.getName() + " ---");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("-".repeat(35));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: no se ha podido leer el archivo");
        } catch (IOException ioe) {
            System.out.println("Error: no se ha podido leer el archivo");
        }
    }

    // ─────────────────────────────────────────────
    // Ayuda
    // ─────────────────────────────────────────────
    private static void ayuda() {
        System.out.println("ERROR: Faltan argumentos.");
        System.out.println("USO DE JTERMINAL:");
        System.out.println("  java JTerminal info <ruta>");
        System.out.println("  java JTerminal creardir <ruta>");
        System.out.println("  java JTerminal leer <ruta>");
        System.out.println("  java JTerminal escribir <ruta> \"texto\"");
    }
}
