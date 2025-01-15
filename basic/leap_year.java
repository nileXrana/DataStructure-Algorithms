import java.util.Scanner;
public class leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year : ");
        float y = sc.nextFloat();
        if(y % 4 == 0){
            float a = y/100;
            if(a == (int)a){
                if(y % 400 == 0) System.out.println("leap year");
                else System.out.println("not a leap year");
            }
            else System.out.println("leap year");

        }
        else System.out.println("not a leap year");
    }
}
