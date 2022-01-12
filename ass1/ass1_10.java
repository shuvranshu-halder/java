import java.util.Scanner;

class ass1_10{
	public static void main(String args[]){
		double secondRoot = 0, firstRoot = 0;
      		Scanner sc = new Scanner(System.in);
     		System.out.println("Enter the value of a ::");
     		double a = sc.nextDouble();
      		System.out.println("Enter the value of b ::");
      		double b = sc.nextDouble();

     		System.out.println("Enter the value of c ::");
     		double c = sc.nextDouble();

      		double determinant = (b*b)-(4*a*c);
      		double sq = Math.sqrt(determinant);

      		if(determinant>0.0){
         		firstRoot = (-b + sq)/(2.0*a);
         		secondRoot = (-b - sq)/(2.0*a);
         		System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
      		}else if(determinant == 0){
         		System.out.println("Root is :: "+(-b /(2*a)));
      		}else{
			 System.out.println("Roots are not real.");
		}  
   	}
}