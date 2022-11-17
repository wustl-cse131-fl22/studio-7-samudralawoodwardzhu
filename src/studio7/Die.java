/**
 * 
 */
package studio7;

/**
 * @author RamyaSamudrala
 *
 */
public class Die {

	/**
	 * @param args
	 */
	
	
	private int numOfSides;
	
	public Die(int num) {
		 
		this.numOfSides = num;
	}
	
	public int randomRoll() {
		int num = (int)(Math.random()*this.numOfSides+1);
		return num;
	}
	
	public static void main(String[] args) {
		Die name = new Die(500);
		System.out.println(name.randomRoll());

	}

}
