import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static class Item{
        public String text;

        public Item(String s){
            text = s;
        }
    }

    public static class ComparadorInverso implements Comparator<Item> {

        @Override
        public int compare(Main.Item arg0, Main.Item arg1) {
            Item c1 = (Item) arg0;
            Item c2 = (Item) arg1;
            if (c1.text.charAt(c1.text.length() - 1) > c2.text.charAt(c2.text.length() - 1))
                return 1;
            else if (c1.text.charAt(c1.text.length() - 1) < c2.text.charAt(c2.text.length() - 1))
                return -1;
            else if (c1.text.charAt(c1.text.length() - 1) == c2.text.charAt(c2.text.length() - 1))
                return 0;
            return 0;
        }
    }

    public static void main(String[] args) {
        Item coisas[] = new Item[2];
        coisas[0] = new Item("Texto A");
        coisas[1] = new Item("Texto B");

        Arrays.sort(coisas, new ComparadorInverso());
    }
}
