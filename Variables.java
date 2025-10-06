public class Variables {
    public static void main(String[] args) {
        double x ;
        double y ;
        int numero = 5;
        System.out.printf("El valor de la variable es: %d\n", numero);
        x = 7 ;
        y = 25.75 ;
        System.out.println("El valor de x es " + x + " y el valor de y es " + y);
        System.out.printf("El valor de x es %.2f y el valor de y es %.2f\n", x, y);

        //Ejemplo 3
        char letra1 = 'c';
        char letra2 ='a';
        char letra3 ='s';
        char letra4 ='a';

        System.out.println(letra1);
        System.out.println("La primera letra es: " + letra1);
        System.out.printf("La primera letra es: %c\n", letra1);

        System.out.println("Las letras forman la palabra: " + letra1 + letra2 + letra3 + letra4);
        System.out.println("" + letra1 + letra2);
        System.out.printf("%c", letra1 + letra2);
    
        //Ejemplo 4
        numero ++; // es equivalente a numero = numero + 1;
        System.out.printf("El valor de la varible es: %d\n", ++numero); //El ++ por delante para que se aplique el incremento antes
        System.out.printf("El valor de la variable es: %d\n", --numero);

        int resultado = numero++;
        System.out.println("Resultado = " + resultado);
        System.out.println("Numero = " + numero);

    }
}
