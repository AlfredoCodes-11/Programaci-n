package tema6.Relacion;

public class Ejercicio3 {
    public static void main(String[] args) {
        String palo="";
        String carta="";

        int numeroPalo=(int)(Math.random()*4)+1;

        switch (numeroPalo) {
            case 1:
                palo="oros";
                break;
            case 2:
                palo="copas";
                break;
            case 3:
                palo="espadas";
                break;
            case 4:
                palo="bastos";
                break;
        
            default:
        }

        int numeroCarta= (int) (Math.random()*10)+1;

        switch (numeroCarta) {
            case 1:
                System.out.print("As");
                break;
            case 8:
                System.out.print("sota");
                break;
            case 9:
                System.out.print("caballo");
                break;
            case 10:
                System.out.print("rey");
                break;
            default:
                carta=String.valueOf(numeroCarta);
        }

        System.out.println(carta + " de "+palo);

    }
}

