package codes.May03;
import java.util.Scanner;
public class May03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle a = new Circle();
        a.setRadius(sc.nextInt());
        sc.close();

        System.out.println(a.areaCircle());
    } 
}
