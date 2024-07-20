package July16;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(5);
        set.add(13);
        set.add(10);
        set.add(27);
        set.add(null);
        set.add(null);


        System.out.println("HashSet output: " + set);
        System.out.println("HashSet Output has no order with no duplicates and just 1 null allowed");

        TreeSet<Integer> set1 = new TreeSet<>();


        set1.add(10);
        set1.add(5);
        set1.add(13);
        set1.add(10);
        set1.add(27);



        System.out.println("TreeSet output: " + set1);
        System.out.println("TreeSet Output is sorted with no duplicates and null is not allowed");

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(5);
        set2.add(13);
        set2.add(10);
        set2.add(27);
        set2.add(null);
        set2.add(null);


        System.out.println("LinkedHashSet output: " + set2);
        System.out.println("LinkedHashSet Output is in INSERTION ORDER as it is entered with no duplicates and 1 null is allowed");




    }
}
