import java.util.Scanner;

class akhil{
    int gcd(int a, int b){
        int sum = 1;
        for(int i = 1; i <= Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0){
                sum = i;
            }
        }
        return sum;
    }

}

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        akhil ak = new akhil();
       int hcf = ak.gcd(12,16);
       System.out.println(hcf);





        sc.close();
    }
}
