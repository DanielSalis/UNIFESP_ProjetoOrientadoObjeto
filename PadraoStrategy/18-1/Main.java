public class Main {
    public static void main(String[] args) {
        Calendario c = new Calendario();
        DiaSemana data = new DiaSemana();
        data.ano = 1998;
        data.mes = 10;
        data.dia = 14;
        c.definirEstrategia(data);
        c.retornarData();
    }
}
