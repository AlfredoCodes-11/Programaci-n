package tema5;

public class Ejercicio7 {
    public static void main(String[] args) {
        double numero=0;
        double suma=0;
        double repeticion=0;

        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");
        while (numero >= 0){
            numero=Double.parseDouble(System.console().readLine());
            repeticion++;
            suma+=numero;
        } 
            System.out.printf("La media de los números introducidos es %f",(suma-numero)/(repeticion -1));
    }
}
