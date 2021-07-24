import java.util.HashMap;
import java.util.Map;

public class Factory {
   Integer counter = -1;
   Map<String, Shape> map = new HashMap<String, Shape>();

   public void ImprimirMapa() {
      for (String key : map.keySet()) {

         Shape value = map.get(key);
         System.out.println(key + " = " + value.area());
      }
   }

   public class Retangulo implements Shape {
      Ponto p1;
      Ponto p2;

      @Override
      public void construct(Ponto a, Ponto b) {
         this.p1 = new Ponto(a.getX(), a.getX());
         this.p2 = new Ponto(b.getX(), b.getY());
      }

      @Override
      public String area() {
         return "b²";
      }

      @Override
      public void printStats(){
         System.out.println("- - - -Imprimindo Retangulo - - - -");
         System.out.println("Ponto 1: " + p1.printCoords());
         System.out.println("Ponto 2: " + p2.printCoords());
      }

      @Override
      public void construct(Ponto x, Ponto y, Ponto z) {
      }

      @Override
      public void construct(Ponto x, int raio) {
      }
   }

   public class Circulo implements Shape {
      Ponto centro;
      double raio;

      @Override
      public void construct(Ponto p, int r) {
         this.centro = new Ponto(p.getX(), p.getY());
         this.raio = r;
      }

      @Override
      public String area() {
         return "π * r²";
      }

      @Override
      public void construct(Ponto x, Ponto y) {
      }

      @Override
      public void construct(Ponto x, Ponto y, Ponto z) {
      }

      @Override
      public void printStats() {
         System.out.println("- - - -Imprimindo Circulo - - - -");
         System.out.println("Centro: " + centro.printCoords());
         System.out.println("Raio: " + raio);
      }
   }

   public class Triangulo implements Shape {
      Ponto p1;
      Ponto p2;
      Ponto p3;

      @Override
      public void construct(Ponto a, Ponto b, Ponto c) {
         this.p1 = new Ponto(a.getX(), a.getY());
         this.p2 = new Ponto(b.getX(), b.getY());
         this.p3 = new Ponto(c.getX(), c.getY());
      }

      @Override
      public String area() {
         return "(b*h)/2";
      }

      @Override
      public void construct(Ponto x, Ponto y) {

      }

      @Override
      public void construct(Ponto x, int raio) {

      }

      @Override
      public void printStats() {
         System.out.println("- - - -Imprimindo Triangulo - - - -");
         System.out.println("Ponto 1: " + p1.printCoords());
         System.out.println("Ponto 2: " + p2.printCoords());
         System.out.println("Ponto 3: " + p3.printCoords());
      }
   }

   public class NoShape implements Shape {
      @Override
      public String area() {
         return "Shape Invalido";
      }

      @Override
      public void construct(Ponto x, Ponto y) {
      }

      @Override
      public void construct(Ponto x, Ponto y, Ponto z) {
      }

      @Override
      public void construct(Ponto x, int raio) {
      }

      @Override
      public void printStats() {

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

      } else if (shapeType.equalsIgnoreCase("Retangulo")) {
         map.put(counter.toString(), new Retangulo());
         return new Retangulo();
      }
      map.put(counter.toString(), new NoShape());
      return new NoShape();
   }
}