package lambda_functions;

import lambda_functions.math.Arithmetic;

public class CalculatorMain {
    public static void main(String[] args) {
        Arithmetic add = Double::sum;

        CalculatorLambda myCalculator = new CalculatorLambda();

        System.out.println(myCalculator.calculate(4.23,12.42,add));
    }
}
