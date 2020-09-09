import javax.swing.*;
import java.awt.*;

public class Login{
    public static void main(String[] args) {
        Form f = new Form();
    }
}

class Form extends JFrame {
    public Form(){

        JLabel l1 = new JLabel("Login to your MedStore Account");
        JLabel l2 = new JLabel("UserName");
        JLabel l3 = new JLabel("Password");
        JTextField t1 = new JTextField(18);
        JTextField t2 = new JTextField(18);
        JButton submit = new JButton("Submit");
        JLabel m = new JLabel("Don't have account? Create One");
        JButton reg = new JButton("Register");

        JPanel jp1 = new JPanel(new BorderLayout(5, 20));
        JPanel jp2 = new JPanel(new BorderLayout(5, 20));
        JPanel jp3 = new JPanel(new BorderLayout(5, 20));

        jp1.add(l1, BorderLayout.NORTH);
        jp1.add(l2, BorderLayout.LINE_START);
        jp1.add(t1, BorderLayout.LINE_END);

        jp2.add(l3, BorderLayout.LINE_START);
        jp2.add(t2, BorderLayout.LINE_END);
        jp2.add(submit, BorderLayout.SOUTH);

        jp3.add(m, BorderLayout.LINE_START);
        jp3.add(reg, BorderLayout.LINE_END);

        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        add(jp1);
        add(jp2);
        add(jp3);
        setTitle("Login");
        setResizable(false);
        setVisible(true);
        setSize(600, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}