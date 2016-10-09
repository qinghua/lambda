import java.util.function.Function;

public class SyntacticSuger {

    public static void main(String[] args) {
        Function<Integer, Integer> add1 = (Integer a) -> {
            return a + 1;
        };


        Function<Integer, Integer> add2 = (Integer a) -> a + 1;

        Function<Integer, Integer> add3 = a -> a + 1;

        System.out.println(add1(1));
        System.out.println(add1.apply(1));
        System.out.println(add2.apply(1));
        System.out.println(add3.apply(1));
    }

    public static Integer add1(Integer a) {
        return a + 1;
    }
}
