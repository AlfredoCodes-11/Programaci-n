package tema7;

public class Ejercicio31 {

    public static final int FILS =10;
    public static final int COLM =10;
    public static void main(String[] args) {
        int contador =0;
        int[][] coleccion = new int[FILS][COLM];
        int max=200;
        int min=300;
        float suma=0;

        boolean salir = true;


        for (int i =0; i<FILS;i++){
            for (int l=0; l <COLM;l++){
                coleccion[i][l]=(int) ((Math.random()*100)+201);
                suma+=coleccion[i][l];
            }
        }
        
        for (int i =0; i<FILS;i++){
            for (int l=0; l <COLM;l++){
                System.out.printf("%d ",coleccion[i][l]);   
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Diagonal desde la esquina supeior izquierda a la esquina inferior derecha: ");

        for (int i = 0; i < FILS; i++){
            System.out.printf("%d ",coleccion[i][contador]);
            if (max < coleccion[i][contador]){
                max = coleccion[i][contador];
            }
            if (min > coleccion[i][contador]){
                min = coleccion[i][contador];
            }
            contador ++;
        }
        
        /*for (int i =0; i<FILS;i++){
            for (int l=0; l <COLM;l++){
                if (max < coleccion[i][l]){
                    max = coleccion[i][l];
                }
            }
        }

        for (int i =0; i<FILS;i++){
            for (int l=0; l <COLM;l++){
                if (min > coleccion[i][l]){
                    min = coleccion[i][l];
                }
            }
        }*/

        System.out.printf("\nMáximo: %d", max);
        System.out.printf("\nMínimo: %d", min);
        System.out.printf("\nMedia: %.1f",suma/(FILS*COLM));
      
    }
}
