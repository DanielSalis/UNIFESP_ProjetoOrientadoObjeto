
public class Main {
  public static void main(String[] args) {
    Factory shapeFactory = new Factory();

    Shape shape1 = shapeFactory.getShape("Circulo");
    Shape shape2 = shapeFactory.getShape("Triangulo");
    Shape shape3 = shapeFactory.getShape("Quadrado");
    Shape shape4 = shapeFactory.getShape("TETRAEDRO");
    System.out.println("Imprimindo via chamada da função");
    System.out.println("shape 1: "+ shape1.area() + " shape 2: " + shape2.area());
    System.out.println();


    System.out.println("Imprimindo via hashmap");

    shapeFactory.ImprimirMapa();
  }
}
