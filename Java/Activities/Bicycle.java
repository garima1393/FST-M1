package activities;

import static activities.BicycleParts.gears;

public class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int CurrentSpeed;
    @Override
    public void applyBrake(int decrement) {
        CurrentSpeed = CurrentSpeed-decrement;
        System.out.println("Current actual speed: " + CurrentSpeed);
    }

    @Override
    public void speedUp(int increment) {
        CurrentSpeed = CurrentSpeed+increment;
        System.out.println("Current actual speed: " + CurrentSpeed);

    }
    public Bicycle(int gears,int maxspeed)
    {
        this.gears = gears;
        this.CurrentSpeed = CurrentSpeed;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + CurrentSpeed);
    }
}
