public class  calculatorMain {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Using inputs: 12.5 and 2.5
        System.out.println("Add: " + calc.add(12.5, 2.5));          // Output: 15.0
        System.out.println("Subtract: " + calc.subtract(12.5, 2.5)); // Output: 10.0
        System.out.println("Multiply: " + calc.multiply(12.5, 2.5)); // Output: 31.25
        System.out.println("Divide: " + calc.divide(12.5, 2.5));     // Output: 5.0

        // Edge case: divide by zero using input 25
        System.out.println("Divide by zero test: " + calc.divide(25, 0));
    }
}