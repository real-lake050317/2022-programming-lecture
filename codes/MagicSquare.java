import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[][] board = new int[n+10][n+10];
        int x = n/2, y = 0;
        int cnt = 0;
        while (true){
            board[y][x] = ++cnt;
            if (cnt == n*n) break;
            x += 1;
            y -= 1;
            if (y > n) y -= n;
            if (x < 0) x += n;
            if (board[y][x] != 0){
                y -=1;
                x += 2;
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
