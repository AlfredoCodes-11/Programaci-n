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

        while (num != numSecre && oportu !=0) {
            oportu--;
            if (num < numSecre) {
                System.out.println("El número que estoy pensando es mayor que "+num);
                System.out.println("Te quedan "+ oportu+ " oportunidades.");
                System.out.print("Introduce un número: ");
                num=Integer.parseInt(System.console().readLine());
            } else if (num > numSecre){
                System.out.println("El número que estoy pensando es menor que "+num);
                System.out.println("Te quedan "+ oportu+ " oportunidades.");
                System.out.print("Introduce un número: ");
                num=Integer.parseInt(System.console().readLine());
                } else {   
                System.out.println("Lo siento, no has acertado, el número que estaba pensando era el "+ numSecre);
                }
            }
        System.out.println("¡Enhorabuena! ¡has acertado!");
        
    }
}
