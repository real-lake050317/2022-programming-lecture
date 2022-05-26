import java.util.Scanner;
import java.lang.Math;

public class NoClassSolve {
    public static void main(String[] args) {
        final double pi = Math.PI;

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.close();

        double b = Math.sqrt(a*a/pi);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a / b);


    }
}
