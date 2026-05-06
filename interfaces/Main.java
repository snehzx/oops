package interfaces;

public class Main {
    public static void main(String[] args) {
    //     Car car = new Car();
    //    // Engine car = new Car();
    //     //car.price; - engine gives what things u can access and Car gives which one of those versions to access
    //     car.acc();
    //     car.start();
    //     car.brake();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
