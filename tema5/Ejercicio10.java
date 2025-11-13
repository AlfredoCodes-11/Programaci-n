package tema5;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero;
        int positivos=0;
        int negativos=0;
        int cero=0;

        System.out.println("Introduce 10 número enteros:");
        for (int i=0; i<10; i++){
            numero=Integer.parseInt(System.console().readLine());
            if (numero <0) {
                negativos++;
            } else if (numero >0){
                    positivos++;
            } else {
                    cero++;
            }
        }
        if (cero ==0) {
        System.out.printf("Has introducido %d positivos y %d negativos",positivos,negativos);
        } else {
            System.out.printf("Has introducido %d positivos, %d negativos y %d ceros",positivos,negativos,cero);
        }
    }
}
