package tema7;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int MAXIMO = 15;

        int[] coleccion = new int[15];


        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (int i=0; i <MAXIMO; i++ ){
            coleccion[i]=Integer.parseInt(System.console().readLine());
        }

        System.out.println("Array original:");
        for(int i=0; i<MAXIMO; i++){
            System.out.printf("| %4d  ",i);
        }
        System.out.print("|\n");
        for(int i=0; i<MAXIMO; i++){
            System.out.print("--------");
        }
        System.out.print("-\n");

        for(int i=0; i<MAXIMO; i++){
            System.out.printf("| %4d  ",coleccion[i]);
        }
        System.out.print("|");

        System.out.println("\nArray rotado:");

        for(int i=0; i<MAXIMO; i++){
            System.out.printf("| %4d  ",i);
        }
        System.out.print("|\n");
        for(int i=0; i<MAXIMO; i++){
            System.out.print("--------");
        }
        System.out.print("-\n");

        for(int i=0; i<MAXIMO; i++){
            if (i==0){
                System.out.printf("| %4d  ",coleccion[i+(MAXIMO-1)]);
            } else {
                System.out.printf("| %4d  ",coleccion[i-1]);
            }
        }
        System.out.print("|");

    }
}
