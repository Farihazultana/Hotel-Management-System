/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame {

    JLabel label1 = new JLabel("Welcome");
    JButton button1 = new JButton("ROOM BOOKING");
    JButton button2 = new JButton("SEARCH");
    // JButton button3 = new JButton("UPDATE RECORD");
    JButton button4 = new JButton("ROOMS");
    JButton button5 = new JButton("LOGOUT");

    public Welcome() {
        setBounds(430, 170, 500, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label1.setBounds(188, 30, 250, 25);
        label1.setFont(new Font("Calibri", Font.BOLD, 30));
        getContentPane().add(label1);

        button1.setBounds(180, 100, 128, 25);
        getContentPane().add(button1);

        button2.setBounds(180, 150, 128, 25);
        getContentPane().add(button2);

        /* button3.setBounds(177,200,135,25);
        getContentPane().add(button3)/*/
        button4.setBounds(177, 200, 135, 25);
        getContentPane().add(button4);

        button5.setBounds(200, 250, 90, 25);
        getContentPane().add(button5);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RoomBoking obj = new RoomBoking();
                obj.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Sarech obj = new Sarech();
                setVisible(false);
                new Sarech().setVisible(true);
            }
        });

        /* button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });*/
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Rooms obj = new Rooms();
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login obj = new Login();
            }
        });
    }
}
