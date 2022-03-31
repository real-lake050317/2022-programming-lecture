import java.util.Scanner;

public class Mar31Array {
    //정수배열 하나의 정수 하나를 인자로 받아 그 배열의 원소중에 그 정수가 하나라도 존재하면 true를, 그렇지 않으면 false를 리턴하는 메소드를 작성하시오
    public static boolean isExist(int arr[], int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int maxmax(int a[]){
        int maxmin[] = new int[]{a[0], a[0]};
        for (int i = 1; i<a.length; i++){
            maxmin[0] = (maxmin[0] < a[i])?a[i] : maxmin
        }
    }

    //원소의 갯수가 동일한 정수 배열 두개를 인자로 받아 그 두 배열의 각각의 원소들의 합을 새로운 워노솔 하는 배열을 리턴하는 메소드를 작성하시오
    public static int[] sum(int a[], int b[]){
        int c[] = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flg = false;
        int[] arr = new int[100];
        int num = sc.nextInt();
        int index = 0;
        while (true){
            int input = sc.nextInt();
            if (input == 0) break;
            arr[index++] = input;
        }
        sc.close();
        for (int i = 0; i<index; i++){
            if (arr[i] == num){
               flg = true;
               break;
            }
        }
        if (flg) System.out.println("있음");
        else System.out.println("없음");
    }
}
