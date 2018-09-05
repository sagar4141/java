import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your array size:");
	int []mark=new int[s.nextInt()];
	System.out.println("enter your array elements:");
	for(int i=0;i<mark.length;i++){
			mark[i]=s.nextInt();
			}
	
	System.out.println("Size" +mark.length);
	for(int i=0; i<mark.length;i++){
		int m=mark[i];
		System.out.println(m);
	}
	}

}
