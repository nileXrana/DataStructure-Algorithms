
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     ArrayList<Integer> al = new ArrayList<>(5);
    //     al.add(0,10);   //initialising the value
    //     al.add(1,20);
    //     al.add(2,30);
    //     al.add(3,40);
    //     al.add(4,50);
    //     for(int i = 0; i < al.size(); i++){
    //         System.out.print(al.get(i)+" ");
    //     }
    //     System.out.println(al.size());
    

    //    al.add(63);
    //     for(int i = 0; i < al.size(); i++){
    //         System.out.print(al.get(i)+" ");       //printing the value
    //     }
    //     System.out.println(al.size());
    //     //solution
    //     al.remove(4);
    //     System.out.println(al);
        
         ArrayList<Integer> al = new ArrayList<>(5);
         al.add(0,1);
         al.add(1,2);
         al.add(2,3);
         al.add(3,4);
         al.add(4,5);

         System.out.println(al);
         System.out.println(al.size());
         al.set(0,100);
         System.out.println(al);
         System.out.println(al.get(0));
         al.add(5);
         System.out.println(al);
         System.out.println(al.size());
         al.remove(0);
         System.out.println(al);
         System.out.println(al.size());




    }
}
