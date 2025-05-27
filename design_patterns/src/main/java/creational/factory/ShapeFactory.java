package creational.factory;

public class ShapeFactory {

    public static Shape getShape(String value) {
        if (value.equals("Square")) {
            return new Square();
        } else if (value.equals("Rectangle")) {
            return new Rectangle();
        } else if (value.equals("Circle")) {
            return new Circle();
        }
        return null;
    }
}
