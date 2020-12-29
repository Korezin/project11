package first;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows extends JFrame {
    int val;
    int count = 0;
    public void setVal(int val) {
        this.val = val;
    }
    Windows() {
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Ваш ответ");
        JLabel l2 = new JLabel("Результат");

        JTextField text = new JTextField();
        JTextField message = new JTextField();

        JButton button = new JButton("Ответить");

        l1.setBounds(10, 10, 100, 25);
        l2.setBounds(110, 10, 100, 25);
        text.setBounds(10, 60, 100, 25);
        message.setBounds(110, 60, 150, 25);
        button.setBounds(10, 110, 100, 50);

        add(l1);
        add(l2);
        add(text);
        add(message);
        add(button);
        setVisible(true);
        setLocationRelativeTo(null);
        setListener(button, text, message);
    }
    
    private void setListener(JButton button, JTextField text, JTextField message) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count += 1;
                try {
                    int temp = Integer.parseInt(text.getText());
                    String msg = game(temp, count);
                    message.setText(msg);
                    if (msg == "Выиграли") {
                        JOptionPane.showMessageDialog(null, "Вы победили!");
                        setVisible(false);
                        System.exit(0);
                    }
                    if (msg == "Проиграли") {
                        JOptionPane.showMessageDialog(null, "Вы проиграли");
                        setVisible(false);
                        System.exit(0);
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Неправильное значение");
                    count -= 1;
                    return;
                }
            }
        });
    }
    
    private String game(int x, int count) {
        if (val == x) {
            return "Выиграли";
        }
        else {
            if (count == 3) {
                return "Проиграли";
            }
            else {
                if (val > x) {
                    return "Больше";
                }
                else {
                    return "Меньше";
                }
            }
        }
    }
}