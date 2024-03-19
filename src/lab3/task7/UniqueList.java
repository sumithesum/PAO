package lab3.task7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class UniqueList<T> implements List<T> {

    private final List<T> storage;

    public UniqueList() {
        storage = new ArrayList<>();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    @Override
    public int size() {
        int size = 0;
        for (var element : storage)
            size++;
        return size;
    }

    @Override
    public boolean isEmpty() {

        if (this.size() == 0)
            return true;
        return false;

    }

    @Override
    public boolean contains(Object o) {
        for (var element : storage)
            if (element == o)
                return true;
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }

    @Override
    public Object[] toArray() {
        List<T> aux = storage;
        return aux.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return storage.toArray(a);
    }

    @Override
    public boolean add(T t) {
        if (contains(t))
            return false;
        storage.add(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            storage.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (var element : c)
            if (contains(element) == false)
                return false;
        return true;

    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean ok = false;
        for (var element : c)
            if (add(element))
                ok = true;
        return ok;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        List<T> copie = new ArrayList<>(c);
        copie.removeAll(storage);

        return storage.addAll(index, copie);
    }

    @Override
    public boolean removeAll(Collection<?> c) {

        return storage.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {

        return storage.retainAll(c);
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public T get(int index) {
        return storage.get(index);
    }

    @Override
    public T set(int index, T element) {

        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Out of bounds " + index);
        }
        if (!contains(element) || indexOf(element) == index){
            return storage.set(index,element);
        }
        else
            throw new IllegalArgumentException("Duplicate " + element);
    }

    @Override
    public void add(int index, T element) {
        if (!storage.contains(element)) {
            storage.add(index, element);
        } else {
            throw new IllegalArgumentException("Duplicate " + element);
        }
    }

    @Override
    public T remove(int index) {
        return storage.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return storage.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
       return storage.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return storage.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return storage.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return storage.subList(fromIndex,toIndex);
    }
}
