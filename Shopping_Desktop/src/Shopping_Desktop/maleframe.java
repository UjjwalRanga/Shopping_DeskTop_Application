package Assignment1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class maleframe extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	int logincheck=0;
	JFrame frame1 = new JFrame();
	JButton back;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	 maleframe(){
		 ImageIcon back1 = new ImageIcon("back.jpg");
		   ImageIcon f1 = new ImageIcon("1.jpg");
		   ImageIcon f2 = new ImageIcon("2.jpg");
		   ImageIcon f3 = new ImageIcon("3.jpg");
		   ImageIcon f4 = new ImageIcon("4.jpg");
		   ImageIcon f5 = new ImageIcon("5.jpg");
		   ImageIcon fc1 = new ImageIcon("16.jpg");
		   ImageIcon fc2 = new ImageIcon("17.jpg");
		   ImageIcon fc3 = new ImageIcon("18.jpg");
		   ImageIcon fc4 = new ImageIcon("19.jpg");
		   ImageIcon fc5 = new ImageIcon("20.jpg");
		   
		    back = new JButton();
		    b1 = new JButton();
		       b2 = new JButton();
			   b3 = new JButton();
			   b4 = new JButton();
			   b5 = new JButton();
			   b6 = new JButton();
			   b7 = new JButton();
			   b8 = new JButton();
			   b9 = new JButton();
			   b10 = new JButton();
			   
		    back.setBounds(0, 0, 50, 50);
		    back.setIcon(back1);
			   b1.setBounds(0  , 385, 190, 290);
			   b2.setBounds(200, 385, 190, 290);
			   b3.setBounds(400, 385, 190, 290);
			   b4.setBounds(600, 385, 190, 290);
			   b5.setBounds(800, 385, 190, 290);
			   b6.setBounds(0  , 55, 190, 290);
			   b7.setBounds(200, 55, 190, 290);
			   b8.setBounds(400, 55, 190, 290);
			   b9.setBounds(600, 55, 190, 290);
			   b10.setBounds(800,55, 190, 290);
			   
		       b1.setIcon(f1);
			   b2.setIcon(f2);
			   b3.setIcon(f3);
			   b4.setIcon(f4);
			   b5.setIcon(f5);
			   b6.setIcon(fc1);
			   b7.setIcon(fc2);
			   b8.setIcon(fc3);
			   b9.setIcon(fc4);
			   b10.setIcon(fc5);
		    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setLayout(null);
			frame1.setSize(1000,1000);
			frame1.setResizable(false);
			frame1.setTitle("Male Shoping Store");
			
			back.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b10.addActionListener(this);
			
			frame1.add(back);
			frame1.add(b1);
			frame1.add(b2);
			frame1.add(b3);
			frame1.add(b4);
			frame1.add(b5);
			frame1.add(b6);
			frame1.add(b7);
			frame1.add(b8);
			frame1.add(b9);
			frame1.add(b10);
			frame1.setVisible(true);
			
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			frame1.dispose();
		    new frame();
		}
		if(e.getSource()==b1) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
		
			}
			
		}
		if(e.getSource()==b2) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b3) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b4) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b5) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b6) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b7) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b8) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b9) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
		if(e.getSource()==b10) {
			if(logincheck==0) {
				new Signup();
				logincheck++;
			}
			
		}
	}

}
