import java.util.Scanner;

class ass1_8{
	public static void main(String[]args){
		double sum=1.0;
		System.out.println("Enter the range: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		for(int i=1;i<=n;i++){
			sum = sum + Math.pow(x,i);
		}
		System.out.println("sum of the seires :" + sum);
	}
}