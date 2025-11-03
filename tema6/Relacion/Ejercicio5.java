package tema6.Relacion;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        int maximo=100;
        int minimo=199;
        int suma=0;
        int num;

        for (int i =0; i<50; i++) {
            num= (int)(Math.random()*100)+100;
            System.out.print(num + " ");
            suma += num;
        
            if (num < minimo) {
            minimo = num;
            }
            if (num > maximo){
                maximo = num;
            }
        }
        System.out.printf("\nMínimo: %d\nMáximo: %d\nMedia: %d",minimo,maximo,suma/50);
    }
}
