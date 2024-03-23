package LabExamples.SOLID.solved.OCP;

public class AreaCalculator
{
    public double Area(Shape[] shapes)
    {
        //existing code does not change no matter what.
        double area = 0;
        for (int i=0; i<shapes.length; i++)
        {
            area += shapes[i].Area();
        }
        return area;
    }
}
