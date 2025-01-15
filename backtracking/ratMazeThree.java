
public class ratMazeThree {
    public static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze){
        if(sr > er || sc > ec) return;
        if(sr < 0 || sc < 0) return;
        if(maze[sr][sc] == 0) return; // imp
        if(maze[sr][sc] == -1) return; //  imp
        if(sr == er && sc == ec){ // printing path :
            System.out.println(s);
            return;
        }
        maze[sr][sc] = -1; // visited
        // go right
        printPath(sr,sc+1,er,ec,s+'R',maze);
        // go down
        printPath(sr+1,sc,er,ec,s+'D',maze);
        // go left
        printPath(sr,sc-1,er,ec,s+'L',maze);
        // go up
        printPath(sr-1,sc,er,ec,s+'U',maze);
        // backtracking :
        maze[sr][sc] = 1;
    }
    public static void main(String[] args) {
        // without using extra isVisited array : best way out
        int rows = 3;
        int col = 4;
        int[][] maze = {{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        // boolean[][] isVisited = new boolean[rows][col];
        // by default false bhara hoga :
        printPath(0,0,rows-1,col-1,"",maze);
    }
}
