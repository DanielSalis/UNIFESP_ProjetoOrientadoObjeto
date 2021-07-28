import java.util.HashMap;
import java.util.Map;
     
class ShapeFactory {
   
    private static Map<String, Shape> colorMap = new HashMap<String, Shape>(); 
       
    static 
    {
        colorMap.put("circle", new circle());
        colorMap.put("square", new square());
    }
       
    public static Shape getShape(String shapeForm)
    {
        return (Shape) colorMap.get(shapeForm).clone();
    }
}