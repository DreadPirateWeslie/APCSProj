/**
 * Created by student on 3/7/2017.
 */
public class Pet implements Boardable{

    public String name;
    public String ownerName;
    public String color;
    public String ownerEmail;
    protected int gender;

    

    @Override
    public void setBoardStart(int month, int day, int year) {

    }

    @Override
    public void setBoardEnd(int month, int day, int year) {

    }

    @Override
    public boolean boarding(int month, int day, int year) {
        return false;
    }
}
