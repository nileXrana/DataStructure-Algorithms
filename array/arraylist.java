import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(3); //3 is not size, it is capacity of the arrayList
        al.add(0,10);    //al[0] = 10;
        al.add(1,20);
        al.add(2,30);
        System.out.println(al.get(2));
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //to print all element of arrayList
        System.out.println(al);
        
        //to modify the value
        al.set(0,50);
        System.out.println(al);

        // to add new value to arrayList
        al.add(100);   //push back
        System.out.println(al);
        System.out.println(al.size());





    }
}
