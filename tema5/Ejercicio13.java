package tema5;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        int i =2;
        int numero;
        boolean primo = false;
        System.out.println("Por favor, introduzca un número entero: ");
        numero=Integer.parseInt(System.console().readLine());

        while (i <= (numero/2) && !primo) {
            primo=(numero%i==0);
            i++;
        }
    
        if (primo){
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }

    }
}
