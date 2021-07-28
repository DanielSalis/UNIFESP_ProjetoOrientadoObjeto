
// Driver class
class Main
{
    public static void main (String[] args)
    {
        ShapeFactory.getShape("circle").addShape();
        ShapeFactory.getShape("square").addShape();
        ShapeFactory.getShape("square").addShape();
        ShapeFactory.getShape("circle").addShape();
    }
}