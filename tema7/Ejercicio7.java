package tema7;

public class Ejercicio7 {

    public static final int MAXIMO=100;
    public static void main(String[] args) {


        int numero;
        int sustituto;
        int[] coleccion = new int[MAXIMO];

        for (int i = 0; i < MAXIMO; i++){
            coleccion[i]= (int)(Math.random()*21);
            System.out.print(coleccion[i]+" ");
        }

        System.out.println("");
        
        System.out.print("Introduzca un número de los que se han mostrado: ");
        numero=Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        sustituto=Integer.parseInt(System.console().readLine());

        for (int i=0; i< MAXIMO; i++){
            if (numero==coleccion[i]){
                coleccion[i]=sustituto;
                System.out.printf("\"%d\" ",coleccion[i]);
            }else{
                System.out.print(coleccion[i]+" ");
            }
        }
    }
}
