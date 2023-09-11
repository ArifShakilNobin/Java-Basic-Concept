package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class FilterDemo4 {
    public static void main(String[] args) {

        List<Product> produoctList = new ArrayList<>();

        produoctList.add(new Product(1,"potato",100));
        produoctList.add(new Product(2,"potato1",500));
        produoctList.add(new Product(3,"potato2",200));
        produoctList.add(new Product(4,"potato3",300));
        produoctList.add(new Product(5,"potato4",400));

        produoctList.stream()
                .filter(e->e.price<500)
                .forEach(pr-> System.out.println(pr.name +" " +pr.price));

    }
}
