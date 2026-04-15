package tema11.Ejercicios.Ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {

        boolean esPrimo;

        try {
            FileWriter archivo = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(archivo);

            for (int num = 1; num <= 500; num++) {

                esPrimo = true;

                if (num < 2) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            esPrimo = false;
                        }
                    }
                }

                if (esPrimo) {
                    bw.write(num + "\n");
                }
            }

            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
