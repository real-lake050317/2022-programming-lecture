package codes;
public class recursion {
    public static void main(String[] args){

    }

    public static int fib(int n){
        if(n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int hanoi(int n, char from, char to, char aux){
        if(n == 1){
            System.out.println("move disk 1 from " + from + " to " + to);
            return 1;
        }
        int count = hanoi(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from " + from + " to " + to);
        count += hanoi(n - 1, aux, to, from);
        return count;
    }

    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fib_iter(int n){
        int a = 0, b = 1, c = 0;
        for(int i = 1; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
