import java.util.*;
public class pascal_triangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> arr = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            List<Integer> brr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) brr.add(1);
                else brr.add(arr.get(i-1).get(j) + arr.get(i-1).get(j-1));
            }
            arr.add(brr);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
