package tema6.Relacion;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        int num;

        for (int i=0; i<1000000; i++){
            num=(int)(Math.random()*95)+32;
            System.out.print("\033[38;2;0;255;0m"+(char)num);
        }
    }
}
