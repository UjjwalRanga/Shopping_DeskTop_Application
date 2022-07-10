package Assignment1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class account extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JFrame aframe = new JFrame();
	JLabel name,date,id,pass,login;
	JPanel a,b,c,d,loginpanel;
	JButton button;
	int logout;
	account(){
		 a = new JPanel();
		 b = new JPanel();
		 c = new JPanel();
		 d = new JPanel();
		 loginpanel = new JPanel();
		 
		 button = new JButton("Log out");
		 button.setFocusable(false);
		 button.addActionListener(this);
		 
		 name = new JLabel();
		 date = new JLabel();
		 id = new JLabel();
		 pass = new JLabel();
		 
		 name.setText("Account name:      " + globel.mainname);
		 date.setText("Account DOB:      " + globel.date);
		 id.setText("Account Uniqe ID:      " + globel.id1);
		 pass.setText("Account Password:      " + globel.pass1);
		 
		 name.setFont(new Font("Roboto",Font.BOLD,20));
		 date.setFont(new Font("Roboto",Font.BOLD,20));
		 id.setFont(new Font("Roboto",Font.BOLD,20));
		 pass.setFont(new Font("Roboto",Font.BOLD,20));
		 
		 a.setBounds(0,60, 400, 50);
		 b.setBounds(0,120, 400, 50);
		 c.setBounds(0,180, 400, 50);
		 d.setBounds(0,225, 400, 50);
		 loginpanel.setBounds(0, 0,400,400);
		 
		 button.setBounds(100, 250, 200, 50);
		 
		 aframe.setDefaultCloseOperation(account.DISPOSE_ON_CLOSE);
		 aframe.setTitle(globel.mainname+"'s Account information");
		 aframe.setSize(400,400);
		 aframe.setResizable(false);
		
		 a.add(name);
		 b.add(date);
		 c.add(id);
		 d.add(pass);
		 aframe.add(button);
		 aframe.add(a);
		 aframe.add(b);
		 aframe.add(c);
		 aframe.add(d);
		 
		 
		 aframe.setVisible(true);
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			if(logout==0) {
			logout++;
		    aframe.dispose();
			globel.mainname = null;
			globel.date =null;
			globel.id1 = null;
			globel.pass1 = null;
			}
			else {
				
				 new Signup();
			}
		}
		
	}
}
