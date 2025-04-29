package _my_test;

import javax.swing.*;
import java.awt.*;

public class FunctionTest extends JFrame {

    private drawPaint drawPaint;

    public FunctionTest() {
        initData();
        setInitData();
    }

    private void initData() {
        setTitle("함수 테스트");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawPaint = new drawPaint();
    }

    private void setInitData() {
        super.add(drawPaint);
    }

    static class drawPaint extends JPanel {
        private Random random = new Random();

        @Override
        public void paint(Graphics g) {
            for (int i = 0; i < getWidth(); i++)
                g.drawLine((i * i), (10 * i), (i * i), (10 * i));
        }
    }

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
    }
}
