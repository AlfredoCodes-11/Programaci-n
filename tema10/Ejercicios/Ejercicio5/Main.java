package tema10.Ejercicios.Ejercicio5;

import tema10.Ejercicios.Ejercicio5.clases.ColeccionDiscos;
import tema10.Ejercicios.Ejercicio5.clases.Disco;
import tema10.ObjetosArray.Ejercicio3.ColeccionDisco;

public class Main {
    public static void main(String[] args) {
        ColeccionDiscos lista;
        int opcion;

        // Inicializamos la lista de discos
        lista = new ColeccionDiscos();

        lista.añadirDisco(new Disco("1234","Feede", "Pedro","Pop", 123));
        lista.añadirDisco(new Disco("1254","Gdfre", "Claudio","Pop", 143));
        lista.añadirDisco(new Disco("1321","Jurg", "Paco","Pop", 145));
        lista.añadirDisco(new Disco("1678","Treia", "Julio","Pop", 175));

        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 0:
                    
                    break;
                case 1:
                    añadirDisco(lista);
                    break;
                    
            
                default:
                    break;
            }
        }

        
    }

    public static void eliminarDiscoPorCodigo(ColeccionDisco lista){

    }
    public static void menu(){

        System.out.println("\n1. Añadir disco");
        System.out.println("2. Mostrar disco");
        System.out.println("3. Buscar disco");
        System.out.println("4. Eliminar disco");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    public static void bucarDiscoPorCodigo(ColeccionDisco lista){
        String codigo;
        Disco disco;

        System.out.println("BUSCAR DISCO\n=========================");
        System.out.println("Introduce cófigo del disco: ");
        codigo = System.console().readLine();

        if (!codigo.isBlank()) {
            if (lista.)
        }
    }
}
