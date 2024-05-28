package lab12.task1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;

public class Utility {

    public static <T> void printCollection(Collection<T> collection) {
        collection.forEach(System.out::println);
    }

    public static <T, R> R aggregate(Collection<T> collection, R initial, BiFunction<R, T, R> accumulator) {
        R result = initial;
        for (T element : collection) {
            result = accumulator.apply(result, element);
        }
        return result;
    }

    public static <T> List<T> duplicateCollection(List<T> list) {
        List<T> duplicatedList = new ArrayList<>();
        for (T element : list) {
            duplicatedList.add(element);
            duplicatedList.add(element);
        }
        return duplicatedList;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Utility.printCollection(integers);

        Collection<String> strings = List.of("ana", "are", "mere");
        Utility.printCollection(strings);

        List<Boolean> booleans = List.of(true, false, true, false, true);
        boolean result = Utility.aggregate(booleans, true, (acc, v) -> acc & v);
        System.out.println(result);

        int count = Utility.aggregate(booleans, 0, (acc, v) -> v ? acc + 1 : acc);
        System.out.println(count);

        List<Person> persons = List.of(new Person("Aurel"), new Person("Vali"));
        List<Person> duplicatedPersons = Utility.duplicateCollection(persons);
        Utility.printCollection(duplicatedPersons);
    }
}