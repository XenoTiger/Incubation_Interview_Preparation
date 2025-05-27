package creational.factory;

public class FactoryExample {
    public static void main(String[] args) {

        Shape circleObj = ShapeFactory.getShape("Circle");
        circleObj.computeArea();
    }
}
