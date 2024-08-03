package Aug3;

import java.util.function.Predicate;

public class EvenCheckerMain {

    public static void main(String[] args) {
        Predicate<Integer> check = a -> a%2==0;

        boolean isEven = check.test(57);
        System.out.println(isEven);
        MathMain.mathcheck(34, a -> a%2==0 );
    }
}
