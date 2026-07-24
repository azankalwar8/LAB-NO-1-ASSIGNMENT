public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        // Initial default state
        myCar.displayState();

        // Updated values: Porsche, Midnight Blue
        myCar.setDetails("Porsche", "Midnight Blue");

        myCar.startEngine();

        myCar.displayState();

        myCar.stopEngine();

        myCar.displayState();
    }
}