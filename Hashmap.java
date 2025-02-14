import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        // Create
        HashMap<String,Integer> hm = new HashMap<>();
        // Insert
        hm.put("India", 100);
        

        System.out.println(hm);
        // int pp = hm.get("India");
        // System.out.println(pp);

        // System.out.println(hm.containsKey("India"));

        // remove
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());

    }
    
}