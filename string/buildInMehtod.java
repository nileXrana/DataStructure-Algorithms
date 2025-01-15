
public class buildInMehtod {
    public static void main(String[] args) {
        String str = "Nilesh Rana";
        System.out.println(str.length());
        System.out.println(str.charAt(7));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.indexOf('z'));
        System.out.println();

        String a = "adc";
        String b = "abc";
        System.out.println(a.compareTo(b));
        
        String sc = "Macbook Air M1";
        System.out.println(sc.contains("Air"));
        System.out.println(sc.startsWith("Mac"));
        System.out.println(sc.endsWith("1"));

        String abc = "Hello There";
        String k = abc.toLowerCase();
        System.out.println(k);
        String l = abc.toUpperCase();
        System.out.println(l);
        System.out.println(abc);
        System.out.println();

        String p = "Nilesh";
        String q = "Rana";
        System.out.println(p.concat(q));
        System.out.println(p);
        p = p.concat(q);
        System.out.println(p);
        System.out.println();

        String j = "";  //empty string
        System.out.println(j.length());
        System.out.println();

        //substring ***
        String ni = "abcde";
        System.out.println(ni.substring(2));
        System.out.println(ni.substring(1,4));
    }
}
