package codes;
public class literaltest {
    public static int test(byte a){
        return a+1;
    }

    public static void main(String[] args){
        //System.out.println(test(0)); -> 에러 코드, byte도 int형 리터럴을 사용함. 다운캐스팅 필요.
        System.out.println(test((byte)0));
    }
}
