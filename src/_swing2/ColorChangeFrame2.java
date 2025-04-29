package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public ColorChangeFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("click1");
        button2 = new JButton("click2");
    }
    private void setInitLayout() {
        setLayout(new BorderLayout());

        panel.setBackground(Color.YELLOW);
        add(panel, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setVisible(true);

    }
    private void addEventListener() {

    }

    // 테스트 코드
    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

