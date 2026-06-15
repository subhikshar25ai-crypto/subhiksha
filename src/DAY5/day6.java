class Car {
    String color;
    String brand;
    int speed;
    int fuel;

    public Car(String brand, String color, int fuel) {
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
        this.speed = 0;
    }

    public void accelerate() {
        if (fuel > 0) {
            speed += 10;
            fuel -= 5;
            System.out.println(brand + " accelerated. Speed: " + speed + " km/h | Fuel: " + fuel + "%");
        }
    }

    public void decelerate() {
        if (speed > 0) {
            speed -= 10;
            System.out.println(brand + " slowed down. Speed: " + speed + " km/h");
        }
    }

    public void refill() {
        fuel += 20;
        System.out.println(brand + " refueled. Current Fuel: " + fuel + "%");
    }

    public void showFuel() {
        System.out.println("Fuel Status for " + color + " " + brand + ": " + fuel + "%");
    }
}

class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Red", 30);

        myCar.showFuel();
        myCar.accelerate();
        myCar.accelerate();
        myCar.decelerate();
        myCar.refill();
        myCar.showFuel();
    }
}
