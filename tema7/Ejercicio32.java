package tema7;

public class Ejercicio32 {
    public static final int FILS =9;
    public static final int COLM =9;
    public static void main(String[] args) {
        int contador =0;
        int[][] coleccion = new int[FILS][COLM];
        int max=500;
        int min=900;
        float suma=0;



        for (int i =0; i<FILS;i++){
            for (int l=0; l <COLM;l++){
                coleccion[i][l]=(int) ((Math.random()*400)+501);
            }
        }
        
        for (int i =0; i<FILS;i++){
            for (int l=0; l <COLM;l++){
                System.out.printf("%d ",coleccion[i][l]);   
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Diagonal desde la esquina inferior izquierda a la esquina superior derecha: ");

        for (int i = FILS-1; i >=0; i--){
            System.out.printf("%d ",coleccion[i][0+contador]);
            
            if (max < coleccion[i][0+contador]) {
                max = coleccion[i][0+contador];
            }
            if (min > coleccion[i][0+contador]) {
                min = coleccion[i][0+contador];
            }
            suma+=coleccion[i][0+contador];
            contador ++;
        }
        

        System.out.printf("\nMáximo: %d", max);
        System.out.printf("\nMínimo: %d", min);
        System.out.printf("\nMedia: %.1f",suma/(FILS));
    }
}
