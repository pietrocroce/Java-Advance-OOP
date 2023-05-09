public class Circle extends Shape {
    public Circle(double height, double width) {
        super(height, width);
    }
    public double calculateareaCircle(){
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }

}
/*Mi sarebbe piaciuto più cosi ma per il bonus si accetta anche questo
public class Circle extends Shape {
    final private double pigreco = 3.14;
    private double raggio;
    public Circle(double pigreco, double raggio){
    super(pigreco, raggio)
    }
    }
    public double calculateareaCircle(){
        return pigreco * (raggio * raggio);
    }

}
 */
