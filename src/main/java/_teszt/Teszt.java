package _teszt;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teszt {
    Map<String, String> map = new HashMap<>();
    Collection<String> collection;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teszt)) return false;
        Teszt teszt = (Teszt) o;
        return Objects.equals(map, teszt.map) && Objects.equals(collection, teszt.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, collection);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(Integer.valueOf(5));
        Object object = list;
        System.out.println(object instanceof String);
        System.out.println(object instanceof List);

        System.out.println((String) list.get(0).toString());
        String str = null;
        //str.equals("Text");
        System.out.println("Text".equals(str));

        /*List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,8);
        for (int i: listInteger){
            if (i % 2 == 0) {
                listInteger.remove(Integer.valueOf(i));
            }
        }*/ // UnsupportedOperationException

        /*List<Integer> listInteger = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i: listInteger){
            if (i % 2 == 0) {
                listInteger.remove(Integer.valueOf(i));
            }
        }*/  //ConcurrentModificationException

        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> i = listInteger.iterator();
        while (i.hasNext()) {
            int j = i.next();
            if (j % 2 == 0) {
                i.remove();
            }
            System.out.println(j);
        }
        System.out.println(listInteger.toString());


        //Stream
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3, 5);

        List<String> listStream = Arrays.asList("a", "b", "c");
        Stream<String> fromList = listStream.stream();
        Stream<String> fromListParallel = listStream.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        System.out.println(fromList.count());

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        //System.out.println(infinite.findAny());
        infinite.findAny().ifPresent(System.out::println); // chimp

        Stream<String> stream = Stream.of("w", "o", "l", "f", "p");
        Set<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set);

        Stream<String> animals = Stream.of("duck", "duck", "horse", "duck", "horse");
        animals.distinct().forEach(System.out::print);

        Stream<String> wild = Stream.of("monkey", "gorilla", "bonobo");
        wild.map(String::length).forEach(System.out::print);

        IntStream integers = IntStream.range(1, 6);
        IntSummaryStatistics stats = integers.summaryStatistics();
        System.out.println();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
        System.out.println(stats.getClass());

        Stream<String> ohMyAnimals = Stream.of("lions", "tigers", "bears");
        Double result = ohMyAnimals.collect(Collectors.averagingInt(String::length));
        System.out.println(result);

        Stream<String> ohMyAnimalMap = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> myAnimalMap = ohMyAnimalMap.collect(Collectors.toMap(
                String::length,
                v -> v,
                (v1, v2) -> v1 + ", " + v2,
                TreeMap::new
        ));
        System.out.println(myAnimalMap);
        System.out.println(myAnimalMap.getClass());

        Stream<String> ohMyAnimalGroup = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> myAnimalGroup = ohMyAnimalGroup.collect(Collectors.groupingBy(
                String::length
        ));
        System.out.println(ohMyAnimalGroup);
        System.out.println(myAnimalGroup.getClass());

    }
}