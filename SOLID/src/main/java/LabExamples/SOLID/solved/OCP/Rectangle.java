package LabExamples.SOLID.solved.OCP;

public class Rectangle implements Shape{

    public double Width;

    public double Height;

    public Rectangle(double width, double height) {
        Width = width;
        Height = height;
    }

    @Override
    public  double Area()
    {
        return Width*Height;
    }
}
