package tema3;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextFloat();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextFloat();
        System.out.printf("x = %.2f\n",num1);
        System.out.printf("y = %.2f\n",num2);
        System.out.printf("x + y = %.1f\n",num1+num2);
        System.out.printf("x - y = %.1f\n",num1-num2);
        System.out.printf("x / y = %f\n",num1/num2);
        System.out.printf("x * y = %.1f\n",num1*num2);
    }
}
