package codes;
public class overriding {

    static long add (int a, int b) { return a + b; }
    static long add (long a, long b) { return a + b; }
    public static void main(String[] args){
        System.out.println(add(10, 20));
    }
}