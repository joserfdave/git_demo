package No_11;

public class SimpleGeometricObject_1 {
	private String color = "write";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object*/
	public SimpleGeometricObject_1() {
		dateCreated = new java.util.Date();
	}
	
	public SimpleGeometricObject_1(String color,boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/**Return color*/
	public String getcolor() {
		return color;
	}
	/** Set a new color */
	public void setcolor(String color) {
		this.color = color;
	}
	
	/** Return filled. Since filled is boolean,its getter method is named isFilled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**Set a new filled */
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	/** Get dateCreated */
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	/** Return a string representation of this object */
	public String toString() {
		return "created on" + dateCreated + "\ncolor" + color + " and filled: " + filled;
	}
}
