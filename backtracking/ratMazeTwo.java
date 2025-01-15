
public class ratMazeTwo {
    public static void printPath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
        if(sr > er || sc > ec) return;
        if(sr < 0 || sc < 0) return;
        if(isVisited[sr][sc] == true) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        printPath(sr,sc+1,er,ec,s+'R',isVisited);
        // go down
        printPath(sr+1,sc,er,ec,s+'D',isVisited);
        // go left
        printPath(sr,sc-1,er,ec,s+'L',isVisited);
        // go up
        printPath(sr-1,sc,er,ec,s+'U',isVisited);
        // backtracking :
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        // we can go left, right, down, up :
        // can't do without backtracking :
        int rows = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[rows][col];
        // by default false bhara hoga :
        printPath(0,0,rows-1,col-1,"",isVisited);
    }
}
