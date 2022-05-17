package codes.May16;

class May16{
    public static void May16 (String[] args) {
        //System.out.println(InitCheck.instVal); //에러 발생
        System.out.println(InitCheck.staVal);
    
        InitCheck a = new InitCheck();
    
        System.out.println(a.instVal);
        System.out.println(a.staVal);
    }
}

