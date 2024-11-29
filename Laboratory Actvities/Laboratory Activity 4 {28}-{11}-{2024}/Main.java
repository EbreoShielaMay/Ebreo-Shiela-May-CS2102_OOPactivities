public class Main {
    public static void main(String[] args) {
        Square square = new Square(20);
        Rectangle rectangle = new Rectangle(10, 6);
        Triangle triangle = new Triangle(8,9,7);

        //collection of shapes
        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        //for computing and printing the perimeter and area
        shapeCollection.getPropertyValues();
    }
}