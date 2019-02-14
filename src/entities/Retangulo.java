package entities;

public class Retangulo {

	public double height;
	public double width; 
	
	public double area() {
		return height*width; 
	}
	
	public double perimeter() {
		return (height*2 + width*2);
	}
	
	public double diagonal() {
		return Math.sqrt(height*height + width*width);
	}
	
	public String toString() {
		return 
				"Area = "
				+String.format("%.2f%n", area())
				+"Perimetro = "
				+String.format("%.2f%n", perimeter())
				+"Diagonal = "
				+String.format("%.2f%n", diagonal());
		
	}
	
}
