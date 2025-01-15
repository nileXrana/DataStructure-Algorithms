class addition{
    //int a;
    //int b;
    int sum;

        int add(int x, int y, int z){
        //a = 5;
        //b = 10;
        //sum = a + b;
        //System.out.println("the sum is : "+sum);
        //return sum;
        sum = x + y + z;
        System.out.println(sum);
        return sum;              //code terminates after return
    }
}

public class methods {
    public static void main(String[] args) {

        addition ad = new addition();    //class ka object banaya
        int m = 50;
        int n = 10;
        int o = 50;
        int nilesh = ad.add(m,n,o);     //calling a method named add
        System.out.println("the sum is "+nilesh);





    }
}
