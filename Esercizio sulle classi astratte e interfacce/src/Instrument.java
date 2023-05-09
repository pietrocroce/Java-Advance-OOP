public class Instrument implements Playable{
     private String name;
     private String brand;
    @Override
    public String play() {
        return "suona una meraviglia";
    }

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
