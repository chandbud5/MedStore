
import javax.swing.*;
import java.awt.*;

class carts{
	JFrame frame=new JFrame("CART");
	Container co=frame.getContentPane();
	JLabel lhead,ldis,lquan,lprice,lremove,lor,lship,lsubto,ltotal;
	JTextArea tship,ttotal,tsubto,tp1,tp2,tquan1,tquan2,tr1,tr2,tcoup;
	JButton r1,r2,cont,check,coup;
	carts()
	{
		frame.setBounds(150, 50, 800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		co.setLayout(null);
		
		Font f=new Font("Times New Roman",Font.BOLD,30);
		lhead =new JLabel("Cart");
		lhead.setBounds(300,10,400,35);
		lhead.setFont(f);
		co.add(lhead);
		
		ldis =new JLabel("Product Details");
		ldis.setBounds(50,70,100,20);
		co.add(ldis);
		
		lquan =new JLabel("Quantity");
		lquan.setBounds(180,70,100,20);
		co.add(lquan);
		
		lprice=new JLabel("Price");
		lprice.setBounds(300,70,100,20);
		co.add(lprice);
		
		lremove=new JLabel("Remove");
		lremove.setBounds(440,70,100,20);
		co.add(lremove);
		
		tp1=new JTextArea("product 1");
		tp1.setBounds(50,120,100,20);
		co.add(tp1);
		
		tp2=new JTextArea("product 2");
		tp2.setBounds(50,170,100,20);
		co.add(tp2);
		
		tquan1=new JTextArea("1");
		tquan1.setBounds(180,120,100,20);
		co.add(tquan1);
		
		tquan2=new JTextArea("1");
		tquan2.setBounds(180,170,100,20);
		co.add(tquan2);
		
		tr1=new JTextArea("250");
		tr1.setBounds(300,120,100,20);
		co.add(tr1);
		
		tr2=new JTextArea("100");
		tr2.setBounds(300,170,100,20);
		co.add(tr2);
		
		r1=new JButton("Remove");
		r1.setBounds(425,120, 80, 20);
		co.add(r1);
	
		r2=new JButton("Remove");
		r2.setBounds(425,170, 80, 20);
		co.add(r2);
		
		lor=new JLabel("Order Summary");
		lor.setBounds(600,75,100,20);
		co.add(lor);
		
		lship=new JLabel("Subtotal");
		lship.setBounds(560,125,100,20);
		co.add(lship);
		
		lsubto=new JLabel("Shipping Price");
		lsubto.setBounds(560,175,100,20);
		co.add(lsubto);
		
		ltotal=new JLabel("Total");
		ltotal.setBounds(560,225,100,20);
		co.add(ltotal);
		
		tsubto=new JTextArea("350");
		tsubto.setBounds(660,125,100,20);
		co.add(tsubto);
		
		tship=new JTextArea("50");
		tship.setBounds(660,175,100,20);
		co.add(tship);
		
		ttotal=new JTextArea("400");
		ttotal.setBounds(660,225,100,20);
		co.add(ttotal);
	
		check=new JButton("Checkout");
		check.setBounds(600,275, 100, 40);
		co.add(check);
		
		cont=new JButton("Continue Shopping");
		cont.setBounds(250,340,200,40);
		co.add(cont);
		
		tcoup=new JTextArea("Code Here");
		tcoup.setBounds(50,275,300,30);
		co.add(tcoup);
		
		coup=new JButton("Apply Code");
		coup.setBounds(370,275, 140, 30);
		co.add(coup);

	}
}
public class cart{
    public static void main(String[] args) {
    	carts cr = new carts();
    }
}

