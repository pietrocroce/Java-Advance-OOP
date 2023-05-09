import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog Suri = new Dog("Suri",120, 40, "Labrador");
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish Nemo = new Fish("Nemo",2, 0.8, "Pesce pagliaccio");
        Bird passero = new Bird("passero",5, 0.5, 0.5);
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog corriJack = new Dog("Corrijack", 0.9, 12, "levriero");
        Fish Nemo = new Fish("NEmo", 2, 0.8, "Pesce pagliaccio");
        Bird passero = new Bird("Passero",5, 0.5, 0.5);
        Map<Animal,Double> imieianimali = new HashMap<>();
        imieianimali.put(corriJack, corriJack.runSpeedMetersPerSecond());
        imieianimali.put(Nemo, Nemo.swimSpeedMetersPerSecond());
        imieianimali.put(passero, passero.flySpeedMetersPerSecond());

        Animal animale = null;
        double theFastest = 0;
        for (Map.Entry<Animal,Double> mappina : imieianimali.entrySet()) {
            if (mappina.getValue() > theFastest) {
                theFastest = mappina.getValue();
                animale = mappina.getKey();
            }
        }
        System.out.println(animale.getName());
    }
}