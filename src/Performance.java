import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Performance {

    private static final int LOOP_COUNT = 10000000;

    public static void main(String[] args) {
        calculate(Performance::forLoop);
        calculate(Performance::lambda);
        calculate(Performance::lambdaParallel);
    }

    private static void calculate(UnaryOperator<List<Integer>> operator) {
        long startTime = System.currentTimeMillis();
        operator.apply(createList());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private static List<Integer> forLoop(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            result.add(i * i);
        }
        return result;
    }

    private static List<Integer> lambda(List<Integer> list) {
        return list.stream().map(i -> i + 1).collect(Collectors.toList());
    }

    private static List<Integer> lambdaParallel(List<Integer> list) {
        return list.parallelStream().map(i -> i + 1).collect(Collectors.toList());
    }

    private static List<Integer> createList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < LOOP_COUNT; i++) {
            list.add(random.nextInt(10000));
        }
        return list;
    }
}
