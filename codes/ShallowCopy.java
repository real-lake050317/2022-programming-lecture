public class ShallowCopy {
    public static void main(String[] args){
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int[][] x = new int[3][];

        for (int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*10.0 + 1.0);
        }

        for (int i = 0; i<b.length; i++){
            c[i] = (int)(Math.random()*10.0 + 1.0);
        }

        for (int i = 0; i<c.length; i++){
            c[i] = (int)(Math.random()*10.0 + 1.0);
        }

        for (int i = 0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        
        x[0] = a;
        x[1] = b;
        x[2] = c;


    }
}