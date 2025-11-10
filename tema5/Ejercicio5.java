package tema5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num;

        System.out.print("Introduce un número y te mostraré su tabla de multiplicar: ");
        num=Integer.parseInt(System.console().readLine());

        for (int i =0; i<11; i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
    }
}
