package tema7;

public class Ejercicio10 {
    public static final int MAXIMO = 10;
    public static final int MAXGRUPOS = 4;

    public static int grupos;
    public static int[] mesas = new int[MAXIMO];
    public static void main(String[] args) {
        
        boolean sentados = false;
        int n =0;
        int z =0;

        for (int i = 0; i < MAXIMO; i++){
            mesas[i]=(int)(Math.random()*5);
        }

        /*System.out.print("Mesa nº   |");

        for (int i = 1; i <= MAXIMO; i++){
            System.out.printf("%3d  |", i);
        }

        System.out.println();
        System.out.print("-----------");

        for (int i = 1; i <= MAXIMO; i++){
            System.out.print("------");
        }

        System.out.println();

        System.out.print("Ocupación |");

        for (int i = 0; i < MAXIMO; i++){
            mesas[i]=(int)(Math.random()*5);
            System.out.printf("%3d  |",mesas[i]);
        }*/

        dibujarMesas(mesas);
            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            grupos=Integer.parseInt(System.console().readLine());

            if (grupos==-1){
                System.out.println("Gracias. Hasta pronto.");
            } else if (grupos>MAXGRUPOS){
                System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de %d personas como máximo e intente de nuevo.",grupos,MAXGRUPOS);
            } /*else {
                for (int i=0; i<MAXIMO; i++){
                    if (mesas[i]==0){
                        mesas[i]=+grupos;
                        System.out.printf("Por favor, siéntese en la mesa número %d\n",i+1);
                        dibujarMesas(mesas);
                    }  else if (mesas[i]+grupos<MAXGRUPOS){
                        mesas[i]=+grupos;
                        System.out.printf("Tendrán que compartir mesa. Por favor, siéntese en la mesa número %d\n",i+1);
                        dibujarMesas(mesas);
                    } else {
                        System.out.println("Lo siento en estos momentos no queda sitio.");
                    }
                }
            } */

            while (z < mesas.length && !sentados) {
                if (mesas[z] == 0) {
                    mesas[z] += grupos;
                    System.out.println("Por favor, siéntense en la mesa número " + (z + 1) + ".");
                    sentados = true;
                    dibujarMesas(mesas);
                }
                z++;
            }

            while (n < mesas.length && !sentados) {
                if (mesas[n] + grupos <= 4) {
                    mesas[n] += grupos;
                    System.out.println("Tendrá que compartir mesa. Por favor , siéntese en la mesa número " + (n + 1) + ".");
                    sentados = true;
                    dibujarMesas(mesas);
                }
                n++;
            }
           

        
    }
    public static void dibujarMesas(int[] datos){
        System.out.print("Mesa nº   |");
        for (int i = 1; i <= MAXIMO; i++){
            System.out.printf("%3d  |", i);
        }

        System.out.println();
        System.out.print("-----------");

        for (int i = 1; i <= MAXIMO; i++){
            System.out.print("------");
        }

        System.out.println();

        System.out.print("Ocupación |");

        for (int i = 0; i < MAXIMO; i++){
            System.out.printf("%3d  |",datos[i]);
        }
    }
}
