package Collections;

import java.util.HashSet;

/**
 * default size is 16
 * load factor/ fillRation 0.75
 * don't allow duplicate value
 * it's not sorted order
 * use null
 * sorting can't possible directly
 */
public class HashSetExample {
    public static void main(String[] args) {
//        HashSet hs = new HashSet(100, 0.90F); // define size and load factor also

        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("Nobin");
        hs.add("Arif");
        hs.add(4.5);
        hs.add(true);
        hs.add(null);
        System.out.println(hs); // [null, 4.5, 100, Nobin, true] insertion order not preserved


        //remove
        hs.remove("Nobin");
        System.out.println(hs); // [null, 4.5, 100, true]

        //contains
        System.out.println(hs.contains("Nobin")); // false
        System.out.println(hs.contains("arif")); // false :  hashset is case-sensitive





    }
}
