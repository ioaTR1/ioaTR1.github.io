package adv9;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Program extends JThread{
	  
    Program(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
          
        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
                System.out.println(Math.random());
                Date date = new Date(0, 0, 0);
        		System.out.println(date);
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-mm-dd");
    
        	}
}
