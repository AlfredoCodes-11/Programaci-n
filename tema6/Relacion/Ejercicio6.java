package tema6.Relacion;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        int numSecre;
        int num;
        int oportu=5;

        numSecre=(int) (Math.random()*101);


        System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
        System.out.print("Introduce un número: ");
        num=Integer.parseInt(System.console().readLine());

        for (int i =0; i<5; i++){
            if (num < numSecre){
                System.out.println("El número que estoy pensando es mayor que "+num);
                oportu1;
                System.out.println("Te quedan  opor");
            }
        }
    }
}
