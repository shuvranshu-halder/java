import java.util.Scanner;

public class ass1_12 {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter Starting Number : ");
        	int start = sc.nextInt();

	        System.out.print("Enter Ending Number : ");
        	int end = sc.nextInt();

	        System.out.println("Prime numbers between " + start + " and " + end + " are : ");
        	int temp;
        	for (int i = start; i <= end; i++) {
            		temp = 0;
            		for (int j = 1; j <= i; j++) {
                		if (i % j == 0) {
                    		temp=temp+ 1;
                		}
            		}
            		if (temp==2)
			{
                		System.out.println(i);
            		}
        	}
    	}
}