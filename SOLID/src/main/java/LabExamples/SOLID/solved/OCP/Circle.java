package LabExamples.SOLID.solved.OCP;

public class Circle implements Shape{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return radius * radius * Math.PI;
    }
}
