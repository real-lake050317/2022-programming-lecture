package codes;
public class fibonacci{
    public static int fib(int a){
        if (a == 0) return 0;
        else if (a == 1) return 1;
        else return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args){
        /*
        int first = 0;
        int second = 1;
        int ans = 0;
        for (int i = 1; i<=10; i++){
            ans = first + second;
            first = second;
            second = ans;
        }
        System.out.println(ans);
        */
        System.out.println(fib(10));
    }
}