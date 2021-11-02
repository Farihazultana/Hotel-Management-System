/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rooms extends JFrame {

    JTable table;

    JButton button1 = new JButton("Proceed");
    JButton button2 = new JButton("Search");
    JButton button3 = new JButton("Cancel");

    public Rooms() {

        String[] columnNames = {"ROOMS", "ROOMS TYPE", "BED TYPE", "TARIFF (tk)"};
        String[][] data = {
            {"201", "AC", "Double", "2000"},
            {"202", "AC", "Double", "2000"},
            {"203", "AC", "Double", "2000"},
            {"204", "AC", "Double", "2000"},
            {"105", "AC", "Double", "2000"},
            {"106", "AC", "Double", "2000"},
            {"107", "AC", "Single", "1500"},
            {"108", "AC", "Single", "1500"},
            {"109", "AC", "Single", "1500"},
            {"209", "AC", "Single", "1500"},
            {"209", "AC", "Single", "1500"},
            {"110", "AC", "Single", "1500"},
            {"111", "NON AC", "Double", "1200"},
            {"112", "NON AC", "Double", "1000"},
            {"113", "NON AC", "Double", "1000"},
            {"114", "NON AC", "Double", "1000"},
            {"115", "NON AC", "Double", "1000"},
            {"116", "NON AC", "Single", "700"},
            {"117", "NON AC", "Single", "700"},
            {"118", "NON AC", "Single", "700"},
            {"119", "NON AC", "Single", "700"},
            {"120", "NON AC", "Single", "700"},
            {"220", "NON AC", "Single", "700"},
            {"221", "NON AC", "Single", "700"},
            {"230", "NON AC", "Single", "700"}

        };
        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 880, 200);

        button1.setBounds(450, 250, 100, 25);
        button2.setBounds(580, 250, 100, 25);
        button3.setBounds(710, 250, 100, 25);

        add(scrollPane);

        add(button1);
        add(button2);
        add(button3);

        setLayout(null);
        setSize(900, 360);
        setTitle("List of Available Rooms");
        setLocation(250, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                //RoomBoking obj = new RoomBoking();
                setVisible(false);
                new RoomBoking().setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                //Sarech obj = new Sarech();
                setVisible(false);
                new Sarech().setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Welcome obj = new Welcome();
            }
        });
    }
}
