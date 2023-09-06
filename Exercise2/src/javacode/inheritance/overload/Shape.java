package javacode.inheritance.overload;

public class Shape {
    public String shapeName;
    public Integer numberOfEdges;

    public Shape(String shapeName, Integer numberOfEdges) {
        this.shapeName = shapeName;
        this.numberOfEdges = numberOfEdges;
    }

    public Shape() {
        System.out.println("The shape object has been created");
        this.shapeName = "Undefined shape";
        this.numberOfEdges = 0;
    }
    public Shape(Double radius){
        this();
        System.out.println("Circle created");
        this.shapeName = "Circle";
    }
    public Shape(Integer edges, Double edgeLength){
        System.out.println("Square Object has been created");
        this.numberOfEdges = edges;
        this.shapeName = "Square";
    }
    public Shape(Integer edges, Double e1, Double e2){
        System.out.println("Rectangle object has been created");
        this.numberOfEdges = edges;
        this.shapeName = "Rectangle";
    }
    public Shape(Integer edges, Double e1, Double e2, Double e3){
        System.out.println("Triangle object has been created");
        this.numberOfEdges = edges;
        this.shapeName = "Triangle";
    }
    public String getShapeDetails(){
        return "Shape details are name: "+this.shapeName+" number of edges :" + this.numberOfEdges;
    }


}
