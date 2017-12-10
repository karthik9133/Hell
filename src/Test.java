import java.util.Scanner;

public class Test {

	public static double getRandomInteger(double max, double min)
	{ 
		return ((double) (Math.random()*(max - min))) + min;
	}
	public static void main(String[] args) {
		 double i=getRandomInteger(100, 1);
		 System.out.println(i);
		 
		 Scanner sc=new Scanner(System.in);  
	     System.out.println("Enter your B value");  
		   double b=sc.nextInt();  
		   if(b<0)
		   {  
		        System.out.println("Enter Possitive Value");  
		    }
		   else if (b==0){
			   System.out.println(i);
		   }
		   else if(b>0  && b<1){
			   System.out.println(i/b);
		   }
		   else if(b>1)
		   {
			   System.out.println( Math.pow(i, b)); 
		   }

		  
		 
		 
		 
		 
	}
	

	}
	
