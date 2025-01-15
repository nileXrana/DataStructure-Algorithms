
public class swap {
    public static void main(String[] args) {
        int a = 5; int b = 10;
        // method 1 :
        // int temp = a;
        // a = b;
        // b = temp;

        // method 2 :
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // method 3 : XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+"  "+b);
    }
}
