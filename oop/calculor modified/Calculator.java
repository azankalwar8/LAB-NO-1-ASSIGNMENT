public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return first / second;
    }



    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double modulus(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot compute modulus with zero divisor.");
        }
        return first % second;
    }
}