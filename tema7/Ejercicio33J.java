public class Ejercicio33 {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 10;
         float suma = 0;
         int valor;
         float media;
         int min = 210;
         int max = 140;

        int[][] array = new int[FILAS][COLUMNAS];
        String[] pais = {"España", "Rusia", "Japón", "Australia"};



        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                array[i][j] =(int) ((Math.random()*71)+140);
            }
        }
        
        System.out.println("                                                       MED   MIN  MAX");
        


        for (int i = 0; i < array.length; i++) {
            
            System.out.printf("%-10s: ", pais[i]);
          

            for (int j = 0; j < array[i].length; j++) {
                valor = array[i][j];
                System.out.print(valor + " ");
                suma += valor;

                if (valor < min) min = valor;
                if (valor > max) max = valor;
            }

            media = suma/(FILAS*COLUMNAS );
            System.out.printf("| %.2f  %3d  %3d%n", media, min, max);
            min = 210;
            max = 140;
        }
    }  
}
