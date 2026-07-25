public class Main {
    public static void main(String[] args) {

        Car nissan = new Car();
        Car mazda = new Car();

        nissan.setDetails("Nissan GT-R", "Pearl White");
        mazda.setDetails("Mazda RX-7", "Sunburst Yellow");

        nissan.drive();

        nissan.startEngine();
        mazda.startEngine();

        nissan.drive();
        nissan.moveFast();
        nissan.moveLeft();
        nissan.horn();

        mazda.drive();
        mazda.moveRight();

        nissan.displayState();
        mazda.displayState();

        nissan.moveSlow();
        nissan.stopEngine();
        nissan.displayState();

        mazda.displayState();
    }
}