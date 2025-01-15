import java.util.*;

public class mapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("nilesh",10);
        map.put("arvind",22);
        map.put("rohit",35);
        map.put("aditya",40);
        System.out.println(map);
        System.out.println(map.containsKey("nilesh"));
        System.out.println(map.containsValue(22));
        map.put("nilesh",100);  // update
        System.out.println(map); // map can't have duplicate keys
        map.put("akhil",100);
        System.out.println(map); // map can have duplicate values
        map.remove("akhil");  // value bhi remove ho jayegi
        System.out.println(map);
        System.out.println(map.get("rohit"));
        
    }
}
