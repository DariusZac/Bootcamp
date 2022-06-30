package Task5;

public class Cabriolet extends Car{
    public boolean isRoofDetached = false;

    public Cabriolet()
    {
        super();
    }
    public Cabriolet(double speedLimit, double reverseSpeed, int gearLimit){
        super(speedLimit, reverseSpeed, gearLimit);
    }

    public void detachRoof(){
        System.out.println("Roof is detached.");
        isRoofDetached = true;
    }
    public void attachRoof(){
        System.out.println("Roof if attached");
        isRoofDetached = false;
    }
}
