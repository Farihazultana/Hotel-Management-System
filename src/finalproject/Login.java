/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Shariful Alam Patwary &Fariha Sultana CSE Java Lab Sec B.
 */
public class Login extends JFrame {

    JPanel panel = new JPanel(new GridBagLayout());
    JLabel label1 = new JLabel("Username");
    JLabel label2 = new JLabel("Password");
    JTextField tf = new JTextField(15);
    JPasswordField pf = new JPasswordField(15);
    JButton button = new JButton("Log in");
    GridBagConstraints c = new GridBagConstraints();

    public Login() {
        setSize(500, 300);
        setLocation(430, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.insets = new Insets(10, 10, 10, 10);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(label1, c);

        c.gridx = 2;
        c.gridy = 1;
        panel.add(tf, c);

        c.gridx = 0;
        c.gridy = 5;
        panel.add(label2, c);

        c.gridx = 2;
        c.gridy = 5;
        panel.add(pf, c);

        c.gridx = 3;
        c.gridy = 7;
        panel.add(button, c);
        add(panel);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = tf.getText();
                String password = String.valueOf(pf.getPassword());

                if (username.contains("uiu") && password.contains("12345")) {
                    dispose();
                    Welcome obj = new Welcome();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password\nClick ok and try again", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });

    }

    public static void main(String[] args) {
        Login obj = new Login();
        obj.setVisible(false);
        new Login().setVisible(true);

    }
}
