class Circle {
    public static int a = 1;
    public int b = 100;
    Circle(){
        a++;
        b++;
    }
    {
        a++;
        b++;

    }
    static {
        a++;
    }
}


public class Test {
    public static void main(String[] args) {
        
        Circle p = new Circle();
        System.out.println(p.a+","+ p.b);
        Circle q = new Circle();
        System.out.println(q.a+","+ q.b);
    }
}
