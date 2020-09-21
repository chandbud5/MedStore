import javax.swing.*;
import java.awt.*;

class View{
    
    JFrame frame = new JFrame();
    public View(){

        JLabel name = new JLabel("MedStore", 0);
        JLabel title = new JLabel("Get your Medicines and Nutrition products at your DoorStep", 0);
        name.setFont(new Font(name.getName(), Font.BOLD, 30));
        title.setFont(new Font(title.getName(), Font.PLAIN, 26));

        JPanel jp1 = new JPanel(new BorderLayout(10, 10));
        jp1.add(name, BorderLayout.NORTH);
        jp1.add(title, BorderLayout.SOUTH);
        frame.add(jp1);

        JButton cart = new JButton("Shopping Cart");
        JButton signup = new JButton("SIGN UP");
        JButton login = new JButton("Login");

        JPanel jp2 = new JPanel(new BorderLayout(5,5));
        jp2.add(cart, BorderLayout.PAGE_START);
        jp2.add(signup, BorderLayout.LINE_START);
        jp2.add(login, BorderLayout.LINE_END);
        frame.add(jp2);

        JLabel p1 = new JLabel("Medicines");
        JLabel pr1 = new JLabel("500 Rs.");
        JButton b1 = new JButton("Add to Cart");
        JPanel jp3 = new JPanel(new BorderLayout(5,5));
        jp3.add(p1, BorderLayout.LINE_START);
        jp3.add(pr1, BorderLayout.LINE_END);
        jp3.add(b1, BorderLayout.SOUTH);
        jp3.setSize(320, 100);
        frame.add(jp3);

        JLabel p2 = new JLabel("Nutrients");
        JLabel pr2 = new JLabel("600 Rs.");
        JButton b2 = new JButton("Add to Cart");
        JPanel jp4 = new JPanel(new BorderLayout(5,5));
        jp4.add(p2, BorderLayout.LINE_START);
        jp4.add(pr2, BorderLayout.LINE_END);
        jp4.add(b2, BorderLayout.SOUTH);
        jp4.setSize(320, 100);
        frame.add(jp4);

        JLabel p3 = new JLabel("Sanitizer");
        JLabel pr3 = new JLabel("50 Rs.");
        JButton b3 = new JButton("Add to Cart");
        JPanel jp5 = new JPanel(new BorderLayout(5,5));
        jp5.add(p3, BorderLayout.LINE_START);
        jp5.add(pr3, BorderLayout.LINE_END);
        jp5.add(b3, BorderLayout.SOUTH);
        jp5.setSize(320, 100);
        frame.add(jp5);

        JLabel p4 = new JLabel("Face Masks");
        JLabel pr4 = new JLabel("50 Rs.");
        JButton b4 = new JButton("Add to Cart");
        JPanel jp6 = new JPanel(new BorderLayout(5,5));
        jp6.add(p4, BorderLayout.LINE_START);
        jp6.add(pr4, BorderLayout.LINE_END);
        jp6.add(b4, BorderLayout.SOUTH);
        jp6.setSize(320, 100);
        frame.add(jp6);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        frame.setTitle("MedStore");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(100, 25, 960, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Home {
    public static void main(String[] args) {
        View h = new View();
    }
}