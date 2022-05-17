package codes.May16;

class InitCheck {
    public int instVal;
    public static int staVal; 

    /*public InitCheck() {
        instVal = 2;
        staVal = 2;
    }*/

    { //인스턴스 초기화 블록 -> 스태틱 변수들도 초기화 가능
        instVal = 3;
        staVal = 3;
    }

    static {
        // instVal = 4; 에러 발생, 스태틱 변수만 접근 가능
        staVal = 4;
    }
}
