import java.util.Scanner;
import java.util.ArrayList;

public class arraylist_add {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al+" "+al.size());
        al.add(1);
        System.out.println(al+" "+al.size());
        al.add(2);
        System.out.println(al+" "+al.size());
        al.add(3);
        System.out.println(al+" "+al.size());
        al.remove(1);
        System.out.println(al+" "+al.size());

    }
}
