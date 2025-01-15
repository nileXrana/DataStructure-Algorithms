public class assignmentQ6 {
    public static void main(String[] args) {
        String str = "nilesh";
        int n = str.length();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        StringBuilder tb = new StringBuilder(str);
        tb.append(sb);
        System.out.println(tb);

    }
}
