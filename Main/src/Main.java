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
     Shape rectangle = new Rectangle();
     print.print(rectangle);
    }
}


