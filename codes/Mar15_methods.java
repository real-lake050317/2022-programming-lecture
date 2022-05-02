package codes;
public class Mar15_methods{
    public static int sum(int n){
        if (n == 1)
            return 1;
    
        return n + sum(n - 1);
    }
    
    public static int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
    
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static int factorial(int n){
        if (n == 1)
            return 1;
    
        return n * factorial(n - 1);
    }    

    public static int gcd(int a, int b){
        if (b == 0)
            return a;
    
        return gcd(b, a % b);
    }

    void recurMe1(int num){
       System.out.print(num+" ");
       if (num<4)
           recurMe1(num+1);
    } // 1 2 3 4
    
    void recurMe2(int num){
       if (num<4)
           recurMe2(num+1);
       System.out.print(num+" ");
    } // 4 3 2 1
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}