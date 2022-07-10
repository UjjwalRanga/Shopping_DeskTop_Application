package Assignment1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
	JButton button1,button2;
	JLabel label = new JLabel("Select your Choice");
	frame(){
		ImageIcon male = new ImageIcon("male.jpg");
		ImageIcon female = new ImageIcon("female.jpg");
		label.setBackground(Color.cyan);
		label.setBounds(0,0,1000,75);
		label.setHorizontalAlignment(JLabel.CENTER);
	    label.setFont(new Font("Roboto",Font.PLAIN,50));
		button1 = new JButton();
		button2 = new JButton();
		button1.setBounds(50, 75, 400, 600);
		button2.setBounds(525, 75, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1000,1000);
		frame.setResizable(false);
		frame.setTitle("Shoping Store");
		button1.setIcon(male);
		button2.setIcon(female);
		button1.addActionListener(this);	
		button2.addActionListener(this);
		frame.add(label);
		frame.add(button1);
		frame.add(button2);
	    label.setOpaque(true);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			frame.dispose();
		    new maleframe();
		}
		if(e.getSource()==button2) {
			frame.dispose();
		    new femaleframe();
		}
	}

	

}
