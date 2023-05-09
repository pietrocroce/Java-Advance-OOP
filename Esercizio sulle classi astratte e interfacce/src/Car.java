public class Car implements Movable{
    @Override
    public String moveForward() {
        return "Avanti";
    }

    @Override
    public String moveBackward() {
        return "Indietro";
    }
}
