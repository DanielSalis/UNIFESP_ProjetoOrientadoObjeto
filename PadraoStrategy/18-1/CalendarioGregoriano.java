import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarioGregoriano implements EstrategiaData{
    public DiaSemana data;

    public CalendarioGregoriano(DiaSemana d){
        data = d; 
    }

    public void encontrarDiaDaSemana() {
        GregorianCalendar gc =  new GregorianCalendar(data.ano, data.mes, data.dia);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
    }
    
}
