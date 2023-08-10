package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcept {


    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();

        maps.put("Naveen", 100);
        maps.put("Tom", 200);
        maps.put("Lisa",300);
        maps.put("Peter",400);
        maps.put("Robby",500);

//        System.out.println(maps);

//        System.out.println(maps.get("Naveen"));
//        System.out.println(maps.size());
//        System.out.println(maps.isEmpty());


        maps.putIfAbsent("Nobin",1000);
        maps.putIfAbsent(null,10);
//        System.out.println(maps);
        maps.replace("Nobin",1000,300);
//        System.out.println(maps);


        //iterator
        Iterator<String> it =  maps.keySet().stream().iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = maps.get(key);
            System.out.println("key = " + key + " " + "value = " + " " +value);
            System.out.println("---------------");

            Iterator<Map.Entry<String, Integer>> it1 = maps.entrySet().stream().iterator();
            while (it1.hasNext())
            {
                Map.Entry<String, Integer> entry =  it1.next();
                System.out.println("key = " + entry.getKey() + " " + "value = " + " " +entry.getValue());

//                maps.entrySet().forEach(String,Integer);

            }
        }

    }

}
