package Assignment1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class femaleframe extends JFrame implements ActionListener{
		private static final long serialVersionUID = 1L;
		   Signup up;
		   int logincheck=0,bp1=0,bp2=0,bp3=0,bp4=0,bp5=0,bp6=0,bp7=0,
				   bp8=0,bp9=0,bp10=0;
		   int itemno =0;
	       JFrame frame2 = new JFrame();
	       JButton back,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,cartbtn,acc;
	       JPanel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	       JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,item;
	       JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	       public JLabel main;
	  femaleframe(){
		   ImageIcon back1 = new ImageIcon("back.jpg");
		   ImageIcon f1 = new ImageIcon("6.jpg");
		   ImageIcon f2 = new ImageIcon("7.jpg");
		   ImageIcon f3 = new ImageIcon("8.jpg");
		   ImageIcon f4 = new ImageIcon("9.jpg");
		   ImageIcon f5 = new ImageIcon("10.jpg");
		   ImageIcon fc1 = new ImageIcon("11.jpg");
		   ImageIcon fc2 = new ImageIcon("12.jpg");
		   ImageIcon fc3 = new ImageIcon("13.jpg");
		   ImageIcon fc4 = new ImageIcon("14.jpg");
		   ImageIcon fc5 = new ImageIcon("15.jpg");
		   ImageIcon cartimg = new ImageIcon("cart.jpg");
		   
		   l1 = new JLabel();
		   l2 = new JLabel();
		   l3 = new JLabel();
		   l4 = new JLabel();
		   l5 = new JLabel();
		   l6 = new JLabel();
		   l7 = new JLabel();
		   l8 = new JLabel();
		   l9 = new JLabel();
		   l10 = new JLabel();
		   main = new JLabel();
		   item = new JLabel("0");
		   
		   b1 = new JPanel();
		   b2 = new JPanel();
		   b3 = new JPanel();
		   b4 = new JPanel();
		   b5 = new JPanel();
		   b6 = new JPanel();
		   b7 = new JPanel();
		   b8 = new JPanel();
		   b9 = new JPanel();
		   b10 = new JPanel();
		  
		   t1 = new JLabel("MRP 1799");
		   t2 = new JLabel("MRP 2999");
		   t3 = new JLabel("MRP 1350");
		   t4 = new JLabel("MRP 1975");
		   t5 = new JLabel("MRP 1299");
		   t6 = new JLabel("MRP 1500");
		   t7 = new JLabel("MRP 700");
		   t8 = new JLabel("MRP 1050");
		   t9 = new JLabel("MRP 2000");
		   t10 = new JLabel("MRP 569");
		   
		   item.setFont(new Font("Roboto",Font.BOLD,20));
		   item.setForeground(Color.RED);
		   main.setFont(new Font("Roboto",Font.BOLD,30));
		   t1.setFont(new Font("Roboto",Font.BOLD,15));
		   t2.setFont(new Font("Roboto",Font.BOLD,15));
		   t3.setFont(new Font("Roboto",Font.BOLD,15));
		   t4.setFont(new Font("Roboto",Font.BOLD,15));
		   t5.setFont(new Font("Roboto",Font.BOLD,15));
		   t6.setFont(new Font("Roboto",Font.BOLD,15));
		   t7.setFont(new Font("Roboto",Font.BOLD,15));
		   t8.setFont(new Font("Roboto",Font.BOLD,15));
		   t9.setFont(new Font("Roboto",Font.BOLD,15));
		   t10.setFont(new Font("Roboto",Font.BOLD,15));
		   
		   b1.setBounds(0  , 395, 190, 290);
		   b2.setBounds(200, 395, 190, 290);
		   b3.setBounds(400, 395, 190, 290);
		   b4.setBounds(600, 395, 190, 290);
		   b5.setBounds(800, 395, 190, 290);
		   b6.setBounds(0  , 55, 190, 290);
		   b7.setBounds(200, 55, 190, 290);
		   b8.setBounds(400, 55, 190, 290);
		   b9.setBounds(600, 55, 190, 290);
		   b10.setBounds(800,55, 190, 290);
		   
		   
		   l1.setIcon(f1);
		   l2.setIcon(f2);
		   l3.setIcon(f3);
		   l4.setIcon(f4);
		   l5.setIcon(f5);
		   l6.setIcon(fc1);
		   l7.setIcon(fc2);
		   l8.setIcon(fc3);
		   l9.setIcon(fc4);
		   l10.setIcon(fc5);
		   
		   acc = new JButton();
		   cartbtn = new JButton();
		   back = new JButton();
		   q1 = new JButton("Add to cart");
		   q2 = new JButton("Add to cart");
		   q3 = new JButton("Add to cart");
		   q4 = new JButton("Add to cart");
		   q5 = new JButton("Add to cart");
		   q6 = new JButton("Add to cart");
		   q7 = new JButton("Add to cart");
		   q8 = new JButton("Add to cart");
		   q9 = new JButton("Add to cart");
		   q10 = new JButton("Add to cart");
		   
		   acc.setBounds(915, 0, 50,50);
		   cartbtn.setBounds(850, 0,50, 50);
		   back.setBounds(0, 0, 50, 50);
		   q1.setBounds(0  ,   330, 190, 50);
		   q2.setBounds(200  , 330, 190, 50);
		   q3.setBounds(400  , 330, 190, 50);
		   q4.setBounds(600  , 330, 190, 50);
		   q5.setBounds(800  , 330, 190, 50);
		   q6.setBounds(0  ,   650, 190, 50);
		   q7.setBounds(200  , 650, 190, 50);
		   q8.setBounds(400  , 650, 190, 50);
		   q9.setBounds(600  , 650, 190, 50);
		   q10.setBounds(800  ,650, 190, 50);
		   
		   item.setBounds(885,0,50, 20);
		   main.setBounds(100,0,400, 50);
		   t1.setBounds(0  ,   280, 190, 50);
		   t2.setBounds(200  , 280, 190, 50);
		   t3.setBounds(400  , 280, 190, 50);
		   t4.setBounds(600  , 280, 190, 50);
		   t5.setBounds(800  , 280, 190, 50);
		   t6.setBounds(0  ,   600, 190, 50);
		   t7.setBounds(200  , 600, 190, 50);
		   t8.setBounds(400  , 600, 190, 50);
		   t9.setBounds(600  , 600, 190, 50);
		   t10.setBounds(800  ,600, 190, 50);
		   
		    cartbtn.setIcon(cartimg);
		    back.setIcon(back1);
		    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.setLayout(null);
			frame2.setSize(1000,1000);
			frame2.setResizable(false);
			frame2.setTitle("female Shoping Store");
			
			acc.addActionListener(this);
			cartbtn.addActionListener(this);
			back.addActionListener(this);
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			q5.addActionListener(this);
			q6.addActionListener(this);
			q7.addActionListener(this);
			q8.addActionListener(this);
			q9.addActionListener(this);
			q10.addActionListener(this);
			
			
			frame2.add(main);
			frame2.add(t1);
			frame2.add(t2);
			frame2.add(t3);
			frame2.add(t4);
			frame2.add(t5);
			frame2.add(t6);
			frame2.add(t7);
			frame2.add(t8);
			frame2.add(t9);
			frame2.add(t10);
			b1.add(l1);
			b2.add(l2);
			b3.add(l3);
			b4.add(l4);
			b5.add(l5);
			b6.add(l6);
			b7.add(l7);
			b8.add(l8);
			b9.add(l9);
			b10.add(l10);
			frame2.add(item);
			frame2.add(acc);
			frame2.add(cartbtn);
			frame2.add(q1);
			frame2.add(q2);
			frame2.add(q3);
			frame2.add(q4);
			frame2.add(q5);
			frame2.add(q6);
			frame2.add(q7);
			frame2.add(q8);
			frame2.add(q9);
			frame2.add(q10);
			frame2.add(back);
			frame2.add(b1);
			frame2.add(b2);
			frame2.add(b3);
			frame2.add(b4);
			frame2.add(b5);
			frame2.add(b6);
			frame2.add(b7);
			frame2.add(b8);
			frame2.add(b9);
			frame2.add(b10);
			
			frame2.setVisible(true);
			
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cartbtn) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");
			}
		else {
			main.setText("Welcome back, "+globel.mainname);
				new cart();
			}
		  	
		}
		if(e.getSource()==back) {
			frame2.dispose();
		    new frame();
		}
		if(e.getSource()==q1) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");
				}				
			else {
			
				main.setText("Welcome back, "+globel.mainname);
				bp1++;
				   if(bp1%2!=0) {
			           q1.setText("Added");
			           itemno++;
			           item.setText(""+itemno+"");}
			      else {
			    	  itemno--;
			           item.setText(""+itemno+"");
				     q1.setText("Add to cart");}}
			
		}
	 if(e.getSource()==q2) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);
				bp2++;
			   if(bp2%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q2.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q2.setText("Add to cart");}}
		}
		if(e.getSource()==q3) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);
				bp3++;
			   if(bp3%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q3.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q3.setText("Add to cart");}}
		}
		if(e.getSource()==q4) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp4++;
			   if(bp4%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q4.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q4.setText("Add to cart");}}
		}
		if(e.getSource()==q5) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp5++;
			   if(bp5%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q5.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q5.setText("Add to cart");}}
		}
		if(e.getSource()==q6) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp6++;
			   if(bp6%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q6.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q6.setText("Add to cart");}
		}}
		if(e.getSource()==q7) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp7++;
			   if(bp7%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q7.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q7.setText("Add to cart");}
		}}
		if(e.getSource()==q8) {
			if(globel.mainname==null) {
				
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp8++;
				if(bp8%2!=0) {itemno++;
		           item.setText(""+itemno+"");
			q8.setText("Added");}
				else {itemno--;
		           item.setText(""+itemno+"");
					q8.setText("Add to cart");
				}
				
			}
		}
		if(e.getSource()==q9) {
			if(globel.mainname==null) {
			
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp9++;
				if(bp9%2!=0) {itemno++;
		           item.setText(""+itemno+"");
			q9.setText("Added");}
			else {itemno--;
	           item.setText(""+itemno+"");
				q9.setText("Add to cart");}
			}
		}
		if(e.getSource()==q10) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else {
				main.setText("Welcome back, "+globel.mainname);bp10++;
			   if(bp10%2!=0) {itemno++;
	           item.setText(""+itemno+"");
		           q10.setText("Added");}
		      else {itemno--;
	           item.setText(""+itemno+"");
			     q10.setText("Add to cart");}
		     }}	
		if(e.getSource()==acc) {
			if(globel.mainname==null) {
				new Signup();
				main.setText("");}
			else{new account();}
		}
	}
}
