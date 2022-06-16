
//file one
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import StudPackage.Student;
import StudPackage.Studio;

public class Start {
	public static void main(String args []) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("=========== Welcome ====================");
	         System.out.println("1.Add");
	         System.out.println("2.delete");
	        System.out.println("3.display");
	        System.out.println("4.exit");
	        System.out.println("Plz enter your choice ..");
	        
	        int c=Integer.parseInt(br.readLine());
	        
	       if(c==1) {
	    	   // add
	    	   System.out.println("Enter your name: ");
	    	   String name=br.readLine();
	    	   
	    	   System.out.println("Enter your phone :");
	    	   String phone=br.readLine();
	    	   
	    	   System.out.println("Enter your city :");
	    	   String city=br.readLine();
	    	   
	    	   
	    	   Student st=new Student(name,phone,city);
	    	   
	    	   boolean answer=Studio.insertDio(st);
	    	   
	    	   if(answer) {
	    		   System.out.println("inserted successfully");
	    	   }
	    	   else {
	    		   System.out.println("Somthing is wrong data not inserted");
	    	   }
	    	   
	    	   
	    	   System.out.println(st);
	    	   
	    	   
	       }
	       else if(c==2) {
	    	   //delete
	    	   System.out.println("plz enter the index no. which is delete--:");
	    	   int userId=Integer.parseInt(br.readLine());
	    	   boolean del=Studio.DeleteDioStud(userId);
	    	   
	    	   if(del) {
	    		   System.out.println("deleted succsessfully...");
	    	   }else {
	    		   System.out.println("not deleted succsessfully try agin latter.........");
	    	   }
	    	   
	       }
	       else if(c==3) {
	    	   //dispaly
	    	   
	    	   Studio.ShowAllState();
	    	   
	    	   
	       }
	       else if(c==4) {
	    	   // exit
	    	   break;
	       }
	       
	        
			
		}
		System.out.println("your are existed succsessfully thank you....");
		
	}

}
