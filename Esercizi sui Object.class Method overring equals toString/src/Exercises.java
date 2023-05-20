
public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person pietro = new Person("Pietro",32,"Via castanito,41");
        Person angie = new Person("Storm",26,"Via Delle Condoglianze,57");
        Person peppiiiino = new Person("Giggino",27,"Via World of warcraft,3");
        System.out.println(pietro);
        System.out.println(angie);
        System.out.println(peppiiiino);
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person pietro = new Person("Pietro",32,"Via castanito,41");
        Person angie = new Person("Storm",26,"Via Delle Condoglianze,57");
        Person peppiiiino = new Person("Giggino",27,"Via World of warcraft,3");
        System.out.println(pietro.hashCode());
        System.out.println(angie.hashCode());
        System.out.println(peppiiiino.hashCode());
        pietro.prova(pietro.getAge());
    }
        //1631
    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}

