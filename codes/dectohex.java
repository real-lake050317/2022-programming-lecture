import java.util.Scanner;
public class dectohex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
        char[] charArr = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        int n = sc.nextInt();
        sc.close();
        int decCnt = 1;
        char[] ans = new char[10];
        while (true){
            int num = n%16;
            if (num >= 10) ans[decCnt] = charArr[num-10];
            else ans[decCnt] = (char)(numArr[num] + 48);
            n /= 16;
            if (num == 0) break; 
            decCnt++;
        }
        for (int i = decCnt-1; i>=1; i--){
            System.out.print(ans[i]);
        }
    }
}
