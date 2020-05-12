package exercises.technology;

public class SmartPhone extends Computer{
    private int batteryPercent;
    public SmartPhone(String make, String model, int modelYear, int batteryPercent) {
        super(make, model, modelYear);
        this.batteryPercent = batteryPercent;
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }

    public void usePhone() {
        this.batteryPercent -= 5;
    }
}
