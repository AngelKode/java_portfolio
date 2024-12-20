package lambda_functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> testLimit = number -> number < 10;

        System.out.println(testLimit.test(25));

        BiPredicate<String, String> testContent = String::equalsIgnoreCase;
        System.out.println(testContent.test("abc", "def"));
    }
}
