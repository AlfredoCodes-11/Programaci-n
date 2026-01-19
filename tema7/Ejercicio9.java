package tema7;

public class Ejercicio9 {

    public static int contador=0;
    public static final int MAXIMO = 20;
    public static void main(String[] args) {
        

        //int contador=0;
        int coleccion[] = new int[MAXIMO];
        int modificado[] = new int[MAXIMO];


        System.out.println("Array original:");
        /*for (int i = 0; i < MAXIMO; i++){
            coleccion[i]=(int)(Math.random()*101);
            System.out.printf("%d ",coleccion[i]);
        }*/
            dibujarArrayOrigina(coleccion);

            System.out.println("");
            System.out.println("Array con los pares al principio:");

        /*for (int m = 0; m < MAXIMO; m++){
            if (coleccion[m]%2==0){
                modificado[contador]=coleccion[m];
                contador++;
            }
        }

        for (int l = 0; l < MAXIMO; l++){
            if (coleccion[l]%2!=0){
                modificado[contador]=coleccion[l];
                contador++;
            }
        }
        for (int t=0; t<MAXIMO; t++){
            coleccion[t]=modificado[t];
            System.out.printf("%d ",coleccion[t]);
        }*/

            dibujarArrayModificado(coleccion, modificado);
    }

    public static void dibujarArrayOrigina(int[] datos){
        for (int i = 0; i < MAXIMO; i++){
            datos[i]=(int)(Math.random()*101);
            System.out.printf("%d ",datos[i]);
        }
    }

    public static void dibujarArrayModificado(int[] datos, int[] modificado){
        for (int m = 0; m < MAXIMO; m++){
            if (datos[m]%2==0){
                modificado[contador]=datos[m];
                contador++;
            }
        }

        for (int l = 0; l < MAXIMO; l++){
            if (datos[l]%2!=0){
                modificado[contador]=datos[l];
                contador++;
            }
        }
        for (int t=0; t<MAXIMO; t++){
            datos[t]=modificado[t];
            System.out.printf("%d ",datos[t]);
        }
    }
}
