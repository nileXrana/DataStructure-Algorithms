
public class basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());  //by default 16
        System.out.println(sb.reverse());
    }
}
