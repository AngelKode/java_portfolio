package lambda_functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String, String> firstFunction = param -> "Hello " + param;
        String result = firstFunction.apply("Roman");
        System.out.println(result);


        Function<String, String> secondFunction = String::toUpperCase;
        System.out.println(secondFunction.apply("Roman"));

        BiFunction<Integer, Integer, String> operateString = (a,b) -> {
            return (a+b) + "";
        };

        BiFunction<String, String, String> concatReference = String::concat;

        System.out.println(operateString.apply(1, 2));
        System.out.println(concatReference.apply("Roman", "Roman"));
    }
}
