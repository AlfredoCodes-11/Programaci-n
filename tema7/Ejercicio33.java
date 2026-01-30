package tema7;

public class Ejercicio33 {
    public static final int FILS = 4;
    public static final int COLS = 10;
    public static void main(String[] args) {
        
        int contador=0;
        int max=140;
        int min=210;
        int[][] coleccion = new int[FILS][COLS];
        String[] pais = {"España", "Rusia", "Japón","Australia"};

        for (int i =0; i<FILS ;i++){
            for (int l=0; l <COLS ;l++){
                coleccion[i][l]=(int) ((Math.random()*70)+141);
            }
        }
        
        for (int i =0; i<FILS ;i++){
            for (int l=0; l <COLS ;l++){
                if (l==0){
                    System.out.printf("%-10s: ",pais[i+contador]);
                }
                System.out.printf("%d ",coleccion[i][l]);
            }
            System.out.print("| ");

            System.out.println();
        }
    }
}
