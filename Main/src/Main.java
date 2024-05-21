// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Shape [] shapes = new Shape[5];
     shapes[0] = new Circle();
     shapes[1] = new Rectangle();
     shapes[2] = new Square();
     shapes[3] = new Triangle();
     shapes[4] = new Quad();
     Print print = new Print();
     Shape circle = new Circle();
     print.print(circle);
    }
}

abstract class  Shape
{
    public abstract String getName();
}

class Rectangle extends Shape
{
    @Override
    public String getName() {
        return "Rectangle";
    }
}
class Circle extends Shape
{
    @Override
    public String getName() {
        return "Circle";
    }
}
class Triangle extends Shape
{
    @Override
    public String getName() {
        return "Triangle";
    }
}
class Square extends Shape
{
    @Override
    public String getName() {
        return "Square";
    }
}
class Quad extends Shape
{
    @Override
    public String getName() {
        return "Quad";
    }
}

class Print
{
    public void print(Shape shape)
    {
        System.out.println("This is: " + shape.getName());
    }
}