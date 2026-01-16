package tema7;

public class Ejercicio8 {

    public static int MAXIMO =12;
    public static void main(String[] args) {
        

        int[] coleccion = new int[MAXIMO];
        String[] meses = new String[MAXIMO];

        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";

        for (int i = 0; i < MAXIMO; i++){
            System.out.printf("Introduzca la temperatura media de %s: ",meses[i]);
            coleccion[i]=Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < MAXIMO; i++){
            System.out.printf("%11s |",meses[i]);
            for(int t=0; t < coleccion[i];t++){
                System.out.print("■");
            }
            System.out.printf(" %dºC\n",coleccion[i]);
        }
    }
}
