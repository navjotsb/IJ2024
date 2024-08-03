package Aug3;

import java.util.function.Predicate;

public class MathMain {
    public static void mathcheck(int a, Predicate<Integer> check )
    {
        if(check.test(a))
        {
            System.out.println("No is Even");
        }
        else
        {
            System.out.println("No is odd");
        }
    }
}
