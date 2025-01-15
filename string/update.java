
public class update {
    public static void main(String[] args) {
        String str = "Nilesh";
        int n = str.length();
        String a = "";
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                a += 'a';
            }
            else{
                a += str.charAt(i);
            }
        }
        System.out.println(a+" ");
    }
}
