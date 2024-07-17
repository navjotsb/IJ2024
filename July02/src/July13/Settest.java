package July13;


    import java.util.*;

public class Settest {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
         //   List.of(10,20,30);   can be used with java 9
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(223);
            list.add(453);
            list.add(254);
            list.add(5423);
            list.add(34);
            list.add(23);
            list.add(54);
            list.add(54);
            list.add(32);
            list.add(54312);
            list.add(453);
            list.add(43);

            Set<Integer> set = new HashSet<>(list);
            set.add(13);
            System.out.println("set " + set);

            Set<Integer> treeSet = new TreeSet<>(set);
            System.out.println("treeSet " + treeSet);

            treeSet.remove(13);

            Set<Integer> treeSet1 = new TreeSet<>(set);
            treeSet1.remove(13);

            boolean equals1 = treeSet.contains(10);
            boolean equals2 = treeSet.containsAll(Arrays.asList(10,43));

            boolean equals = treeSet.equals(treeSet1);

            System.out.println("TreeSet: " + treeSet + " contains 10: " + equals + equals1 + equals2);
            Set<Integer> treeSet2 = treeSet;
            System.out.println("clear: " + treeSet2);
            treeSet2.clear();
            System.out.println("clear done: " + treeSet2);
            boolean b = treeSet.addAll(Arrays.asList(10, 20, 30));
            System.out.println("Add elements result: " + b + " treeSet: " + treeSet);
        }
    }

