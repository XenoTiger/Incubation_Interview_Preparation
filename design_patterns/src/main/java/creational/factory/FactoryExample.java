package creational.factory;

public class FactoryExample {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleObj = shapeFactory.getShape("Circle");
        circleObj.computeArea();
    }
}
