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
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return first / second;
    }
}