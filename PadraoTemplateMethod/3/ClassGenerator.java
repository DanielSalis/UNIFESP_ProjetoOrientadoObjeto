import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassGenerator extends Template {
    public String filename;
    public String mensagem;
    public String data;

    public void init(String n, String m, String e) {
        data = templateMethod(n, m, e);
        filename = n;
        mensagem = m;
    }

    public void createFile() {
        try {
            File myObj = new File(filename+".java");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

                FileWriter fw = null;
                BufferedWriter bw = null;
                PrintWriter pw = null;

                fw = new FileWriter(filename+".java", true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.println(data);

                pw.close();
                bw.close();
                fw.close();

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
