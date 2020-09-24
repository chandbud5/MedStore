import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class carts{
    JFrame frame=new JFrame("CART");
    Container co=frame.getContentPane();
    JLabel lhead,ldis,lquan,lprice,lor,lship,lsubto,ltotal,tship,ttotal,tquan1,tsubto,tp1,tr1;
    JTextArea tcoup;
    JButton cont,check,coup;
    carts()
    {
        String s, p, r, temp, item, pr;
        int index, i=0, total=0, n, amount;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> quant = new ArrayList<>();
        ArrayList<String> cost = new ArrayList<>();

        n = View.products.size();
        for(int j=0; j<n; j++){
            item = View.products.get(j);
            temp = View.price.get(j);
            index = names.indexOf(item);
            if(index == -1){
                names.add(item);
                quant.add("1");
                cost.add(temp);
            }
            else {
                pr = quant.get(index);
                pr = Integer.toString(Integer.parseInt(pr)+1);
                quant.set(index, pr);

                temp = cost.get(index);
                temp = Integer.toString(Integer.parseInt(temp) + Integer.parseInt(View.price.get(j)));
                cost.set(index, temp);
            }
        }

        while(i<names.size()){
            s = names.get(i);
            p = quant.get(i);
            r = cost.get(i);

            total = total+Integer.parseInt(r);

            tp1=new JLabel(s);
            tp1.setBounds(50,120+(30*i),100,20);
            co.add(tp1);

            tquan1=new JLabel(p);
            tquan1.setBounds(250,120+(30*i),100,20);
            co.add(tquan1);

            tr1=new JLabel(r);
            tr1.setBounds(400,120+(30*i),100,20);
            co.add(tr1);
            i++;
        }

        amount = total+50;

        frame.setBounds(100, 25, 960, 600);
        co.setLayout(null);

        Font f=new Font("Times New Roman",Font.BOLD,30);
        lhead =new JLabel("Shopping Cart");
        lhead.setBounds(300,10,400,35);
        lhead.setFont(f);
        co.add(lhead);

        ldis =new JLabel("Product Details");
        ldis.setBounds(50,70,100,20);
        co.add(ldis);

        lquan =new JLabel("Quantity");
        lquan.setBounds(250,70,100,20);
        co.add(lquan);

        lprice=new JLabel("Price");
        lprice.setBounds(400,70,100,20);
        co.add(lprice);

        lor=new JLabel("Order Summary");
        lor.setBounds(650,75,100,20);
        co.add(lor);

        lship=new JLabel("Subtotal");
        lship.setBounds(600,125,100,20);
        co.add(lship);

        lsubto=new JLabel("Shipping Price");
        lsubto.setBounds(600,175,100,20);
        co.add(lsubto);

        ltotal=new JLabel("Total");
        ltotal.setBounds(600,225,100,20);
        co.add(ltotal);

        tsubto=new JLabel(Integer.toString(total));
        tsubto.setBounds(700,125,100,20);
        co.add(tsubto);

        tship=new JLabel("50");
        tship.setBounds(700,175,100,20);
        co.add(tship);

        ttotal=new JLabel(Integer.toString(amount));
        ttotal.setBounds(700,225,100,20);
        co.add(ttotal);

        check=new JButton("Checkout");
        check.setBounds(650,275, 100, 40);
        co.add(check);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CheckOut();
                frame.dispose();
            }
        });

        cont=new JButton("Continue Shopping");
        cont.setBounds(250,450,200,40);
        co.add(cont);

        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View();
                frame.dispose();
            }
        });

        tcoup=new JTextArea("Code Here");
        tcoup.setBounds(50,400,300,30);
        co.add(tcoup);

        coup=new JButton("Apply Code");
        coup.setBounds(370,400, 140, 30);
        co.add(coup);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class CheckOut extends JFrame{
    CheckOut(){
        JFrame frame = new JFrame("Thank You");
        JLabel l = new JLabel("Thank You! your Order is placed. Our Drones will deliver your things Soon");
        JButton b = new JButton("Return Home");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View.products.clear();
                View.price.clear();
                new View();
                frame.dispose();
            }
        });

        l.setFont(new Font(l.getName(), Font.PLAIN, 26));

        frame.add(l);
        frame.add(b);
        frame.setBounds(100, 25, 960, 600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class cart{
    public static void main(String[] args) {
        carts cr = new carts();
    }
}