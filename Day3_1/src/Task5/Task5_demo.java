package Task5;

public class Task5_demo {
    public static void main(String[] args) {
        Cabriolet car1 = new Cabriolet();
        car1.increaseSpeed(20);
        car1.changeGear(2);
        car1.changeGear(1);
        car1.increaseSpeed(30);
        car1.changeGear(2);
        System.out.println(car1.getGear());
        car1.increaseSpeed(200);
        car1.changeGear(4);
        System.out.println(car1.getGear());
        car1.increaseSpeed(-20);
        car1.decreaseSpeed(100);
        System.out.println(car1.getSpeed());
        car1.changeGear(-1);
        car1.increaseSpeed(-10);
        System.out.println(car1.getSpeed());
        car1.increaseSpeed(-30);
        System.out.println(car1.getSpeed());
        car1.increaseSpeed(100);
        car1.decreaseSpeed(100);
        System.out.println(car1.getSpeed());
        car1.increaseSpeed(20);
    }
}
