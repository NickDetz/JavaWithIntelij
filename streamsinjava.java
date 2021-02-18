import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamsinjava {

    public static void main(String[] args) throws IOException {
        System.out.println("Steams in java");
        // example
       // List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
       // List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());


        Random random = new Random();
        //random.ints().limit(10).forEach(System.out::println);

       // List<String>strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
       // List<String> filtered1 = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        //System.out.println("Filtered List: " + filtered1);
        //String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        //System.out.println("Merged String: " + mergedString);

        // starts finds all of them with and makes it so that it will find "A" case sensitive
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)	// same as Stream.of(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);
        //Int Stream
        //goes to 1-30 and stops AT 31 so that means 31 is not included might
        //want to use this for a ghetto paunch
        IntStream
                .range(1, 31)
                .forEach(System.out::print);
        System.out.println();

        // Int Stream with skip
        //Skips the first 5 elements in here so
        //not at a specific point but 1-5 so it starts at 6
        IntStream
                .range(1, 20)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        //Double Stream will not have a range that they can
//        DoubleStream
//                .range(1,20)
//                .forEach(d-> System.out.println(d));

        // Int Stream with sum
        // still has the exlcusive so 5 is not included on the sum
        System.out.println(
                IntStream
                        .range(1,6)
                        .sum());
        System.out.println();

        // 4. Stream sorted then findFirst <T> findAny() with optional things
        Stream.of("B", "A", "C")
                .sorted() // when sorted A is first since it's alphabetical order
                .findFirst() // Gets the first of the sorted or of the non sorted list
                .ifPresent(System.out::println);

        // 5. Stream from Array, sort, filter and print
        String[] names1 = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names1)	// same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

    }

}
