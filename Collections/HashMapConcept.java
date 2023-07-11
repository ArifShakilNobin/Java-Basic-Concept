package Collections;

import java.util.HashMap;

public class HashMapConcept {


    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();

        maps.put("Naveen", 100);
        maps.put("Tom", 200);
        maps.put("Lisa",300);
        maps.put("Peter",400);
        maps.put("Robby",500);

        System.out.println(maps);

        System.out.println(maps.get("Naveen"));
        System.out.println(maps.size());
        System.out.println(maps.isEmpty());


        maps.putIfAbsent("Nobin",1000);
        maps.putIfAbsent(null,10);
        System.out.println(maps);
        maps.replace("Nobin",1000,300);
        System.out.println(maps);

    }

}
