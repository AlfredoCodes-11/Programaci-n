public class Colores {
    public static void main(String[] args) {
        
    System.out.println("\033[30m Gris");
    System.out.println("\033[31m Rojo");
    System.out.println("\033[32m Verde");
    System.out.println("\033[33m Amarillo");
    System.out.println("\033[34m Azul oscuro");
    System.out.println("\033[35m Magenta");
    System.out.println("\033[36m Azul claro");
    System.out.println("\033[37m Blanco");

    System.out.println("\033[40m Negro \033[0m");
    System.out.println("\033[41m Rojo \033[0m");
    System.out.println("\033[42m Verde \033[0m");
    System.out.println("\033[43m Amarillo \033[0m");
    System.out.println("\033[44m Azul oscuro \033[0m");
    System.out.println("\033[45m Magenta \033[0m");
    System.out.println("\033[46m Azul claro \033[0m");
    System.out.println("\033[47m Blanco \033[0m");

    System.out.println("\033[38;5;42:120:33m Color RGB \033[0m");

    System.out.printf("El valor %c es un carácter y este otro %d es un entero \n", 'A', 15 );
    System.out.printf("Mostramos una cadena: %s \n", "¡Hola Mundo!");


    }
}
