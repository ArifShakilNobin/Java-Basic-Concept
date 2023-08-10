package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //add elements
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList);

        //get elements

        int index = arrayList.get(0);
        System.out.println(index);

        // add el in between
        arrayList.add(2,5);
        System.out.println(arrayList);

        //set element
        arrayList.set(0,4);
        System.out.println(arrayList);

        //delete element
        arrayList.remove(2);

        //size
        int size = arrayList.size();
        System.out.println(size );

        // loops
        for (int i=0;i< arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
        System.out.println();

        Collections.sort(arrayList);
        System.out.println(arrayList);



    }
}
