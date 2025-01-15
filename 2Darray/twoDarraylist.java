import java.util.*;
public class twoDarraylist {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // ArrayList<Integer> arr = new ArrayList<>(5);
        // int[][] arr = new int[5][3];
        // ArrayList<Array List<Integer>> arr = new ArrayList<>(5);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(4);
        b.add(5);
        d.add(6);
        
        //2D arraylist
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        // print 2d list
        for(int i = 0; i < arr.size(); i++){
            List<Integer> p = arr.get(i);
            for(int j = 0; j < p.size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
