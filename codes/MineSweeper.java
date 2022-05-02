package codes;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int cnt = num*num/3;
        char[][] board = new char[num + 10][num + 10];
        int[] dx = new int[]{0, 1, 0, -1, 1, 1, -1, -1};
        int[] dy = new int[]{1, 0, -1, 0, 1, -1, 1, -1};

        for (int i = 1; i<num + 1; i++) for (int j = 1; j<num + 1; j++) board[i][j] = 'N'; //set mines to 'N'
        
        //place mines randomly
        while (true){
            int x = (int)(Math.random()*num);
            int y = (int)(Math.random()*num);
            if (board[x][y] == 'N'){ //check if the position is already occupied
                board[x][y] = '*'; //place mine
                cnt--;
            }
            if (cnt == 0) break;
        }
        //count neighbor mines
        for (int i = 1; i < num + 1; i++){
            for (int j = 1; j < num + 1; j++){
                if (board[i][j] == 'N'){
                    int cntMine = 48;
                    for (int k = 0; k<8; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (board[nx][ny] == '*') cntMine++;
                    }
                    board[i][j] = (char)(cntMine);
                }
            }
        }
        //print board
        for (int i = 1; i < num + 1; i++){
            for (int j = 1; j < num + 1; j++) System.out.print(board[i][j] + " ");
            System.out.println();
            System.out.println();
        }
    }
}
