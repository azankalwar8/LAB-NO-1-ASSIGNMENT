public class Car {

    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;

    public Car() {
        this.brand = "Unspecified";
        this.color = "Silver";
        this.speed = 0;
        this.engineOn = false;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
        System.out.println("Details updated -> Brand: " + this.brand + ", Color: " + this.color);
    }

    public void startEngine() {
        if (!this.engineOn) {
            this.engineOn = true;
            System.out.println("The engine is now started.");
        } else {
            System.out.println("The engine is already running.");
        }
    }

    public void stopEngine() {
        if (this.engineOn) {
            this.engineOn = false;
            this.speed = 0;
            System.out.println("The engine is now stopped.");
        } else {
            System.out.println("The engine is already off.");
        }
    }

    public void displayState() {
        System.out.println("---- Car State ----");
        System.out.println("Brand     : " + this.brand);
        System.out.println("Color     : " + this.color);
        System.out.println("Speed     : " + this.speed);
        System.out.println("Engine On : " + this.engineOn);
        System.out.println("--------------------");
    }
}