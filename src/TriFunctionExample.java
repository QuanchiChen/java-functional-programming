/**
 * A TriFunction example
 */

import java.util.function.Function;

public class TriFunctionExample {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a + b + c;
        Function<Integer, String> square = String::valueOf;
        System.out.println(sum.andThen(square).apply(1, 2, 3));
    }
}
