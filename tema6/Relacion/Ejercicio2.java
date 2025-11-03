package tema6.Relacion;

public class Ejercicio2 {
    public static void main(String[] args) {
        String palo="";
        String carta="";

        int numeroPalo=(int)(Math.random()*4)+1;

        switch (numeroPalo) {
            case 1:
                palo="picas";
                break;
            case 2:
                palo="corazones";
                break;
            case 3:
                palo="diamantes";
                break;
            case 4:
                palo="tréboles";
                break;
        
            default:
        }

        int numeroCarta= (int) (Math.random()*13)+1;

        switch (numeroCarta) {
            case 1:
                System.out.print("As");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
            default:
                carta=String.valueOf(numeroCarta);
        }

        System.out.println(carta + " de "+palo);

    }
}
