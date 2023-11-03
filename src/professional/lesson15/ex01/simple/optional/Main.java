package professional.lesson15.ex01.simple.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
        Optional<Integer> opt2 = Optional.of(10);
        Optional<Integer> opt3 = Optional.ofNullable(null);

        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);
        System.out.println();

        String str;

        if (getString().isPresent()) {
            str = getString().orElseGet(String::new);
            System.out.println(str);
        }

        str = getString().orElseThrow(null);
        Stream.of(str).forEach(System.out::println);
    }

    public static Optional<String>getString() {
        return Optional.of("Simple value");
    }
}
