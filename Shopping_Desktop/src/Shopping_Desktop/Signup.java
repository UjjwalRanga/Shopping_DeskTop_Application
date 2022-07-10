package Assignment1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Signup extends JFrame implements ActionListener{
	public String mainname;
	private static final long serialVersionUID = 1L;
	public int logincheck=0;
	JFrame signup = new JFrame();
	public JButton loginbutton2;
	String mname,mdate,mid,mpass,mlid,mlpass,k;
	TextField name  = new TextField();
	TextField date  = new TextField();
	TextField id    = new TextField();
	TextField pass  = new TextField();
	TextField id2   = new TextField();
	TextField pass2 = new TextField();
	JLabel name1,date1,id1,pass1,main1,main2,id11,pass11,wpass,rpass;
	JButton button;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;
	ArrayList<String> maindata = new ArrayList<String>();
 Signup(){
    signup.setDefaultCloseOperation(Signup.DISPOSE_ON_CLOSE);
	signup.setLayout(new FlowLayout());
	
	p1 = new JPanel();
	p1.setBounds(0, 100,400, 100);
	p2 = new JPanel();
	p2.setBounds(0, 200,400, 100);
	p3 = new JPanel();
	p3.setBounds(0, 300,400, 100);
	p4 = new JPanel();
	p4.setBounds(0, 400,400, 100);
	p5 = new JPanel();
	p5.setBounds(0, 500,400, 100);
	p6 = new JPanel();
	p6.setBounds(0, 600,400, 100);
	p7 = new JPanel();
	p7.setBounds(0, 700,400, 100);
	p8 = new JPanel();
	p8.setBounds(0, 800,400, 100);
	p9 = new JPanel();
	p9.setBounds(0, 900,400, 100);
	p10 = new JPanel();
	p10.setBounds(0, 1000,400, 100);
	p11 = new JPanel();
	p11.setBounds(0, 1000,400, 100);
	
	main1 = new JLabel("For Sign Up Enter your Details ");
	main1.setHorizontalAlignment(JLabel.CENTER);
    main1.setFont(new Font("Roboto",Font.PLAIN,20));
    
    main2 = new JLabel("For Sign In Enter your Details ");
	main2.setHorizontalAlignment(JLabel.CENTER);
    main2.setFont(new Font("Roboto",Font.PLAIN,20));
    
    wpass = new JLabel("*******Id or Password did not match*******");
	wpass.setHorizontalAlignment(JLabel.CENTER);
    wpass.setFont(new Font("Roboto",Font.PLAIN,20));
    wpass.setForeground(Color.RED);
    
    rpass = new JLabel("*******Loged in Sucessfully*******");
   	rpass.setHorizontalAlignment(JLabel.CENTER);
    rpass.setFont(new Font("Roboto",Font.PLAIN,20));
    rpass.setForeground(Color.GREEN);
       
	name1 = new JLabel("Enter your Name           ");
	date1 = new JLabel("Enter your DOB            ");
	id1   = new JLabel("Enter your Uniq ID        ");
	pass1 = new JLabel("Enter your Password ");
	id11   = new JLabel("Enter your Uniq ID        ");
	pass11 = new JLabel("Enter your Password ");
	
	name.setPreferredSize(new Dimension(155,25));
	date.setPreferredSize(new Dimension(155,25));
	id.setPreferredSize(new Dimension(155,25));
	pass.setPreferredSize(new Dimension(155,25));
	id2.setPreferredSize(new Dimension(155,25));
	pass2.setPreferredSize(new Dimension(155,25));
	
	button = new JButton();
	button.setText("Submit your Details");
	button.setFocusable(false);
	button.addActionListener(this);
	
	loginbutton2 = new JButton();
	loginbutton2.setText("  login  ");
	loginbutton2.setFocusable(false);
	loginbutton2.addActionListener(this);
	
	
	signup.setResizable(false);
	signup.setTitle("Sign Up or Sign In");
	signup.setSize(400, 500);
	signup.add(main1);
	signup.add(p1);
	p1.add(name1);
	p1.add(name);
	signup.add(p2);
	p2.add(date1);
	p2.add(date);
	signup.add(p3);
	p3.add(id1);
    p3.add(id);
    signup.add(p4);
	p4.add(pass1);
	p4.add(pass);
	signup.add(p5);
    p5.add(button);
    signup.add(p6);
    p6.add(main2);
    signup.add(p7);
    p7.add(id11);
    p7.add(id2);
     signup.add(p8);
    p8.add(pass11);
    p8.add(pass2);
    signup.add(p9);
    p9.add(loginbutton2);
    signup.add(p10);
    p10.add(wpass);
    p10.setVisible(false);
    signup.add(p11);
    p11.add(rpass);
    p11.setVisible(false);
    signup.setVisible(true);
	
}
public String signin(String id,String pass) {
	String a="0";
	
	try {
		
		Scanner s =new Scanner(new File("Data.txt"));
		
		    while(s.hasNextLine()) {
			maindata.add(s.nextLine());}
		    s.close(); 
       for(int i=0;i<maindata.size();i++) {
	    if((maindata.get(i).equals(id))&&(maindata.get(i+1).equals(pass))) {
		System.out.println("Welcome "+ maindata.get(i-2)); 
		a=maindata.get(i-2);
        logincheck = 1;
        mainname=maindata.get(i-2);
        }
	 
	     } 
       }
		catch(Exception e) {
			
		}
	return a;
}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == button) {
		mname = name.getText();
		mdate = date.getText();
		mid = id.getText();
		mpass = pass.getText();
		try {
			FileWriter wr = new FileWriter("Data.txt",true);
			wr.append(mname+"\n");
			wr.append(mdate+"\n");
			wr.append(mid+"\n");
			wr.append(mpass+"\n");
			wr.close();
		} catch (IOException q) {	
			q.printStackTrace();
		}
		button.setEnabled(false);
		name.setEditable(false);
		date.setEditable(false);
		id.setEditable(false);
		pass.setEditable(false);
		} 
	if(e.getSource() == loginbutton2) {
		mlid = id2.getText();
		mlpass = pass2.getText();
		 k=signin(mlid,mlpass);
		 new globel(mlid,mlpass);
		if(k.equals("0")) {
			p11.setVisible(false);
			p10.setVisible(true);
			
		}
		else {
			p10.setVisible(false);
			p11.setVisible(true);
			signup.dispose();
		}

	}
	
}

}

