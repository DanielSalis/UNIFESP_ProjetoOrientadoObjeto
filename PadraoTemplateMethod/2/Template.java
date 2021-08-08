public abstract class Template {
    public String build(String nome, String extentClass){
        if(extentClass.length() > 0){
            String s = "public class "+nome+ " extends " + extentClass + " {" + " public static void main(String[] args) {}" +" }";
            return s;
        }else{
            String s = "public class "+nome+ " {" + " public static void main(String[] args) {}" +" }";
            return s;
        }
    };


    public String templateMethod(String nome, String extentClass) {
        return build(nome, extentClass);
    }
}