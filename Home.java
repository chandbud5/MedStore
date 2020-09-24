import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class View{
    
    JFrame frame = new JFrame();
    static boolean auth = false;
    static ArrayList<String> products = new ArrayList();
    static ArrayList<String> price = new ArrayList();

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
        JButton signup = new JButton("Sign Up");
        JButton login = new JButton("Login");

        cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                new carts();
                frame.dispose();
            }
        });

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new regisForm();
                frame.dispose();
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginForm();
                frame.dispose();
            }
        });

        JPanel jp2 = new JPanel(new BorderLayout(5,5));
        jp2.add(cart, BorderLayout.PAGE_START);
        jp2.add(signup, BorderLayout.LINE_START);
        jp2.add(login, BorderLayout.LINE_END);
        frame.add(jp2);

	    JLabel c1 = new JLabel("Medicines");
	    c1.setFont(new Font(c1.getName(), Font.BOLD, 16));
        JPanel jp0 = new JPanel(new BorderLayout(5, 15));
	    jp0.add(c1, BorderLayout.NORTH);
	    frame.add(jp0);

        JLabel p1 = new JLabel("Diabetes");
        JLabel pr1 = new JLabel("500");
        JButton b1 = new JButton("Add to Cart");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p1.getText());
                price.add(pr1.getText());
            }
        });

        JPanel jp3 = new JPanel(new BorderLayout(5,5));
        jp3.add(p1, BorderLayout.LINE_START);
        jp3.add(pr1, BorderLayout.LINE_END);
        jp3.add(b1, BorderLayout.SOUTH);
        frame.add(jp3);

        JLabel p2 = new JLabel("Corona");
        JLabel pr2 = new JLabel("700");
        JButton b2 = new JButton("Add to Cart");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p2.getText());
                price.add(pr2.getText());
            }
        });
        JPanel jp4 = new JPanel(new BorderLayout(5,5));
        jp4.add(p2, BorderLayout.LINE_START);
        jp4.add(pr2, BorderLayout.LINE_END);
        jp4.add(b2, BorderLayout.SOUTH);
        frame.add(jp4);

        JLabel p3 = new JLabel("Fever");
        JLabel pr3 = new JLabel("200");
        JButton b3 = new JButton("Add to Cart");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p3.getText());
                price.add(pr3.getText());
            }
        });
        JPanel jp5 = new JPanel(new BorderLayout(5, 5));
        jp5.add(p3, BorderLayout.LINE_START);
        jp5.add(pr3, BorderLayout.LINE_END);
        jp5.add(b3, BorderLayout.SOUTH);
        frame.add(jp5);
        JLabel p4 = new JLabel("Headache");
        JLabel pr4 = new JLabel("50");
        JButton b4 = new JButton("Add to Cart");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p4.getText());
                price.add(pr4.getText());
            }
        });
        JPanel jp6 = new JPanel(new BorderLayout(5,5));
        jp6.add(p4, BorderLayout.LINE_START);
        jp6.add(pr4, BorderLayout.LINE_END);
        jp6.add(b4, BorderLayout.SOUTH);
        frame.add(jp6);

        JLabel p5 = new JLabel("Dengue");
        JLabel pr5 = new JLabel("400");
        JButton b5 = new JButton("Add to Cart");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p5.getText());
                price.add(pr5.getText());
            }
        });
        JPanel jp8 = new JPanel(new BorderLayout(5,5));
        jp8.add(p5, BorderLayout.LINE_START);
        jp8.add(pr5, BorderLayout.LINE_END);
        jp8.add(b5, BorderLayout.SOUTH);
        frame.add(jp8);

        JLabel c2 = new JLabel("Nutrition products");
        c2.setFont(new Font(c2.getName(), Font.BOLD, 16));
        JPanel jp7 = new JPanel(new BorderLayout(5, 15));
        jp7.add(c2, BorderLayout.NORTH);
        frame.add(jp7);

        JLabel p6 = new JLabel("Bournvita");
        JLabel pr6 = new JLabel("250");
        JButton b6 = new JButton("Add to Cart");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p6.getText());
                price.add(pr6.getText());
            }
        });
        JPanel jp9 = new JPanel(new BorderLayout(5,5));
        jp9.add(p6, BorderLayout.LINE_START);
        jp9.add(pr6, BorderLayout.LINE_END);
        jp9.add(b6, BorderLayout.SOUTH);
        frame.add(jp9);

        JLabel p7 = new JLabel("Protein Powder");
        JLabel pr7 = new JLabel("600");
        JButton b7 = new JButton("Add to Cart");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p7.getText());
                price.add(pr7.getText());
            }
        });
        JPanel jp10 = new JPanel(new BorderLayout(5,5));
        jp10.add(p7, BorderLayout.LINE_START);
        jp10.add(pr7, BorderLayout.LINE_END);
        jp10.add(b7, BorderLayout.SOUTH);
        frame.add(jp10);

        JLabel p8 = new JLabel("Horlicks");
        JLabel pr8 = new JLabel("350");
        JButton b8 = new JButton("Add to Cart");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                products.add(p8.getText());
                price.add(pr8.getText());
            }
        });
        JPanel jp11 = new JPanel(new BorderLayout(5,5));
        jp11.add(p8, BorderLayout.LINE_START);
        jp11.add(pr8, BorderLayout.LINE_END);
        jp11.add(b8, BorderLayout.SOUTH);
        frame.add(jp11);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        frame.setTitle("MedStore");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(100, 25, 960, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Home {
    public static void main(String[] args) {

        View h = new View();
    }
}