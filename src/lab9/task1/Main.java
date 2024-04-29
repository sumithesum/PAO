package lab9.task1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SortedListSet<Integer> sortedListSet = new SortedListSet<>();
        sortedListSet.add(1);
        sortedListSet.add(2);
        sortedListSet.add(3);
        sortedListSet.add(4);
        sortedListSet.add(5);
        sortedListSet.add(6);
        sortedListSet.add(7);
        sortedListSet.add(8);
        sortedListSet.add(9);
        sortedListSet.add(10);
        sortedListSet.add(8);
        System.out.println(sortedListSet);
        System.out.println(sortedListSet.first());
        System.out.println(sortedListSet.last());
        System.out.println(sortedListSet.subSet(3, 7));
        System.out.println(sortedListSet.headSet(5));
        System.out.println(sortedListSet.tailSet(5));
        System.out.println(sortedListSet.reversed());

        System.out.println();
        System.out.println();
        System.out.println();

        Comparator<Integer> comparator = Comparator.reverseOrder();

        SortedListSet<Integer> sortedListSet2 = new SortedListSet<>(comparator);
        sortedListSet2.add(1);
        sortedListSet2.add(2);
        sortedListSet2.add(3);
        sortedListSet2.add(4);
        sortedListSet2.add(5);
        System.out.println(sortedListSet2);
        System.out.println(sortedListSet2.first());
        System.out.println(sortedListSet2.last());
        System.out.println(sortedListSet2.subSet(1, 3));
        System.out.println(sortedListSet2.headSet(3));
        System.out.println(sortedListSet2.tailSet(3));
        System.out.println(sortedListSet2.reversed());


    }
}
