package LamdaExpression;

import java.util.function.Predicate;

public class predicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(20));
    }
}

