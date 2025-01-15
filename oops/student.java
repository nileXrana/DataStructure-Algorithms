
public class student {  
    String name; // name attribute
    int rno;  // rno attribute
    double percent;  // percent attribute
    final String schoolName = "APS"; //schoolName attribute
    static int totalObject = 0;  // static attribute

    
    public int getrno(){  // getter 
        return rno;
    }

    public void setrno(int a){  // setter 
        rno = a;
    }

    public student(){  // default constructor
        totalObject++;
    }

    public student(String name, int rno, double percent){ // constructor 
        this.name = name;
        this.rno= rno;
        this.percent = percent;
        totalObject++;
    }
}
