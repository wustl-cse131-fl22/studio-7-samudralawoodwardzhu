/**
 * 
 */
package studio7;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author RamyaSamudrala
 *
 */
public class Rectangle {

	/**
	 * @param args
	 */
	private double length;
	private double width;
	
	public Rectangle(double l,double w) {
		 
		this.length = l;
		this.width = w;
	
	}
	
	public double setArea() {
		return this.length*this.width;
	}
	
	public double setParameter() {
		double lengthTwo = this.length*2;
		double WidthTwo = this.width*2;
		double param = lengthTwo+WidthTwo;
		return param;
	}
	
	public boolean isSmallerThan(Rectangle obj) {
		if (obj.setArea() > this.setArea()){
			return true;
		}
		else
		{
			return false;
		}
	}
		
	public boolean isASquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;

		}
		
	
	}
	
	public void drawARectangle() {
		StdDraw.filledRectangle(0.5,0.5, this.width/2, this.length/2);
	}
	
	
	public static void main(String[] args) {
		 Rectangle name = new Rectangle(.4, .5);
		 Rectangle compare = new Rectangle(.8, .2);
		System.out.println(name.setArea());
		System.out.println(name.setParameter());
		name.drawARectangle();
		
		
		 
		 
	}

}
