import java.util.Scanner;

public class ClassSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s = new Square(sc.nextDouble());
        System.out.println("사각형의 넓이는:" + s.getSpace());
        Circle c = new Circle(s.getSpace());

    }
}
