package tema7;

public class Ejercicio55 {
    public static void main(String[] args) {
        final int MAXIMO = 10;

        int max=0;
        int min=0;

        int[] coleccion = new int[10];


        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (int i=0; i <MAXIMO; i++ ){
            coleccion[i]=Integer.parseInt(System.console().readLine());
        }

        for (int i=0; i<MAXIMO; i++){

            if (coleccion[i]>coleccion[i+1]){
                max=coleccion[i];
            } else if (coleccion[i]<coleccion[i+1]) {
                min=coleccion[i];
            }
        }

        for (int i=0; i<MAXIMO; i++){
            if (max==coleccion[i]){
                System.out.print(coleccion[i]);
                System.out.print("maximo");
            } else if(min==coleccion[i]) {
                System.out.print(coleccion[i]);
                System.out.print("minimo");
            } else{
                System.out.println(" "+coleccion[i]);
            }
        }
    }
}
