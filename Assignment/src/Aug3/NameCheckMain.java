package Aug3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NameCheckMain {

    public static void main(String[] args) {

        Predicate<String> checkSize = name -> name.length()>=4;

        List<String> names = new ArrayList<>(Arrays.asList("Ankush","Bavneet","Divyesh","Navjot","Pranshi","ABC"));

        nameChek nameChek = new nameChek();

        nameChek.namecheck(names, name -> name.length()>=4);

    }
}
