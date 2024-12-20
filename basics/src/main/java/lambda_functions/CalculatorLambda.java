package lambda_functions;

import lambda_functions.math.Arithmetic;

public class CalculatorLambda {
    public double calculate(double a, double b, Arithmetic arithmetic) {
        return arithmetic.operation(a, b);
    }
}
