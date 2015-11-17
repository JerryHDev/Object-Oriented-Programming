//Jerry Huang
//Period 4
//Circle2D Class
//Project 10.11

public class Circle2D {
	//center point of the circle
	private double X, Y;
	//radius
	private double radius;
	
	public Circle2D() {
		X = 0;
		Y = 0;
		radius = 1;
	}
	
	public Circle2D(double newX, double newY, double newRadius) {
		X = newX;
		Y = newY;
		radius = newRadius;
	}
	
	public double getX() {
		return X;
	}
	
	public double getY() {
		return Y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	public boolean contains(double x, double y) {
		double distance = Math.sqrt((x - X)*(x - X) - (y - Y)*(y - Y));
		if (distance < radius) 
			return true;
		return false;
	}
	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt((circle.X - X)*(circle.X - X) - (circle.Y - Y)*(circle.Y - Y));
		double remainDistance = radius - distance;
		if (circle.radius <= remainDistance) 
			return true;
		return false;
	}
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt((circle.X - X)*(circle.X - X) - (circle.Y - Y)*(circle.Y - Y));
		if (distance < (radius + circle.radius))
			return true;
		return false;
	}
	
	
}