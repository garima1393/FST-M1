package activities;

class MountainBike extends Bicycle   {
    public int seatHeight;
    public MountainBike(int gears, int CurrentSpeed, int startHeight) {
        super(gears, CurrentSpeed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}
