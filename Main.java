import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("身長:");
		double a = sc.nextDouble()/100;
		System.out.print("体重:");
		double b = sc.nextDouble();
		double c = b / (a*a);
		c = (Math.floor(c*100))/100;
		System.out.println(c);
		System.out.print("身長:");
		double a2 = sc.nextDouble()/100;
		System.out.print("体重:");
		double b2 = sc.nextDouble();
		double c2 = b2 / (a2*a2);
		c2 = (Math.floor(c2*100))/100;
		System.out.println(c2);
	}	
}
