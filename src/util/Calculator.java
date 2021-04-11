package util;


public class Calculator {
	
	public static final double PI=3.14159; // Final ele não pode mudar (O valor vai ser constante)
	
	public static double circumference(double radius) {
		return 2*PI*radius;
	}
	
	public static double volume(double radius) {
		return  (4*PI*(radius*radius*radius))/3;
	}


}
