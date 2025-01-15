
public class equals {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "ab";
        c += 'c';
        System.out.println(a);
        System.out.println(c);
        System.out.println(a == c);  // in string equality operator checks the address not value !
        System.out.println(c.equals(a));   // checks the value 

    }
}
