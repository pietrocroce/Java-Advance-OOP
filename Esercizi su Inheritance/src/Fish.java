public class Fish extends Animal{
    private String species;

    public Fish(String name, double height, double weight, String species) {
        super(name, height, weight);
        this.species = species;
    }
    public double swimSpeedMetersPerSecond(){
        return getWeight()*2;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
