package Task5;

public class Car extends Vehicle{

    private int gear = 0;
    private final int GEAR_LIMIT;
    private final double MAX_SPEED;
    private final double MAX_REVERSE_SPEED;

    public Car(double speedlimit, double reverseSpeed, int gearlimit) {
        GEAR_LIMIT = gearlimit;
        MAX_SPEED = speedlimit;
        MAX_REVERSE_SPEED = reverseSpeed;
    }

    public Car(){
        GEAR_LIMIT = 5;
        MAX_REVERSE_SPEED = -30;
        MAX_SPEED = 200;
    }

    public void increaseSpeed(double amount){
        if ((amount <= 0 && gear == -1) || (amount >= 0) && gear > 0)
        {
            double gearSpeed;
            switch (gear){
                case -1: gearSpeed = MAX_REVERSE_SPEED;
                    break;
                case 5: gearSpeed = MAX_SPEED;
                    break;
                default: gearSpeed = gear * 20;
            }
            if (gear == -1){
                if ((amount + getSpeed()) <= MAX_REVERSE_SPEED){
                    setSpeed(amount);
                }else setSpeed(gearSpeed);
            }
            if ((amount + getSpeed()) <= gearSpeed)
            {
                setSpeed(amount);
            }
            else{
                setSpeed(gearSpeed);
                System.out.println("Change gear to increase speed further. Speed: "+gearSpeed);
            }
        }else System.out.println("Speed can't be changed.");
    }

    public void decreaseSpeed(double amount){
        if (getSpeed() > 0)
        {
            if (getSpeed() - amount > 0){
                setSpeed(getSpeed() - amount);
            } else setSpeed(0);
        }
        else {
            if (amount - getSpeed() <= 0)
            {
                setSpeed(amount - getSpeed());
            }
            else setSpeed(0);
        }
        System.out.println("Recommended gear: " + Math.ceil((1 + getSpeed())/15));
    }

    public void handling()
    {
        if (gear == 0) System.out.println("Vehicle does not move");
        else if (gear < 3) System.out.println("Easy to handle.");
        else if (gear < GEAR_LIMIT) System.out.println("On small radius turns should " +
                "decrease speed for better handling");
        else System.out.println("Handling is bad, it is highly recommended to " +
                    "decrease speed on turns");
    }

    public void changeGear(int gear){
        if (gear <= GEAR_LIMIT && gear >= -1){
            if (gear == 0){
                this.gear = gear;
            }
            else if ((gear == -1 || gear == 1) && getSpeed() == 0){
                this.gear = gear;
            }
            else if (gear == GEAR_LIMIT && getSpeed() < MAX_SPEED && getSpeed() > (gear * 10)) {
                this.gear = gear;
            }
            else if (getSpeed() >= (gear * 10) && getSpeed() <= (gear * 20))
            {
                this.gear = gear;
            }else System.out.println("Impossible to change gear. " +
                    "Recommended gear: " + Math.ceil((1 + getSpeed())/15));
        }else System.out.println("Such gear does not exist");
    }
    public int getGear()
    {
        return gear;
    }
}
