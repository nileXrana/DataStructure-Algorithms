import java.util.*;
public class topoSortBFS {
    public static void bfs(List<List<Integer>> adj, int[] indegree, List<Integer> ans){
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        for(int j = 0; j < n; j++){
            if(indegree[j] == 0) q.add(j);
        }
        while(q.size() != 0){
            int ak = q.remove();
            ans.add(ak);
            for(int ele : adj.get(ak)){
                indegree[ele]--;
                if(indegree[ele] == 0) q.add(ele);
            }
        }
        // check for cycle :
        if(ans.size() != n) System.out.println("cycle detected, Topological sort not possible !");
    }
    public static void main(String[] args) {
        // given :
        List<Integer> a = new ArrayList<>();
        a.add(1);
        List<Integer> b = new ArrayList<>();
        b.add(2); b.add(3);
        List<Integer> c = new ArrayList<>();
        c.add(3); c.add(4);
        List<Integer> d = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(a);
        adj.add(b);
        adj.add(c);
        adj.add(d);
        adj.add(e);
        // solution :
        int n = adj.size();
        // indegree array for bfs :
        int[] indegree = new int[n];
        for(int i = 0; i < n; i++){
            for(int ele : adj.get(i)){
                indegree[ele]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        // all nodes will be covered without loop :
        bfs(adj,indegree,ans);
        // print ans :
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
