public class Calendario {
    EstrategiaData acao;

    public void definirEstrategia(DiaSemana d) {
        if (d.dia > 0 && d.mes > 0 && d.ano >0) {
            acao = new CalendarioGregoriano(d);
        }
    }

    public void retornarData() {
        acao.encontrarDiaDaSemana();
    }
}
