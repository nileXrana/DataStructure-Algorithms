import java.util.*;
public class mapIterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("nilesh",10);
        map.put("arvind",20);
        map.put("rohit",30);
        map.put("aditya",40);
        // for keys(important)
        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println();

        // for values
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        // for both key and value
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
