/**
 * Function chaining/composing examples
 */

import java.util.function.Function;
import java.util.logging.Logger;

public class FunctionChainingExample {
    private static final Logger logger = Logger.getLogger(FunctionChainingExample.class.getName());
    private static final Function<Integer, Integer> multiply = x -> x * 2;
    private static final Function<Integer, Integer> add = x -> x + 2;
    private static final Function<Integer, Integer> logOutput = x -> {
        logger.info("Data: " + x);
        return x;
    };

    public static Integer execute(Integer input) {
        Function<Integer, Integer> pipeline = multiply.andThen(add).andThen(logOutput); // Left-to-right order
        return pipeline.apply(input);
    }

    public static Integer compose(Integer input) {
        Function<Integer, Integer> pipeline = logOutput.compose(add).compose(multiply); // Right-to-left order
        return pipeline.apply(input);
    }

    public static void main(String[] args) {
        System.out.println(execute(10));
        System.out.println(compose(10));
    }
}
