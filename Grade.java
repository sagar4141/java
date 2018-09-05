package gradeprogram;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your total marks:");
	int mark=s.nextInt();
	
	if(mark>=90 && mark<=100){
		System.out.println("Grade A");
		
	}else if(mark>=80 && mark<90){
		System.out.println("Grade B");
	}else if(mark>=50 && mark<80){
		System.out.println("Grade C");
	}else
	{
		System.out.println("failed");
	}
	
	
	}
	
			

	}
    
	
	


