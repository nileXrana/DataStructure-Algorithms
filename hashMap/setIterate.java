import java.util.*;

public class setIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        for(int ele : set){ // for each loop
            System.out.print(ele+" ");
        }
        System.out.println();
        set.clear();
        System.out.println(set);
    }
}
