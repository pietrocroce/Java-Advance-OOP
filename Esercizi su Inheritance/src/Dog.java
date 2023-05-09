public class Dog extends Animal{
    private String breed;

    public Dog(String name, double height, double weight, String breed) {

        super(name, height, weight);
        this.breed = breed;
    }
    public double runSpeedMetersPerSecond(){
        return getHeight() * 2;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
