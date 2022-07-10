package Assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class globel {
    static String mainname,id1,date,pass1;
	String name;
	ArrayList<String> maindata = new ArrayList<String>();
	
	globel(String id,String pass){
		
		try {
			
			Scanner s =new Scanner(new File("Data.txt"));
			
			    while(s.hasNextLine()) {
				maindata.add(s.nextLine());}
			    s.close(); 
		   for(int i=0;i<maindata.size();i++) {
		    if((maindata.get(i).equals(id))&&(maindata.get(i+1).equals(pass))) {
			
		    mainname=maindata.get(i-2);
		    date = maindata.get(i-1);
		    id1 = maindata.get(i);
		    pass1= maindata.get(i+1);
		    }
		 
		     } 
		   }
			catch(Exception e) {}
	}
	globel(){
		
			
		
    }
	public static void name() {	
		mainname ="";
	}
	public static void  id() {
		 id1 = "";
	}
	public static void  date() {
		 date = "";
	}
	public static void  pass() {
		 pass1= "";
	}
}
