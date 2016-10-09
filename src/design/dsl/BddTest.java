package design.dsl;

import java.util.function.Consumer;

public class BddTest {
    public static void main(String args[]) {
        new OrderSpec();
    }

    public static void describe(String description, Consumer<It> consumer) {
        consumer.accept(new It(description));
    }
}
