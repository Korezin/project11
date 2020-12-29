package second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class windows extends JFrame {
    windows() {
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label0 = new JLabel("WEST");
        label0.setBounds(0, 400, 200, 50);
        JLabel label1 = new JLabel("NORTH");
        label1.setBounds(400, 0, 200, 50);
        JLabel label2 = new JLabel("CENTER");
        label2.setBounds(400, 400, 200, 50);
        JLabel label3 = new JLabel("SOUTH");
        label3.setBounds(400, 800, 200, 25);
        JLabel label4 = new JLabel("EAST");
        label4.setBounds(800, 400, 100, 50);
        JLabel label5 = new JLabel("SOUTHEAST");
        label5.setBounds(800, 800, 200, 50);
        JLabel label6 = new JLabel("NORTHWEST");
        label6.setBounds(0, 0, 200, 50);
        JLabel label7 = new JLabel("SOUTHWEST");
        label7.setBounds(0, 800, 200, 50);
        JLabel label8 = new JLabel("NORTHEAST");
        label8.setBounds(800, 0, 200, 50);

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label0);

        Rectangle r = new Rectangle();
        setVisible(true);
        setLocationRelativeTo(null);
        Timer time = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point point = MouseInfo.getPointerInfo().getLocation();
                double x = point.getX();
                double y = point.getY();
                if (0 <= x && x < 400) {
                    if (0 <= y && y <= 400) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в СЗАО");
                    }
                    if (400 < y && y <= 800) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
                    }
                    else if (800 < y && y <= 1200){
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮЗАО");
                    }
                }
                else if (400 < x && x <= 800) {
                    if (0 <= y && y <= 400) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
                    }
                    else if (400 < y && y <= 800) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
                    }
                    else if (800 < y && y <= 1200){
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
                    }
                }
                else if (800 < x && x <= 1200){
                    if (0 <= y && y <= 400) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в СВАО");
                    }
                    else if (400 < y && y < 800) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
                    }
                    else if (800 < y && y <= 1200){
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮВАО");
                    }
                }
            }
        });
        time.start();
    }
}