package util;


public class Calculator {
	
	public  final double PI=3.14159; // Final ele não pode mudar (O valor vai ser constante)
	
	public  double circumference(double radius) {
		return 2*PI*radius;
	}
	
	public  double volume(double radius) {
		return  (4*PI*(radius*radius*radius))/3;
	}


}
