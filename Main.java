import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�g��:");
		double a = sc.nextDouble()/100;
		System.out.print("�̏d:");
		double b = sc.nextDouble();
		double c = b / (a*a);
		c = (Math.floor(c*100))/100;
		System.out.println(c);
	}	
}
