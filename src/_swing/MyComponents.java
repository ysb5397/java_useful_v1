package _swing;

import javax.swing.*;
import java.awt.*;

/**
 *  배치관리자 - FlowLayout ( 컴포넌트 수평, 수직 배치 )
 */

public class MyComponents extends JFrame {

    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    // 생성자
    public MyComponents() {

        initData();
        setInitLayout();

    }

    private void initData() {
        setTitle("컴포넌트 확인");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("JButton");
        label = new JLabel("글자를 띄우는 컴포넌트");
        textField = new JTextField("아이디 입력하세요.", 30);
        passwordField = new JPasswordField("비밀번호를 입력하세요.", 40);
        checkBox = new JCheckBox("동의");


    }

    private void setInitLayout() {
        // JFrame 의 배치 관리자를 결정해주는 메서드
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        // 프레임에 붙여보기
        add(button);
        add(label);
        add(textField);
        add(passwordField);
        add(checkBox);

        setVisible(true);
    }

    // 테스트 코드
    public static void main(String[] args) {
        MyComponents myComponents = new MyComponents();
    }

}
