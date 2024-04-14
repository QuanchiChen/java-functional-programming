/**
 * A Java currying example
 */

import java.util.function.Function;

public class CurryExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> sumWithThreeParams = (a) -> (b) -> (c) -> a + b + c;
        Function<Integer, Function<Integer, Integer>> partialSumWithTwoParams = sumWithThreeParams.apply(5);
        Function<Integer, Integer> partialSumWithOneParams = partialSumWithTwoParams.apply(10);
        System.out.println(partialSumWithOneParams.apply(15));
    }
}
