package PadraoAdapter;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<User> Users = new Vector<User>();

        User u1 = new User("Daniel", "Salis", 22);
        User u2 = new User("Du", "Salis", 19);
        User u3 = new User("Ana", "Salis", 50);

        Users.add(u1);
        Users.add(u2);
        Users.add(u3);

        Enumeration<User> en = Users.elements();
        EnumeratorAdapted<User> ea = new EnumeratorAdapted<User>(en);

        while (ea.hasNext()) {
            System.out.println(ea.next().toString());
        }
    }
}
