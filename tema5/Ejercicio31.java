package tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        
        int digito;
        long primero=0;
        long segundo=0;
        long temporal;
        long numerosPar=0;
        long numerosImpar=0;

        Scanner sc = new Scanner(System.in);

        try {

            // leemos los números
            System.out.print("Por favor, introduzca un número: ");
            temporal=sc.nextInt();

            //giramos el primer número
            primero = girarNumero(temporal);


            /*while (temporal > 0) {
                primero = (primero*10) + (temporal%10);
                temporal /= 10;
            }*/

            System.out.print("Por favor, introduzca otro número: ");
            temporal= sc.nextInt();
            segundo=girarNumero(temporal);
            
            /*while (temporal > 0) {
                segundo = (segundo*10) + (temporal%10);
                temporal /= 10;
            }*/

            // construimos los números
            while (primero > 0 && segundo > 0) {
                digito = (int) (primero%10);
                primero /=10;

                if (digito%2==0) {
                numerosPar = (numerosPar*10) + digito;
                } else {
                numerosImpar = (numerosImpar*10) + digito;
                }

                digito = (int) (segundo%10);
                segundo /=10;

                if (digito%2==0) {
                numerosPar = (numerosPar*10) + digito;
                } else {
                numerosImpar = (numerosImpar*10) + digito;
                }
            }

            while (primero > 0) {
                digito = (int) (primero%10);
                primero /=10;

                if (digito%2==0) {
                numerosPar = (numerosPar*10) + digito;
                } else {
                numerosImpar = (numerosImpar*10) + digito;
                }
            }
            
            while (segundo > 0) {
                digito = (int) (segundo%10);
                segundo /=10;

                if (digito%2==0) {
                numerosPar = (numerosPar*10) + digito;
                } else {
                numerosImpar = (numerosImpar*10) + digito;
                }
            }

            System.out.printf(" El número formado por los dígitos pares: %d\n",numerosPar);
            System.out.printf(" El número formado por los dígitos pares: %d\n",numerosImpar);

        } catch(InputMismatchException ime) {
            System.out.println("**ERROR: se pedía un valor de tipo entero largo.");
        } catch(Exception exception) {
            System.out.println("**ERROR: la aplicación ha fallado.");
        } finally {
            // cerramos el flujo de entrada
            sc.close();

        }
    }

    /**
     *  Invierte los dígitos de un número
     * @param numero
     * @return
     */
    public static long girarNumero(long numero) {

        long volteado=0;

        while (numero > 0) {
            volteado = (volteado*10) + (numero%10);
            numero /= 10;
        }

        return volteado;
    }
}
