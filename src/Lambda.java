import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("getOdds");
        for (Integer number : getOddSquare(numbers)) {
            System.out.println(number);
        }

        System.out.println("getOddSquareLambda");
        getOddSquareLambda(numbers).stream().forEach(System.out::println);

        System.out.println("getOddSquareStream");
        getOddSquareStream(numbers).forEach(System.out::println);
    }

    private static List<Integer> getOddSquare(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                result.add(number * number);
            }
        }
        return result;
    }

    private static List<Integer> getOddSquareLambda(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number)
                .collect(Collectors.toList());
    }

    private static Stream<Integer> getOddSquareStream(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number);
    }
}
