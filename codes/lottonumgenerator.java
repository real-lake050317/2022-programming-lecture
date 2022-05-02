package codes;
import java.util.Random;
import java.util.Arrays;

public class lottonumgenerator {
    public static void main(String[] args){
        int[] arr = new int[6];
        //int[] winNum = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++){
            boolean flg = false;
            arr[i] = r.nextInt(45);
            while (true){
                arr[i] = r.nextInt(45);
                for (int j = 0; j < i; j++){
                    if (arr[i] == arr[j]){
                        flg = true;
                        break;
                    }
                }
                if (!flg) break;
            }
        }

        Arrays.sort(arr); //sort the array


        //print the array
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
