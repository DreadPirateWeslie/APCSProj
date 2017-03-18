/**
 * 
 * @author Tommy Nguyen and Grant Finnegan
 * @version 3/13/2017
 *
 */
public class Cat extends Pet {
	//Instance variables
	String hairLength;

	public Cat(String name, String ownerName, String ownerEmail, String color, String hairLength)throws IllegalEmailException{
		super(name, ownerName, ownerEmail, color);
		this.hairLength = hairLength;
	}

	/**
	 * @return the hairLength
	 */
	public String getHairLength() {
		return hairLength;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [hairLength=" + hairLength + ", gender=" + gender + ", getHairLength()=" + getHairLength()
				+ ", getName()=" + getName() + ", getOwnerName()=" + getOwnerName() + ", getColor()=" + getColor()
				+ ", getGender()=" + getGender() + ", getOwnerEmail()=" + getOwnerEmail() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
