package tema4.Relacion;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        char simbolo;
        int vertice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa pinta una pirámide.");
        System.out.print("Introduzca el carácter de relleno: ");
        simbolo=sc.next().charAt(0);

        System.out.println("\n Elija un tipo de pirámide:");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia derecha");
        System.out.print("? ");
        vertice=sc.nextInt();

        System.out.println("La pirámide es:");

        switch (vertice) {
            case 1:
                System.out.printf("  %c\n",simbolo);
                System.out.printf(" %c%c%c\n",simbolo,simbolo,simbolo);
                System.out.printf("%c%c%c%c%c\n",simbolo,simbolo,simbolo,simbolo,simbolo);
                break;
            case 2:
                System.out.printf("%c%c%c%c%c\n",simbolo,simbolo,simbolo,simbolo,simbolo);
                System.out.printf(" %c%c%c\n",simbolo,simbolo,simbolo);
                System.out.printf("  %c\n",simbolo);
                break;
            case 3:
                System.out.printf("  %c\n",simbolo);
                System.out.printf(" %c%c\n",simbolo,simbolo);
                System.out.printf("%c%c%c\n",simbolo,simbolo,simbolo);
                System.out.printf(" %c%c\n",simbolo,simbolo);
                System.out.printf("  %c\n",simbolo);
                break;
            case 4:
            System.out.printf("%c\n",simbolo);
            System.out.printf("%c%c\n",simbolo,simbolo);
            System.out.printf("%c%c%c\n",simbolo,simbolo,simbolo);
            System.out.printf("%c%c\n",simbolo,simbolo);
            System.out.printf("%c\n",simbolo);
            default:
                System.out.println("Tipo no válido.");
                break;
        }
    }
}
