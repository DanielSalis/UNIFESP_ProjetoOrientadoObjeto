package PadraoObserver;

import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InstitutoDePesquisa implements Observer {
    private JLabel label;

    @Override
    public void update(Observable o, Object data) {
        label.setText((String) data);
    }

    InstitutoDePesquisa() {
        JFrame frame = new JFrame("Replicador");
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        label = new JLabel("Atualize os dados...");
        label.setFont(new Font("Dialog", Font.PLAIN, 20));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocation(100, 200);
        frame.setVisible(true);
    }
}
