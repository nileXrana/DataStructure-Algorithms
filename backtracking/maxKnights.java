public class maxKnights {
    static int maxKnight;
    public static void nKnight(char[][] board, int row, int col, int num){
        int n = board.length;
        if(row == n){ // base case :
            // for(int i = 0; i < n; i++){
            //     for(int j = 0; j < n; j++){
            //         System.out.print(board[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();
            maxKnight = Math.max(maxKnight,num);
            return; // remember :
        }
        if(isSafe(board,row,col)){
            board[row][col] = 'K';
            if(col < board.length-1) nKnight(board,row,col+1,num+1);
            else nKnight(board,row+1,0,num+1);
            board[row][col] = 'X'; // backtracking : 
        }
        // v important for all the configurations :
        if(col < board.length-1) nKnight(board,row,col+1,num);
        else nKnight(board,row+1,0,num);
        
    }
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        //if(x == n*n-1) return true;
        // 2 up 1 right
        int i = row - 2;
        int j = col + 1;
        if(i >= 0 && j < n && board[i][j] == 'K') return false;

        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if(i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if(i >= 0 && j < n && board[i][j] == 'K') return false;

        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if(i < n && j < n && board[i][j] == 'K') return false;

        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if(i < n && j < n && board[i][j] == 'K') return false;

        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if(i < n && j >= 0 && board[i][j] == 'K') return false;

        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if(i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if(i < n && j >= 0 && board[i][j] == 'K') return false;

        return true;
    }
    public static void main(String[] args) {
        maxKnight = -1;
        int n = 4; // given
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) board[i][j] = 'X';
        }
        nKnight(board,0,0,0);
        System.out.println(maxKnight);
    }
}
