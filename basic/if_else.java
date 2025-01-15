import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int a = sc.nextInt();
        // if (a % 2 == 0) System.out.println("even");    //  == equality operator(comparision)
        // else System.out.println("odd");
        

        // // take +ve integer as input and tell if it is divisible by 5 or not
        // System.out.print("enter your no. : ");
        // int b = sc.nextInt();
        // if (b % 5 == 0) System.out.println("the number is divisible by 5");
        // else System.out.println("the number is not divisible by 5");


        // // take any integer as input and print the absolute value of the integer
        // System.out.print("enter the integer value : ");
        // int c = sc.nextInt();
        // if (c < 0){
        //     System.out.println("absolute value : "+-c);
        // } 
        // else{
        //     System.out.println("absolute value : "+c);
        // }


        //if cp and sp is taken as input , write a program to tell weather profit hua hai ya loss.Also determine how much profit or loss he had.
        // System.out.print("enter cp : ");
        // double cp = sc.nextDouble();
        // System.out.print("enter sp : ");
        // double sp = sc.nextDouble();
        // if (sp > cp){
        //     System.out.println("profit of "+(sp-cp));
        // }
        // else if (cp > sp) System.out.println("loss of "+(cp - sp));
        // else System.out.println("no profit no loss");


        //take inpput l and b of rectangle and find weather area of rectangle  is greater than its perimeter
        // System.out.print("enter length : ");
        // double l = sc.nextDouble();
        // System.out.print("enter breadth : ");
        // double b = sc.nextDouble();
        // double area = l * b;
        // double perimeter = 2*(l+b);
        // if (area > perimeter){
        //     System.out.println("area = "+area);
        //     System.out.println("perimeter = "+perimeter);
        //     System.out.println("area is greater by "+(area - perimeter));
        // }
        // else if (perimeter > area){
        //     System.out.println("area = "+area);
        //     System.out.println("perimeter = "+perimeter);
        //     System.out.println("perimeter is greater by "+(perimeter - area));
        // }
        // else{
        // System.out.println("area = "+area);
        // System.out.println("perimeter = "+perimeter);
        // System.out.println("both area and perimeter are equal");


        //      (logical operators)
        //write a code for 3 digit no. 
        // System.out.print("enter any number : ");
        // int abc = sc.nextInt();
        // if (abc > 99 && abc < 1000){                        //logical and
        //     System.out.println("3 digit no.");
        // }
        // else System.out.println("not a 3 digit number");


        //cod for 5 digit no.
        // System.out.print("enter any number : ");
        // int bcd = sc.nextInt();
        // if (bcd > 9999 && bcd < 100000) System.out.println("5 digit number");
        // else System.out.println("not a 5 digit number");


        //tell weather the no. is divisible by 3 or 5.
        // System.out.print("enter no : ");
        // int a = sc.nextInt();
        // if (a % 3 == 0 || a % 5 == 0) System.out.println("yes");
        // else System.out.println("no");


        //weather valid or invalid sides of a triangle
        // System.out.print("enter first side : ");
        // float a = sc.nextFloat();
        // System.out.print("enter second side : ");
        // float b = sc.nextFloat();
        // System.out.print("enter third side : ");
        // float c = sc.nextFloat();
        // if (a + b > c && b + c > a && c +a > b) System.out.println("valid triangle");
        // else System.out.println("invalid triangle");


        // print the greatest of the 3 nos.
        // System.out.print("enter first no : ");
        // double a = sc.nextDouble();
        // System.out.print("enter second no : ");
        // double b = sc.nextDouble();
        // System.out.print("enter third no : ");
        // double c = sc.nextDouble();
        // if (a >= b && a >= c) System.out.println(a+"is greatest");
        // else if  (b >= a && b >= c) System.out.println(b+"is greatest");
        // else System.out.println(c+"is greatest");


        //print the lowest of the 3nos.
        // System.out.print("enter first no : ");
        // double a = sc.nextDouble();
        // System.out.print("enter second no : ");
        // double b = sc.nextDouble();
        // System.out.print("enter third no : ");
        // double c = sc.nextDouble();
        // if (a <= b && a <= c) System.out.println(a);
        // else if  (b <= c && b <= a) System.out.println(b);
        // else System.out.println(c);


        //print greatest of the 3nos. without logical operators.         
        // System.out.print("enter first no : ");
        // double a = sc.nextDouble();
        // System.out.print("enter second no : ");
        // double b = sc.nextDouble();
        // System.out.print("enter third no : ");
        // double c = sc.nextDouble();
        // if (a > b){
        //     if (a > c) System.out.println(a);
        //     else System.out.println(c);
        // }
        // else{
        //     if (b > c) System.out.println(b);
        //     else System.out.println(c);


        //determine youngest of the three people using nested if else : 
        // System.out.print("enter nilesh's age : ");
        // double a = sc.nextDouble();
        // System.out.print("enter sham's age : ");
        // double b = sc.nextDouble();
        // System.out.print("enter ram's age : ");
        // double c = sc.nextDouble();
        // if (a < b){
        //     if (a < c) System.out.println("nilesh");
        //     else if (a == c) System.out.println("nilesh and ram");
        //     else System.out.println("ram");
        // }
        // else if (a == b){
        //     if (a < c) System.out.println(";nilesh and sham");
        //     else if (a > c) System.out.println("ram");
        //     else System.out.println("all are of same age");
        // }
        // else{
        //     if (b < c) System.out.println("sham");
        //     else if (b > c) System.out.println("ram");
        //     else System.out.println("sham and ram");
        // }


        // take marks as input and give grades accordingly.
        // System.out.print("enter marks : ");
        // double a = sc.nextDouble();
        // if (a >= 91) System.out.println("A+");
        // else if (a >= 81) System.out.println("A");
        // else if (a >= 71) System.out.println("B");
        // else if (a >= 61) System.out.println("C");
        // else if (a >= 51) System.out.println("D");
        // else System.out.println("Fail");


        //take input(x,y) and tell they lie on origin,x,y axis,I,II,III,IV quadrant.
        // System.out.print("enter no : ");
        // int a,b;
        // a = sc.nextInt();
        // System.out.print("enter no. : ");
        // b = sc.nextInt();
        // if (a == 0 && b == 0) System.out.println("lies on the origin");
        // else if (b == 0) System.out.println("lies on the x axis");
        // else if (a == 0) System.out.println("lies on the y axis");
        // else if (a > 0 && b > 0) System.out.println("lies on the I quadrant");
        // else if (a < 0 && b > 0) System.out.println("lies on the II quadrant");
        // else if (a < 0 && b < 0) System.out.println("lies on the III quadrant");
        // else System.out.println("lies on the IV quadrant");


        //print the absolute value of the integer
        // System.out.print("enter number : ");
        // int a = sc.nextInt();
        // if (a > 0) System.out.println("absoulte value of "+a+" is "+a);
        // else if (a < 0) System.out.println("absoulute value of "+a+" is "+-a);
        // else System.out.println("0 is neutral");


        //print weather leap year or not 
        // System.out.print("enter year : ");
        // int y = sc.nextInt();
        // System.out.println((y % 4 == 0) ? "leap year" : "not a leap year");


        //tell weather scanence , isoceles , equilateral triangle
        // System.out.print("enter sides : ");
        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        // double c = sc.nextDouble();
        // if (a == b && b == c) System.out.println("equilateral triangle");
        // else if (a == b && b != c) System.out.println("isoceles triangle");
        // else if (b == c && c != a) System.out.println("isoceles triangle");
        // else if (c == a && a != b) System.out.println("isoceles triangle");
        // else System.out.println("scalence triangle");


        //alphabet to number : 
        // System.out.print("enter alphabet : ");
        // char abc = sc.next().charAt(0);
        // int n = (int)abc;
        // int b = n - 96;
        // System.out.println(b);


        //absolute value :(print the fractional part of the integer)
        System.out.print("enter number : ");
        float d = sc.nextFloat();
        float i = (int)d;
        float dd = d - i;

        float am = -d;
        float ak = (int)am;
        float al = am - ak;
        if (d >= 0 ) System.out.printf("%.2f",dd);
        else System.out.printf("%.2f",1 - al);



        sc.close();

            }
        

            

        






        
    }

