package LamdaExpression;

import java.util.function.Function;

/**
 * Function chaining
 * ------------
 * andThen() = 1st call f1 2nd call f2
 * 2*2 =4 f1 call and pass value 2
 * 4*4*4 =64 f2 call and pass value 4
 *------------------------------------
 * compose() = 1st call f2 2nd call f1
 * 2*2*2 = 8 f2 call and pass value 2
 * 8*2 = 16 f1 call and pass value 8
 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = n->n*2; // andThen() = 2*2 =4
        Function<Integer,Integer> f2 = n->n*n*n; // andThen() = 4*4*4 =64


        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}
