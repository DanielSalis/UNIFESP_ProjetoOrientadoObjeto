
public class Main {
  public static void main(String[] args) {
    Factory shapeFactory = new Factory();

    Shape shape1 = shapeFactory.getShape("Circulo");
    Ponto PontoS1 = new Ponto(1,2);
    shape1.construct(PontoS1, 20);

    Shape shape2 = shapeFactory.getShape("Triangulo");
    Ponto PontoS2a = new Ponto(1,2);
    Ponto PontoS2b = new Ponto(2,2);
    Ponto PontoS2c = new Ponto(3,1);
    shape2.construct(PontoS2a, PontoS2b, PontoS2c);

    Shape shape3 = shapeFactory.getShape("Retangulo");
    Ponto PontoS3a = new Ponto(1,2);
    Ponto PontoS3b = new Ponto(2,2);
    shape3.construct(PontoS3a, PontoS3b);

    Shape shape4 = shapeFactory.getShape("TETRAEDRO");

    shape1.printStats();
    shape2.printStats();
    shape3.printStats();
    shape4.printStats();

    System.out.println();

    shapeFactory.ImprimirMapa();
  }
}
