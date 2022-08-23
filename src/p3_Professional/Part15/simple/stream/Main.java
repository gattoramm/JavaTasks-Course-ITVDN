package p3_Professional.Part15.simple.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(10, -20, 30, 40, 30)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 3, 3);

        String[] arr = {"A", "B", "C"};
        Stream<String> stream1 = Arrays.stream(arr);

        Stream<Object> build = Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .add(40)
                .build();

        IntStream chars = "Hello".chars();

        /*
            конвеер:
            map, filter, distinct, parallel, sequential, flatMap, skip, limit
            терминальные:
            forEach, collect, toList, toArray, min/max/sum/count, matcher(anyMatch, allMatch),
            findFirst, findAny, iterator
        */
    }
}
