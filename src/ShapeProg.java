import java.util.*;

abstract class Shape
{
    abstract double calculatearea();
}

class Circle extends Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculatearea()
    {
        return ((3.14)*radius*radius);
    }
}

class Rectangle extends Shape
{
    double width;
    double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double calculatearea()
    {
        return (width*height);
    }
}

public class ShapeProg
{
    public static void main(String[] args)
    {
        Shape circ = new Circle(6.00);
        Shape rect = new Rectangle(15,20);

        System.out.println("Area of Circle: " +circ.calculatearea());
        System.out.println("Area of Rectangle: " +rect.calculatearea());
    }
}