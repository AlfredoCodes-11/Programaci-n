package Tema9.Ejercicios.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(3, 20, 50);
        Tiempo t2 = new Tiempo(2,42,30);

        t1.suma(t2);
        System.out.printf("%s + %s = %dh %dm %ds",t1,t2,Tiempo.getHoras(),Tiempo.getMinutos(),Tiempo.getSegundo());
    }
}
