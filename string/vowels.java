
public class vowels {
    public static void main(String[] args) {
        nilesh ni = new nilesh();
        String str = "nilesh raniiiIIIa";
        int n = str.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ni.vowel(ch) == true) sum++;
        }
        System.out.println(sum);

    }
}

class nilesh{
    public static boolean vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        else return false;
    }
}
