public interface Shape {
  void construct(Ponto x, Ponto y);
  void construct(Ponto x, Ponto y, Ponto z);
  void construct(Ponto x, int raio);
  void printStats();
  String area();
}