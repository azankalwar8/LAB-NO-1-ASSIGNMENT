public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Using new input values: 12.5 and 4.0
        System.out.println("Add: " + calc.add(12.5, 4.0));
        System.out.println("Subtract: " + calc.subtract(12.5, 4.0));
        System.out.println("Multiply: " + calc.multiply(12.5, 4.0));

        // Division examples
        System.out.println("Divide: " + calc.divide(20.0, 4.0));
    
        try {
            System.out.println("Divide by zero: " + calc.divide(12.5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error: " + e.getMessage());
        }

        // Power examples using base 4, exponent 3
        System.out.println("Power: " + calc.power(4, 3));
        System.out.println("Power edge (exp 0): " + calc.power(8.5, 0));

        // Modulus examples using 17 and 5
        System.out.println("Modulus: " + calc.modulus(17, 5));
        try {
            System.out.println("Modulus by zero: " + calc.modulus(17, 0));
        } catch (ArithmeticException e) {
            System.out.println("Modulus error: " + e.getMessage());
        }
    }
}