package Assignment1;
import javax.swing.JFrame;

public class cart extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JFrame cframe = new JFrame();
	
	  cart(){
		
		 cframe.setDefaultCloseOperation(cart.DISPOSE_ON_CLOSE);
		 cframe.setTitle(globel.mainname+"'s Cart");
		 cframe.setSize(400,500);
		 cframe.setVisible(true);
	  }
}
