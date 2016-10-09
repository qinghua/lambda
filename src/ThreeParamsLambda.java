public class ThreeParamsLambda {
    public static void main(String[] args) {
        call(new ThreeParamsFunction<Integer, Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer param1, Integer param2, Integer param3) {
                return param1 + param2 + param3;
            }
        });

        call((param1, param2, param3) -> param1 + param2 + param3);
    }

    public static void call(ThreeParamsFunction<Integer, Integer, Integer, Integer> obj) {
        System.out.println(obj.apply(1, 2, 3));
    }
}

@FunctionalInterface
interface ThreeParamsFunction<T1, T2, T3, R> {
    R apply(T1 param1, T2 param2, T3 param3);
}
