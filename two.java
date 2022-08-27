package adv9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.lang.model.type.ArrayType;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class two extends JThread {

	two(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {


		    
		    
			int abr = (int) Math.random(); 
			int ggg = abr *4747365;
			System.out.println(ggg);
			int a = 6; 
			int g = a * 7;
			System.out.println(g);
		
			 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(abr,ggg,g,a));
			 Collections.sort(numbers);
		       System.out.println(numbers);
	
	    System.out.println("Main thread random number started...");
	    for(int i=1; i < 6; i++)
	        new JThread(Math.random() + "  JThread " + i).start();
	    System.out.println("Main thread random number finished...");
	}
}


	


