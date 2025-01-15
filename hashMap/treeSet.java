import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);
        set.add(40);
        
        for(int ele : set){ // for each loop
            System.out.print(ele+" ");
        }
    }
}
