public class Bird extends Animal{
    private double wingSpan;

    public Bird(String name, double height, double weight, double wingSpan) {
        super(name, height, weight);
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return getWingSpan() *4;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
