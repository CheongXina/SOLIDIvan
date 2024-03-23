package LabExamples.SOLID.violated.OCP.Phase1;


public class AreaCalculator {

    public double Area(Rectangle[] shapes)
    {
        double area = 0;
        for (Rectangle shape : shapes) {
            area += shape.Width * shape.Height;
        }
        return area;
    }

    //
}
