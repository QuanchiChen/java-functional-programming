/**
 * A real-world function chaining example
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class FileReaderPipeline {
    private static final Function<String, String> trim = String::trim; // Method reference
    private static final Function<String, String> toUpperCase = String::toUpperCase; // Method reference
    private static final Function<String, String> replaceSpecialCharacters = str -> str.replaceAll("[^\\p{Alpha}]+", ""); // Lambda expression
    private static final Function<String, String> pipeline = trim.andThen(toUpperCase).andThen(replaceSpecialCharacters);

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String result = pipeline.apply(line);
                System.out.println(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
