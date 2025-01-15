import java.util.Scanner;

class nilesh{
    int ncr(int i , int j){
        int nfact = 1;
        int rfact = 1;
        int nr = i - j;
        int nrfact = 1;
        for(int a = 1; a <= i; a++){
            nfact *= a;
        }
        for(int b = 1; b <= j; b++){
            rfact *= b;
        }
        for(int c = 1; c <= nr; c++){
            nrfact *= c;
        }
        int akop = nfact / (rfact * nrfact);
        return akop;
    }
}
public class pascalT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nilesh ni = new nilesh();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int k = 1; k <= n - i - 1; k++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(ni.ncr(i,j)+"   ");
            }
            System.out.println();
        }
        
    }
}
