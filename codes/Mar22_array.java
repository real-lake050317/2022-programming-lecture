package codes;
public class Mar22_array{
    public static void main(String[] args){
        //int a[];
        //a = new int[5]; //new int[5]{0, 1, 2, 3, 4} 는 에러 발생
        //int a[] = new int[]{1, 2, 3, 4, 5}; //에러 발생
        //int b[] = new int[50];
        /*
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        
        for (int i = 0; i<50; i++) System.out.println(b[i]);
        for (int i = 0; i<b.length; i++) System.out.println(b[i]); //코드의 재사용성을 높힘
        */
        //실수 5개를 저장할 수 있는 배열을 하나 선언하고 5개의 원소에 1.0, 2.0, 3.0, 4.0, 5.0을 각각 저장한 후 배열을 출력하는 프로그램을 작성하시오
        double f[] = new double[5];
        double num = 1.0;
        for (int i = 0; i<f.length; i++) f[i] = num + i;
        for (int i = 0; i<f.length; i++) System.out.println(f[i]);

        //다섯명의 학생의 국어 점수를 정수 형태로 저장할 수 있는 배열을 하나 말들고, 35, 56, 84, 99, 74점을 각각 원소로 대입한 후 출력하는 프로그램을 작성하시오 (평균, 최고, 최소, 수우미양가)

        int score[] = new int[]{35, 56, 84, 99, 74};
        int max = -1;
        int min = 101;
        int sum = 0;
        for (int i = 0; i<score.length; i++){
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
            sum += score[i];
        }
        System.out.println("평균 : " + (double)sum/score.length);
        System.out.println("최고 : " + max);
        System.out.println("최소 : " + min);
    }
}