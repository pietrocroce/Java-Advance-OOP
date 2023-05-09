public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }
    public double calculateAreaRectangle(){
        return getWidth()*getHeight();
    }
}
