import java.util.HashMap;
import java.util.Map;

public class Factory {
   Integer counter = -1;
   Map<String,Shape> map = new HashMap<String,Shape>();

   public void ImprimirMapa(){
      for (String key : map.keySet()) {

         Shape value = map.get(key);
         System.out.println(key + " = " + value.area());
      }
   }

   public class Quadrado implements Shape {
      @Override
      public String area() {
         return "b²";
      }
   }

   public class Circulo implements Shape {
      @Override
      public String area() {
         return "π * r²";
      }
   }

   public class Triangulo implements Shape {

      @Override
      public String area() {
         return "(b*h)/2";
      }
   }

   public class NoShape implements Shape {

      @Override
      public String area() {
         return "Shape Invalido";
      }
   }

   public Shape getShape(String shapeType) {
      counter++;
      if (shapeType == null) {
         map.put(counter.toString(), new NoShape());
         return new NoShape();
      }
      if (shapeType.equalsIgnoreCase("Circulo")) {
         map.put(counter.toString(), new Circulo());
         return new Circulo();

      } else if (shapeType.equalsIgnoreCase("Triangulo")) {
         map.put(counter.toString(), new Triangulo());
         return new Triangulo();

      } else if (shapeType.equalsIgnoreCase("Quadrado")) {
         map.put(counter.toString(), new Quadrado());
         return new Quadrado();
      }
      map.put(counter.toString(), new NoShape());
      return new NoShape();
   }
}