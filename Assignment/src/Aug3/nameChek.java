package Aug3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class nameChek {

    public void namecheck(List<String> names, Predicate<String> checkcondition) {
        for (String name : names) {
            if (checkcondition.test(name)) {
                System.out.println("Name is approved");
            } else {
                System.out.println("Length of name is less than 4");
            }
        }
    }
}
