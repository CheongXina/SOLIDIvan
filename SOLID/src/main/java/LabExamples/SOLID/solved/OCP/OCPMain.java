package LabExamples.SOLID.solved.OCP;

public class OCPMain
{
    public static void main(String args[])
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2,2);
        shapes[1] = new Circle(3);

        //the area calculator now does not worry about the shape.
        AreaCalculator areaCalculator= new AreaCalculator();
        double areaSum = areaCalculator.Area(shapes);
        System.out.println(areaSum);
    }
}
