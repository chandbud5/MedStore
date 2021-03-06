import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Login{
    public static void main(String[] args) {
        LoginForm f = new LoginForm();
    }
}

class LoginForm{
    public LoginForm() {

        JFrame frame = new JFrame();
        JLabel l1 = new JLabel("Login to your MedStore Account", 0);
        JLabel l2 = new JLabel("UserName", 0);
        JLabel l3 = new JLabel("Password", 0);
        JLabel msg = new JLabel("Incorrect Credentials");
        JTextField t1 = new JTextField(40);
        JPasswordField t2 = new JPasswordField(40);
        JButton submit = new JButton("Submit");
        JButton home = new JButton("Return to Home");
        JLabel m = new JLabel("Don't have account? Create One");
        JButton reg = new JButton("Register");

        msg.setVisible(false);

        JPanel jp1 = new JPanel(new BorderLayout(5, 20));
        JPanel jp2 = new JPanel(new BorderLayout(10, 20));
        JPanel jp3 = new JPanel(new BorderLayout(5, 20));

        l1.setFont(new Font(l1.getName(), Font.PLAIN, 20));
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 16));
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 16));
        m.setFont(new Font(m.getName(), Font.PLAIN, 18));

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                String userNameInput = t1.getText();
                String passwordInput = new String(t2.getPassword());
                String s, pass;

                try {
                    File f = new File("registration.txt");
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    s = br.readLine();
                    pass = br.readLine();
                    while (s != null || pass != null) {
                        if (s.equals(userNameInput) && pass.equals(passwordInput)) {
                            View.auth = true;
                            break;
                        }
                        s = br.readLine();
                        pass = br.readLine();
                    }
                    br.close();

                    if (!View.auth) {
                        msg.setVisible(true);
                    } else {
                        new View();
                        frame.dispose();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        });

        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new regisForm();
                frame.dispose();
            }
        });

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View();
                frame.dispose();
            }
        });

        jp1.add(l1, BorderLayout.PAGE_START);
        jp1.add(l2, BorderLayout.LINE_START);
        jp1.add(t1, BorderLayout.LINE_END);

        jp2.add(l3, BorderLayout.LINE_START);
        jp2.add(t2, BorderLayout.LINE_END);
        jp2.add(submit, BorderLayout.SOUTH);

        jp3.add(home, BorderLayout.PAGE_END);
        jp3.add(m, BorderLayout.LINE_START);
        jp3.add(reg, BorderLayout.LINE_END);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        frame.add(jp1);
        frame.add(jp2);
        frame.add(jp3);
        frame.add(msg);
        frame.setTitle("Login Form");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBounds(100, 25, 700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}