import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args){
        //다섯명의 학생의 국어 점수를 정수 형태로 저장할 수 있는 배열을 하나 만들고, 35, 56, 84, 99, 74점을 각각 원소로 대입한 후 출력하라 (최대, 최소, 수우미양가)
        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 100;
        int sum = 0;
        for (int i = 0; i<score.length; i++) score[i] = sc.nextInt();
        sc.close();
        for(int i = 0; i < score.length; i++){
            sum += score[i];
            if(max < score[i]){
                max = score[i];
            }
            if(min > score[i]){
                min = score[i];
            }
            switch (score[i]/10){
                case 10:
                case 9:
                    System.out.println(i+1 + "번 학생: A");
                    break;
                case 8:
                    System.out.println(i+1 + "번 학생: B");
                    break;
                case 7:
                    System.out.println(i+1 + "번 학생: C");
                    break;
                case 6:
                    System.out.println(i+1 + "번 학생: D");
                    break;
                default:
                    System.out.println(i+1 + "번 학생: E");
                    break;
            }
        }
        System.out.println("최대 : " + max);
        System.out.println("최소 : " + min);
        System.out.println("평균 : " + (double)sum/score.length);
    }
}
