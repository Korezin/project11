package third;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame {

    window() {
        setLayout(null);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lText = new JLabel("Ваш текст:");
        JLabel lColor = new JLabel("Выберите цвет:");
        JLabel lFont = new JLabel("Выберите шрифт:");

        JTextField text = new JTextField();

        JButton bBlue = new JButton("Синий");
        JButton bRed = new JButton("Красный");
        JButton bBlack = new JButton("Черный");
        JButton bTNR = new JButton("Times New Roman");
        JButton bMS = new JButton("MS Sans Serif");
        JButton bCN = new JButton("Courier New");

        lText.setBounds(10, 10, 100, 25);
        text.setBounds(10, 60, 500, 25);
        lColor.setBounds(10, 110, 100, 25);
        bBlue.setBounds(10, 160, 100, 25);
        bRed.setBounds(150, 160, 100, 25);
        bBlack.setBounds(290, 160, 100, 25);
        lFont.setBounds(10, 210, 150, 25);
        bTNR.setBounds(10, 260, 200, 25);
        bMS.setBounds(230, 260, 200, 25);
        bCN.setBounds(470, 260, 200, 25);

        add(lText);
        add(lColor);
        add(lFont);
        add(text);
        add(bBlue);
        add(bRed);
        add(bBlack);
        add(bTNR);
        add(bMS);
        add(bCN);

        setVisible(true);
        setLocationRelativeTo(null);
        setListener(bBlue, bRed, bBlack, bTNR, bMS, bCN, text);
    }
    private void setListener(JButton bBlue, JButton bRed, JButton bBlack, JButton bTNR, JButton bMS, JButton bCN, JTextField text) {
        bBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });

        bRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });

        bBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });

        bTNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });

        bMS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });

        bCN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });
    }
}