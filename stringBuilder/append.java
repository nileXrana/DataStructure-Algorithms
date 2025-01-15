public class append{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("nilesh");
        sb.append("Rana");
        System.out.println(sb);
        sb.append(5);
        System.out.println(sb);
        char[] arr = {'a','b','c'};
        sb.append(arr);
        System.out.println(sb);
        StringBuilder SB = new StringBuilder("ABC");
        sb.append(SB);
        System.out.println(sb);
    }
}
