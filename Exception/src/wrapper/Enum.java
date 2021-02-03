/**
 * 
 */
package wrapper;

/**
 * @author BISMARK  OTU
 *
 */
public enum Enum {
	
	Emmerson(10), Dedrum(34), commonwheat(50), Spelt(25);
	
	private int price;

	Enum(int p) {
		price = p;
	}

	
	public int getprice() {
		
		return price;
	}
	
}
