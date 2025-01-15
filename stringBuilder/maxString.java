public class maxString {
    public static void main(String[] args) {
        nilesh ni = new nilesh();
        String[] arr = {"112","014","0015","1523","001422"};
        String mx = arr[0];
        for(int i = 1; i < arr.length; i++){
            mx = ni.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}

class nilesh{
    public static String max(String a, String b){
        akhil ak = new akhil();
        String c = ak.lo(a);
        String d = ak.lo(b);
        if(c.length() > d.length()) return a;
        if(d.length() > c.length()) return b;
        for(int i = 0; i < c.length(); i++){
            if((int)c.charAt(i) > (int)d.charAt(i)) return a;
            if((int)d.charAt(i) > (int)c.charAt(i)) return b;
        }

        return a;
    }
}

class akhil{
    public static String lo(String a){
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != 0){
                return a.substring(i);
            }
        }
        return a;
    }
}
