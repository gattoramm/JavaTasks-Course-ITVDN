package Part15.simple.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
        Optional<Integer> opt2 = Optional.of(10);
        Optional<Integer> opt3 = Optional.ofNullable(null);

        String str;

        if (getString().isPresent()) {
//            str = getString().get();
//            str = getString().orElseGet(String::new);
//            System.out.println(str);
        }

//        str = getString().orElse(null);
        str = getString().orElseThrow(null);
        Stream.of(str).forEach(System.out::println);
//        System.out.println(opt1);
//        System.out.println(opt2);
//        System.out.println(opt3);
    }

    public static Optional<String>getString() {
        if (true)
            return Optional.of("Simple value");
        return Optional.empty();
    }
}
