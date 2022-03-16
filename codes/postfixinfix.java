public class postfixinfix {
    public static void main(String[] args){
        /*
        for (int i = 0; i<5; i++){
            System.out.println(i);
        }
        for (int i = 0; i<5; ++i){
            System.out.println(i);
        }
        */
        int i = 5;
        int j;
        //j = i++;
        j = ++i;
        System.out.println(j);
    }
}
