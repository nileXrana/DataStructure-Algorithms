public class methods_ques3 {
    public static void main(String[] args) {
        nilesh sc = new nilesh();
        sc.odd(5,17);
    }
}

class nilesh{

    //   has part 

    void odd(int a, int b){
        for(int i = a+1; i < b; i++){
            if(i % 2 != 0) System.out.println(i);
        }
    }
}
