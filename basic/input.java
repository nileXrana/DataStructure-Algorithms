import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number whose square has to be calculated : ");
        // int b = sc.nextInt();
        // System.out.print("the square of "+b+" is : ");
        // System.out.println(b*b);
        // System.out.println();


        // //area of circle
        // System.out.print("enter radius of circle: ");
        // double r = sc.nextDouble();
        // double area = 3.1415 * r * r;
        // System.out.println("area of circle is : "+area);
        // System.out.println();


        // //volume of sphere
        // System.out.print("enter the radius of the sphere : ");
        // double rad = sc.nextDouble();
        // double vol = 4 * 3.1415 * rad * rad * rad / 3;
        // System.out.println("volume of the sphere is : "+vol);
        // System.out.println();


        // //simple interest
        // // Scanner o = new Scanner(System.in);
        // System.out.print("enter principal : ");
        // double p = sc.nextDouble();
        // System.out.print("enter rate : ");
        // double rate = sc.nextDouble();
        // System.out.print("enter time : ");
        // double time = sc.nextDouble();
        // double simint = p * rate * time / 100;
        // System.out.println("simple interest is : "+simint);
        // System.out.println();


        //taking char as input and finding its unicode value
        System.out.print("enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println("the ascii/unicode value of "+ch+" is : "+(int)ch);


        //taking boolean as input
        System.out.print("enter the value : ");
        boolean bool = sc.nextBoolean();
        System.out.println("the answer is : "+bool);


        
        sc.close();
    }
}