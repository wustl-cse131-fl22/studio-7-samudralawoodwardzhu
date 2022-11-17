/**
 * 
 */
package studio7;

/**
 * @author RamyaSamudrala
 *
 */
public class Fraction {

	/**
	 * @param args
	 */
	
	public double denominator;
	public double numerator;
	public double finalfraction;
	
	public Fraction(double d,double n) {
		denominator = d;
		numerator = n;
		finalfraction = n/d;
		
	}
	

	public Fraction addFrac(Fraction other)
	{
		if (this.denominator != other.denominator) {
			double newD = this.denominator*other.denominator;
			double cross = this.numerator * other.denominator;
			double cross2 = other.numerator * this.denominator;
			double newN =  cross+cross2;
			return new Fraction(newD, newN);
		}
		else {
			
			double newN = this.numerator + other.numerator;
			return new Fraction(this.denominator, newN);

		}
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction name = new Fraction(2,1);
		Fraction newF = new Fraction(2,1);

		System.out.println(name.addFrac(newF));
		
		
	}

}
