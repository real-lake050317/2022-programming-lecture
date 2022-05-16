package codes.May16;

class InitCheck {
    public int instVal;
    public static int staVal; 

    /*public InitCheck() {
        instVal = 2;
        staVal = 2;
    }*/

    { //인스턴스 초기화 블록
        instVal = 3;
        staVal = 3;
    }

    static {
        instVal = 4;
        staVal = 4;
    }
}
