/**
 * https://stackoverflow.com/questions/56421502/java-8-how-bifunction-works-while-using-andthen-and-apply-methods
 */

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> x + y;
        Function<String, String> f = x -> x + " spinner";
        System.out.println(bi.andThen(f).apply("hello", "world"));
    }
}
