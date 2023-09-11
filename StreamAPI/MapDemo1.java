package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("abulsdasdad", "ballbul", "cabul", "dabul11");
        List<String> upperCase = name.stream().map(n ->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);

        List<Product> produoctList = new ArrayList<>();



        produoctList.add(new Product(1,"potato",100));
        produoctList.add(new Product(2,"potato1",500));
        produoctList.add(new Product(3,"potato2",200));
        produoctList.add(new Product(4,"potato3",300));
        produoctList.add(new Product(5,"potato4",400));

        List<Double> filter = produoctList.stream().filter(product -> product.price>100).map(n->n.price*3).collect(Collectors.toList());

        System.out.println(filter);

    }
}
