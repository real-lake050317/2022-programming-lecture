package codes;
import java.util.Scanner;
public class bintooct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = 0;
        int cntDec = 1;
        while (true) {
            ans += n%8*cntDec;
            n /= 8;
            cntDec *= 10;
            if (n == 0) break;
        }
        System.out.println(ans);
    }
}
