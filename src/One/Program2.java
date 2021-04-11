package One;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static final double PI=3.14159; // Final ele não pode mudar (O valor vai ser constante)
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius=sc.nextDouble();
		
		double c=circumference(radius);
		
		double v=volume(radius);
		
		System.out.printf("Circumference: %.2f%n ", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();

	}
	
	public static double circumference(double radius) {
		return 2*PI*radius;
	}
	
	public static double volume(double radius) {
		return  (4*PI*(radius*radius*radius))/3;
	}

}
