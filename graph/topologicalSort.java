
import java.util.*;
public class topologicalSort {
    // method 1 : dfs(easy) :
    public static void dfs(int i, int[][] adj, boolean[] visited, List<Integer> ans){
        visited[i] = true;
        for(int ele : adj[i]){
            if(!visited[ele]) dfs(ele,adj,visited,ans);
        }
        ans.add(i);
    }
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[][] adj = {{1},{2,3},{3,4},{},{}};
        int n = adj.length;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i,adj,visited,ans);
            }
        }
        // reverse : very important(for dfs)
        for(int i = ans.size()-1; i >= 0; i--){
            System.out.print(ans.get(i)+" ");
        }

    }
}
