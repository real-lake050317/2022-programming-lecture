import java.util.Scanner;
import java.util.Arrays;

public class lottomatching {
    public static void main(String[] args){
        /*
        int[] myNum= new int[6];
        int[] winNum = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 로또 번호를 입력하세요: ");
        for (int i = 0; i < myNum.length; i++){
            myNum[i] = sc.nextInt();
        }
        System.out.print("당첨 번호를 입력하세요: ");
        for (int i = 0; i < winNum.length; i++){
            winNum[i] = sc.nextInt();
        }
        */
        int[] testarr = new int[]{10, 43, 1, 94, 47, 72};
        selectionSort(testarr);
        for (int i = 0; i < testarr.length; i++){
            System.out.print(testarr[i] + " ");
        }
    }

    public static int selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return 0;
    }
}
