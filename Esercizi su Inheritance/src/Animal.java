
public class Animal {
    private double height, weight;
    private String name;

    public Animal(String name, double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
