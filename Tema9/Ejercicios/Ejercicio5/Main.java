package Tema9.Ejercicios.Ejercicio5;

import java.util.Scanner;

import Tema9.Ejercicios.Ejercicio5.clases.Bicicleta;
import Tema9.Ejercicios.Ejercicio5.clases.Coche;
import Tema9.Ejercicios.Ejercicio5.clases.Vehiculo;

public class Main {
    public static void main(String[] args) {

        int opcion;
        
        Scanner sc = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        

        do {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Limpiamos el coche");
            System.out.println("9. Hinchar las ruedas de la bici");
            System.out.println("10. Salir");
            

            System.out.print("Elige una opción (1-10): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: 
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    bicicleta.andaBici(sc.nextInt());
                    break;
                
                case 2:
                    bicicleta.caballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    coche.andaCoche(sc.nextInt());
                    break;
                case 4: 
                    coche.quemaRueda();
                    break;
                case 5:
                    System.out.println("Kilómetros bicicleta: " + bicicleta.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("Kilómetros coche: " + coche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("Kilómetros totales: " + Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    coche.limpiarCoche();
                    break;
                case 9:
                    bicicleta.hincharRuedas();
                case 10:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 10);

        sc.close();
    }
}
