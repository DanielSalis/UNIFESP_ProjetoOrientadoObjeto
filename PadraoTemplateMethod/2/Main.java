import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ClassGenerator cg = new ClassGenerator();
        cg.init("Teste", "");
        cg.createFile();
    }
}
