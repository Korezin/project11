package second;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;

public class rectangle extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.RED);

        g.drawRect(0, 0, 200, 200); //СЗАО
        g.drawRect(0, 200, 200, 200); //ЗАО
        g.drawRect(0, 400, 200, 200); //ЮЗАО
        g.drawRect(200, 0, 200, 200); //САО
        g.drawRect(200, 200, 200, 200); //ЦАО
        g.drawRect(200, 400, 200, 200); //ЮАО
        g.drawRect(400, 0, 200, 200); //СВАО
        g.drawRect(400, 200, 200, 200); //ВАО
        g.drawRect(400, 400, 200, 200); //ЮВАО
    }
}