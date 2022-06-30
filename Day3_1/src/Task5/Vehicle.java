package Task5;

public abstract class Vehicle {
    private double speed = 0;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void increaseSpeed(double amount);
    public abstract void decreaseSpeed(double amount);
    public abstract void handling();
}
