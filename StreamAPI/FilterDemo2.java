package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("abulsdasdad", "ballbul", "cabul", "dabul11");
        List<String> longName = new ArrayList<>();


        for (int i = 0; i < name.size(); i++) {

            if (name.get(i).length() > 6 && name.get(i).length() < 8) {
                longName.add(name.get(i));
            }
        }

//        longName = name.stream().filter(n-> n.length()>6 && n.length()<8).collect(Collectors.toList());
        System.out.println(longName);


    }
}
