import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {

        //power of 2
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter number : ");
        // double a = sc.nextDouble();
        // double n = Math.log(a) / Math.log(2);
        // if (n == (int)n) System.out.println("yes");
        // else System.out.println("no");


        //power of 2 by loop
        // System.out.print("enter number : ");
        //     double n = sc.nextDouble();
        //     double i = n;
        //     while(i>=2){
        //         i/=2;
        //     }
        //     if(i==1) System.out.println("yes");
        //     else System.out.println("no");


        //print total notes if u have notes of : 100,50,10,5,2,1
        // System.out.print("enter amount : ");
        // int a = sc.nextInt();
        // int b = a/100;
        // int c = (a-(b*100)) / 50;
        // int d = (a-(b*100+c*50)) / 10;
        // int e = (a-(b*100+c*50+d*10)) / 5;
        // int f = (a-(b*100+c*50+d*10+e*5)) / 2;
        // int g = (a-(b*100+c*50+d*10+e*5+f*2)) / 1;
        // System.out.println(b+c+d+e+f+g+" notes");


        //format the number to include the leading zero
        // System.out.print("enter number : ");
        // int a = sc.nextInt();
        // String b = String.format("%02d",a);
        // System.out.println(b); 


        //prime or composite
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int i = 2;
        // int x = 0;
        // while(i<n){
        //     if(n % 2 == 0){
        //         System.out.println("composite");
        //         x = 1;
        //         break;
        //     }
        //     i++;
        // }
        // if(n == 0 || n == 1) System.out.println("neither prime nor composite");
        // else if(x == 0) System.out.println("prime");


        //print number of digits of a number
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = n;
        // while(i != 0){
        //     i/=10;
        //     sum++;
        // }
        // System.out.println(sum+" digits");


        //print sum of digits of a number
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = n;
        // while(i!=0){
        //     sum += i % 10;
        //     i/=10;
        // }
        // System.out.println("sum of number is : "+sum);


        //print reverse of a number
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = n;
        // while(i!=0){
        //     sum = i % 10;
        //     System.out.print(sum);
        //     i/=10;
        // }


        //print factorial of a 
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int i = n;
        // int a = 2;
        // System.out.print(1);
        // while(i!=1){
        //     if(i % a == 0){
        //         i/=a;
        //         System.out.print("*"+a);
        //     }
        //     else a++;
            
        // }


        //print palindrom or not
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = n;
        // while(i!=0){
        //     sum = (sum * 10) + (i % 10);
        //     i/=10;

        // }
        // if(n == sum)System.out.println("palindrom");
        // else System.out.println("not a palindrom");

        
        //print binary to decimal
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int a = 1;
        // int sum = 0;
        // int i = n;
        // while(i!=0){
        // sum += (i % 10) * a;
        // i/=10;
        // a *= 2;
        // }
        // System.out.println(sum);


        //print decimal to binary
        // System.out.print("enter number : ");
        // int decimal = sc.nextInt();
        // int binary = 0;
        // int a = 1;
        // for(int i = decimal; i!=0; i/=2){
        //     binary = (i % 2) * a + binary;
        //     a *= 10;
        // } 
        // System.out.println(binary);


        //print reverse of a number and replace 0 with 1
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int rev = 0;
        // for(int i = n; i!=0; i/=10){
        //     if(i % 10 == 0) rev = (rev * 10) + 1;
        //     else rev = (rev * 10) + (i % 10);
        // }
        // System.out.println(rev);


        //print same number by replacing 0 with 1
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int rev = 0;
        // for(int i = n; i!=0; i/=10){
        //     if(i % 10 != 0) rev = (rev * 10) + (i % 10);
        //     else rev = (rev * 10) + 1;
        // }
        
        // int rev2 = 0;
        // for(int a = rev; a!=0; a/=10){
        //     rev2 = (rev2 * 10) + (a % 10);
        // }
        // System.out.println(rev2);


        //print reverse of a number and remove 0
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int rev = 0;
        // for(int i = n; i!=0; i/=10){
        //     if(i % 10 == 0){
        //         rev = rev+0;
        //     }
        //     else rev = (rev * 10) + (i % 10);
        // }
        // System.out.println(rev);


        // print same number but remove 0
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int a = 1;
        // for(int i = n; i!=0; i/=10){
        //     if(i % 10 != 0){
        //         sum = (i % 10) * a + sum;
        //         a *= 10;
        //     }
        //     else{
        //         sum = (i % 10) * a + sum;
        //     }

        // }
        // System.out.println(sum);


        //print perfect number or not
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i < n; i++){
        //     if(n % i == 0){
        //         sum += i;
        //     }
            
        // }
        // if(sum == n) System.out.println("perfect number ");
        //     else System.out.println("not a perfect number");


        
        // rohit ca question
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // float sum = 1;
        // for(float i = 1; i <= n - 1; i++){
        //     sum += i/(i+1);
        // }
        // String abc = String.format("%.2f",sum);
        // System.out.println(abc);

        













        sc.close();
    }
}
