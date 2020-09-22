import javax.swing.*;
import java.awt.*;

class regisForm{
    JFrame frame=new JFrame("Registration Form");
    Container c=frame.getContentPane();
    JLabel lhead,lname,lemail,lmobile,ldob,lgender,laddress,lpass,lstate;
    JTextField tname,temail,tmobile,taddress;
    JPasswordField pass;
    JRadioButton r1,r2;
    ButtonGroup gender = new ButtonGroup();
    JComboBox d,m,y,s;
    JCheckBox term;
    JButton submit,reset;

    regisForm()
    {
        c.setLayout(null);

        Font f=new Font("Times New Roman",Font.BOLD,30);
        lhead =new JLabel("Registration Form");
        lhead.setBounds(250,10,400,35);
        lhead.setFont(f);
        c.add(lhead);

        lname =new JLabel("Name");
        lname.setBounds(230,50,60,30);
        c.add(lname);

        lgender =new JLabel("Gender");
        lgender.setBounds(230,100,60,30);
        c.add(lgender);

        ldob =new JLabel("D.O.B.");
        ldob.setBounds(230,150,60,30);
        c.add(ldob);

        laddress =new JLabel("Address");
        laddress.setBounds(230,200,60,30);
        c.add(laddress);

        lstate =new JLabel("State");
        lstate.setBounds(230,260,60,30);
        c.add(lstate);

        lmobile =new JLabel("Mobile No.");
        lmobile.setBounds(230,310,60,30);
        c.add(lmobile);

        lemail =new JLabel("Email");
        lemail.setBounds(230,360,60,30);
        c.add(lemail);

        lpass =new JLabel("Password");
        lpass.setBounds(230,410,60,30);
        c.add(lpass);

        tname=new JTextField();
        tname.setBounds(310,53,225,20);
        c.add(tname);

        r1=new JRadioButton("Male");
        r1.setBounds(310,100,80,30);
        c.add(r1);

        r2=new JRadioButton("Female");
        r2.setBounds(400,100,80,30);
        c.add(r2);

        gender.add(r1);
        gender.add(r2);

        temail=new JTextField();
        temail.setBounds(310,363,225,20);
        c.add(temail);

        tmobile=new JTextField();
        tmobile.setBounds(310,313,225,20);
        c.add(tmobile);

        pass =new JPasswordField();
        pass.setBounds(310,413,225,20);
        c.add(pass);

        taddress=new JTextField();
        taddress.setBounds(310,203,225,40);
        c.add(taddress);

        String states[] = { "Gujarat", "Rajasthan", "Mumbai", "Kolkata", "New Delhi" };
        s=new JComboBox(states);
        s.setBounds(310, 260, 80, 25);
        c.add(s);

        String[] date= new String[31];
        for(int i=1;i<=31;i++)
        {
            date[i-1]=Integer.toString(i);
        }
        d=new JComboBox(date);
        d.setBounds(310, 153, 40, 25);
        c.add(d);

        String month[] = { "Jan","Feb","Mar", "Apr", "May","Jun","July","Aug","Sep","Oct","Nov","Dec" };
        m=new JComboBox(month);
        m.setBounds(365, 153, 70, 25);
        c.add(m);

        String[] year= new String[100];
        for(int i=1985;i<=2019;i++)
        {
            year[i-1985]=Integer.toString(i);
        }
        y=new JComboBox(year);
        y.setBounds(455, 153, 80, 25);
        c.add(y);

        term=new JCheckBox("I accept all terms and conditions.");
        term.setBounds(280, 450, 250, 25);
        c.add(term);

        submit=new JButton("SUBMIT");
        submit.setBounds(300, 490, 80, 25);
        c.add(submit);

        reset=new JButton("RESET");
        reset.setBounds(400, 490, 80, 25);
        c.add(reset);


        frame.setBounds(100, 25, 960, 600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
public class registration{
    public static void main(String[] args) {
        regisForm r = new regisForm();
    }
}