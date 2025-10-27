package tema4.Relacion;

public class ejercicio4 {
    public static void main(String[] args) {
        float a;
        float b;

        System.out.println("El programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("\nIntroduzca el valor de a: ");
        a=Float.parseFloat(System.console().readLine());
        System.out.print("Ahora introduzca el valor de b: ");
        b=Float.parseFloat(System.console().readLine());
        float x = -b/a;
        if (a==0) {
            if (b==0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución real.");
            }
        } else {
            System.out.printf("x = %.2f",x) ;
        }
    }
}
