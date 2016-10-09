package feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parallel {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("getOdds");
        for (Integer number : getOdds(numbers)) {
            System.out.println(number);
        }

        System.out.println("getOddsLambda");
        getOddsLambda(numbers).stream().parallel().sequential().forEach(System.out::println);
    }

    private static List<Integer> getOdds(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                result.add(number);
            }
        }
        return result;
    }

    private static List<Integer> getOddsLambda(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 1).collect(Collectors.toList());
    }
}
