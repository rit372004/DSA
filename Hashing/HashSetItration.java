package Hashing;

import java.util.*;

public class HashSetItration {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Nodia");
        hs.add("Bengaluru");
        
        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for (String city : hs) {
            System.out.println(city);
        }
    }

}
