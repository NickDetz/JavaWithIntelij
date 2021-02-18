import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class streamsinjava {

    public static void main(String[] args) {
        System.out.println("Steams in java");

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());


        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

    }

}
