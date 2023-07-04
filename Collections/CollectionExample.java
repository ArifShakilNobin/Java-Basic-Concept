package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
   public static void main(String[] args) {
      java.util.Collection<String> collections = new ArrayList<>();
      collections.add("a");
      collections.add("b");

      java.util.Collection<String> first = new ArrayList<>();
      first.add("one");
      first.add("four");

      java.util.Collection<String> toBeRetained = new ArrayList<>();
      toBeRetained.add("a");
      toBeRetained.add("Eleven");

      System.out.println("strings = " + collections);
      System.out.println("size = " + collections.size());
      System.out.println("is empty = " + collections.isEmpty());
      System.out.println("contains = " + collections.contains("a"));
      System.out.println("hashcode = " + collections.hashCode());

      boolean hasChanged = collections.addAll(first);
      System.out.println("Has strings changed? " + hasChanged);
      System.out.println("strings = " + collections);

      boolean removeAll = collections.removeAll(first);
      System.out.println("strings = " + collections);

      boolean retainAll = collections.retainAll(toBeRetained);
      System.out.println("Has strings changed? " + retainAll);
      System.out.println("strings = " + collections);

//      System.out.println("The number of elements in strings is " + collections.size());
//      collections.clear();
//      System.out.println("After clearing it, this number is now " + collections.size());


      Collection<String> strings = List.of("one", "two");

      String[] largerTab = {"three", "three", "three", "I", "was", "there"};
      System.out.println("largerTab = " + Arrays.toString(largerTab));

      String[] result = strings.toArray(largerTab);
      System.out.println("result = " + Arrays.toString(result));

      System.out.println("Same arrays? " + (result == largerTab));

   }

}
