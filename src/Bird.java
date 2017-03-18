/**
 * 
 * @author Tommy Nguyen and Grant Finnegan
 * @version 3/13/2017
 *
 */
public class Bird extends Pet{
	//Instance variables
	private boolean featherClipped;
	
	public Bird(String name, String ownerName, String ownerEmail, String color) throws IllegalEmailException{
		super(name, ownerName, ownerEmail, color);
		setClipped();
	}

	public void setClipped() {
		featherClipped = true;
	}
	
	public boolean clipped() {
		if(this.featherClipped == true) {
			System.out.println("This bird has their feathers clipped!");
			return this.featherClipped;
		} else {
			System.out.println("This bird does not have their feathers clipped!");
			return this.featherClipped;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bird [featherClipped=" + featherClipped + ", gender=" + gender + ", clipped()=" + clipped()
				+ ", getName()=" + getName() + ", getOwnerName()=" + getOwnerName() + ", getColor()=" + getColor()
				+ ", getGender()=" + getGender() + ", getOwnerEmail()=" + getOwnerEmail() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
