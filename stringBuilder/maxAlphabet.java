
public class maxAlphabet {
    public static void main(String[] args) {
        String str = "aaaaabbbssdeeeee";
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[(int)ch - 97]++;
        }
        int mx = arr[0];
        for(int i = 1; i < arr.length; i++){
            mx = Math.max(mx,arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == mx){
                int y = i + 97;
                System.out.println((char)y);
            }
        }
    }
}
