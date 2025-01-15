
public class setOrNotSet {
    public static void main(String[] args) {
        int k = 3;
        int a = 186;
        int mask = 1 << k;
        if((a & mask) == 0) System.out.println("not set");
        else System.out.println("set");
    }
}
