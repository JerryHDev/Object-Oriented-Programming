// Jerry Huang
// Period 4
// Project 11.1
// GeometricObject Superclass

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	//constructors
	public GeometricObject() {
		dateCreated = new Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on " + dateCreated + "\nColor: " + color + " and filled: " + filled;
	}
	
}