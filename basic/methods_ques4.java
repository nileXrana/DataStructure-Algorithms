public class methods_ques4 {
    public static void main(String[] args){
        akhil sc = new akhil();
        sc.sqr(10442);
    }
}

class akhil{
    int sum = 0;


    void sqr(int n){
        for(int i = n; i != 0; i/=10){
            sum++;
        }
        System.out.println(sum * sum);
    }
}
