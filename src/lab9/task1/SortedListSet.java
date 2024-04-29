package lab9.task1;

import java.util.*;

public class SortedListSet<T extends Comparable<T>> extends LinkedList<T> implements SortedSet<T> {
    private Comparator<? super T> comparator;

    @Override
    public SortedListSet<T> reversed() {
        Collections.reverse(this);
        return this;
    }

    public SortedListSet() {
        this.comparator = null;
    }

    public SortedListSet(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public Comparator<? super T> comparator() {
        return comparator;
    }

    public Comparator getComparator() {
        return this.comparator;
    }

    @Override
    public boolean add(T o) {
        if (!this.contains(o)) {
            super.add(o);
            this.sort(comparator);
            return true;
        }
        return false;
    }

    @Override
    public T first() {
        return this.get(0);
    }

    @Override
    public T last() {
        return this.get(this.size() - 1);
    }


    @Override
    public SortedSet<T> subSet(T from, T to) {
        int fromIndex = this.indexOf(from);
        int toIndex = this.indexOf(to);
        this.sort(comparator);
        if (fromIndex > toIndex) {
            int aux = fromIndex;
            fromIndex = toIndex;
            toIndex = aux;
        }
        return new TreeSet<>(this.subList(fromIndex, toIndex));
    }

    @Override
    public SortedSet<T> headSet(T to) {
        return new TreeSet<>(this.subList(0, this.indexOf(to)));
    }

    @Override
    public SortedSet<T> tailSet(T from) {
        return new TreeSet<>(this.subList(this.indexOf(from), this.size()));
    }
}