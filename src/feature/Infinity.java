package feature;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Infinity {

    public static void main(String[] args) {
        System.out.println("natural");
        Stream<Integer> natural = Stream.generate(new NaturalSupplier());
        natural.map(x -> x * x).limit(10).forEach(System.out::println);

        System.out.println("\nfibonacci");
        Stream<Integer> fibonacci = Stream.generate(new FibonacciSupplier());
        fibonacci.skip(1).limit(10).forEach(System.out::println);

        System.out.println("\nrandom");
        Stream<Integer> random = Stream.generate(new Random()::nextInt);
        random.limit(10).forEach(System.out::println);
    }
}

class NaturalSupplier implements Supplier<Integer> {
    int value = 0;

    public Integer get() {
        this.value = this.value + 1;
        return this.value;
    }
}

class FibonacciSupplier implements Supplier<Integer> {
    int a = 0;
    int b = 1;

    @Override
    public Integer get() {
        int x = a + b;
        a = b;
        b = x;
        return a;
    }
}