/**
 * 
 * @author Tommy Nguyen and Grant Finnegan
 * @version 3/13/2017
 *
 */
public class Dog extends Pet{
	//instance variables
	private String size;
	
	public Dog(String name, String ownerName, String ownerEmail, String color, String size) throws IllegalEmailException {
		super(name, ownerName, ownerEmail, color);
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [size=" + size + ", gender=" + gender + ", getSize()=" + getSize() + ", getName()=" + getName()
				+ ", getOwnerName()=" + getOwnerName() + ", getColor()=" + getColor() + ", getGender()=" + getGender()
				+ ", getOwnerEmail()=" + getOwnerEmail() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
