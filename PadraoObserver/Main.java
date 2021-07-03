package PadraoObserver;

import javax.swing.SwingUtilities;

public class Main {
    private void start() {
        InstitutoDePesquisa window = new InstitutoDePesquisa();
        new DataColector(window);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().start();
            }
        });
    }
}