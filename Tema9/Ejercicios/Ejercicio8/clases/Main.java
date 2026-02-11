package Tema9.Ejercicios.Ejercicio8.clases;

public class Main {
    public static void main(String[] args) {
        boolean salir=false;
        int opcion;
        int zonaEntradas;
        int entradas;
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        do {
            System.out.println("EXPOCOCHES MÁLAGA");
            System.out.println("1. Mostrar nñumero de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.println("En la zona principal hay "+ principal.getEntradasPorVender());
                    System.out.println("En la zona de compra venta hay "+ compraVenta.getEntradasPorVender());
                    System.out.println("En la zona vip hay "+ vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("1. Principal");
                    System.out.println("2. Compra-venta");
                    System.out.println("3. Vip");
                    System.out.printf("Elige la zona para la que quieres comprar las entradas: ");
                    zonaEntradas= Integer.parseInt(System.console().readLine());
                    System.out.print("¿Cuántas entradas quieres? ");
                    entradas = Integer.parseInt(System.console().readLine());
                    switch (zonaEntradas) {
                        case 1:
                            principal.vender(entradas);
                            break;
                        case 2:
                            compraVenta.vender(entradas);
                            break;
                        case 3:
                            vip.vender(entradas);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!salir);
    }
}
