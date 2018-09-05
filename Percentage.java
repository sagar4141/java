import java.util.*;

public class Percentage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your total number of subject:");
		int[] marks = new int[s.nextInt()];
		System.out.println("Enter your marks:");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = s.nextInt();
		}
		

		int totalmarks = 0;
		for (int m : marks) {
			totalmarks = totalmarks + m;
		}
		int noOfObject = marks.length;
		float avg = (float)(totalmarks / noOfObject);
		
		
		double percentage=(float)((float)totalmarks/(marks.length*100))*100;
		
		
		System.out.println("Average of numbers:" + avg);
		System.out.println("percentage  of marks:" + percentage);

	}

}
