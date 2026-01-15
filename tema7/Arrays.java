package tema7;

public class Arrays {
    public static void main(String[] args) {
        
        float dia1;             // guarda un único valor de tipo float
        float dia2;
        float dia3;

        float[] temperaturas;  // definimos una colección de valores de tipo float (array de cadenas)
        temperaturas = new float[7];  // inicializamos la colección con un tamaño de 7 elementos de tipo float (4 * 7 bytes)

        temperaturas[0] = 3.0f;
        //temperaturas[1] = 10.5f;
        temperaturas[2] = 8f;
        //temperaturas[3] = 13f;
        temperaturas[4] = 34f;
        //temperaturas[5] = 17f;
        temperaturas[6] = 20f;

        /*System.out.println("Lunes " + temperaturas[0]);
        System.out.println("Martes " + temperaturas[1]);
        System.out.println("Miércoles " + temperaturas[2]);*/

        //float[] temperaturas = {3.0f, 10.0f, 8f, 13f, 34f, 17f, 20f};

        for(int i=0; i < 7; i++){
            System.out.println(temperaturas[i]);
        }


        // ARRAY es una colección de valores del mismo tipo
    }
}
