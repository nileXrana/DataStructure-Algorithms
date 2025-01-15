class akhil{
    double area;
    double circle(double r){
        area = 3.14 * r * r;
        return area;
    }
}



public class methods_ques2 {
public static void main(String[] args) {
        akhil sc = new akhil();
        double a = sc.circle(5);
        System.out.println(a);
    }
}
