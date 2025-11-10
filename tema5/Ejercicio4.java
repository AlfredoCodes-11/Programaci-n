package tema5;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        final int CLAVE=4563;
        int intento=0;
        int oportunidad=4;


        while (oportunidad>0 && intento!=CLAVE){
            System.out.print("Introduce la clave de la caja fuerte: ");
            intento=Integer.parseInt(System.console().readLine());
            if (intento!=CLAVE){
            System.out.println("Clave incorrecta");
            oportunidad--;
            }
        }

        if (intento == CLAVE){
            System.out.println("\033[1m\033[31mSe ha abierto la caja fuerte\033[0m");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
            System.out.println("Se ha emitido un aviso a la policía.");
        }
    }
}
