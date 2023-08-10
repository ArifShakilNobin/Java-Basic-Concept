package LamdaExpression;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        int[] a = {5, 12, 20, 15, 68, 19, 45, 36, 75, 25, 100};


        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i > 50;

        for (int n : a) {
            if (p1.and(p2).test(n)) {
                System.out.println(n);
            }
        }
        System.out.println("-----------------------");
        for (int n : a) {
            if (p1.or(p2).test(n)) {
                System.out.println(n);
            }
        }
    }
}
