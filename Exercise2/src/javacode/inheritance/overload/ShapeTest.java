package javacode.inheritance.overload;

public class ShapeTest {
    public static void main(String[] args) {
        Shape undefined = new Shape();
        Shape circle = new Shape(2.0);
        Shape square = new Shape(4,5.0);
        Shape rectangle = new Shape(4,2.0,3.0);
        Shape triangle = new Shape(3, 3.0,4.0,5.0);

        String undefinedString = undefined.getShapeDetails();
        String circleString = circle.getShapeDetails();
        String squareString = square.getShapeDetails();
        String rectangleString = rectangle.getShapeDetails();
        String triangleString = triangle.getShapeDetails();

        System.out.println("Values for undefined"+ undefinedString);
        System.out.println("Values for circle "+circleString);
        System.out.println("Values for square "+squareString);
        System.out.println("Values for rectangle "+rectangleString);
        System.out.println("Values for triangle "+triangleString);
    }
}
