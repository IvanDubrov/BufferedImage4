package frame;

import buffered.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    Main main = new Main();
    Frame() {
        setBounds(300, 300, 300, 300);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(button);
        setVisible(true);
        buttonPanel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "Scanning is finished! ");
                main.main();
            }
        });
    }

    public static void main(String[] args) {
        new Frame();
    }

    JTextArea display = new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(3, 5));
    JButton button = new JButton("Scanning ");

}
