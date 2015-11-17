import java.util.Scanner;

// Jerry Huang
// Period 4
// Implementation Class
// Project 11.1

public class ch11_1 {
	public static void main(String[] args) {
		// initializes variables
		double side1, side2, side3;
		String color;
		boolean isFilled;
		
		// user inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program will create a triangle object according to the inputs.");
		System.out.println("Enter the three sides of the triangle: ");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		System.out.println("Enter the color of the triangle: ");
		color = input.next();
		System.out.println("Enter a boolean value to indicate if triangle is filled: ");
		isFilled = input.nextBoolean();
		
		// creates Triangle object
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		
		// displays result
		System.out.println("Triangle: area = " + triangle.getArea() + ", perimeter = " + triangle.getPerimeter() 
				+ "\ncolor = " + triangle.getColor() + ", filled = " + triangle.isFilled());
	}
}