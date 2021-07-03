package PadraoObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DataColector {

    class Data {
        String ph;
        String temp;
        String pressao;
    }

    DataColector(InstitutoDePesquisa replicatorWindow) {
        final MessageObservable observable = new MessageObservable();
        observable.addObserver(replicatorWindow);
        JFrame dialog = new JFrame("Dialog");

        JTextField textFieldPh = new JTextField(10);
        textFieldPh.setBounds(0, 100, 300, 40);
        JLabel labelPh = new JLabel("PH");
        labelPh.setBounds(300, 100, 100, 40);

        JTextField textTemperatura = new JTextField(10);
        textTemperatura.setBounds(0, 200, 300, 40);
        JLabel labelTemperatura = new JLabel("Temperatura");
        labelTemperatura.setBounds(300, 200, 100, 40);

        JTextField textPressao = new JTextField(10);
        textPressao.setBounds(0, 300, 300, 40);
        JLabel labelPressao = new JLabel("Pressao");
        labelPressao.setBounds(300, 300, 100, 40);

        JButton button = new JButton("Enviar");
        button.setBounds(0, 400, 100, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ph = textFieldPh.getText();
                String temp = textTemperatura.getText();
                String pressao = textPressao.getText();

                observable.changeData("Ph: " + ph + " ->Temperatura: " + temp + " ->Pressao: " + pressao);
            }
        });
        dialog.setSize(500, 550);
        dialog.setLocation(600, 200);
        dialog.setVisible(true);
        dialog.setLayout(null);

        dialog.add(labelPh);
        dialog.add(textFieldPh);

        dialog.add(labelTemperatura);
        dialog.add(textTemperatura);

        dialog.add(labelPressao);
        dialog.add(textPressao);
        dialog.add(button);
    }
}
