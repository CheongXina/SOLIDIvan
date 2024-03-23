package LabExamples.SOLID.violated.OCP.Phase2;

public class AreaCalculator
{
    public double Area(Object[] shapes)
    {
        double area = 0;
        for (int i=0; i<shapes.length; i++)
        {
            if (shapes[i].getClass() == Rectangle.class)
            {
                Rectangle rectangle = (Rectangle) shapes[i];
                area += rectangle.Width*rectangle.Height;
            }
        else
            {
                Circle circle = (Circle)shapes[i];
                area += circle.radius * circle.radius * Math.PI;
            }
        }
        return area;
    }
}