import com.sun.media.sound.InvalidDataException;
import sun.java2d.loops.GeneralRenderer;

import java.util.GregorianCalendar;

/**
 * Created by student on 3/7/2017.
 */
public class Pet implements Boardable{

    private String name;
    private String ownerName;
    private String color;
    private String ownerEmail;
    protected String gender;

    //Boardable data members
    private GregorianCalendar boardStart;
    private GregorianCalendar boardEnd;


    public Pet(String name, String ownerName, String ownerEmail, String color) throws IllegalEmailException{
        this.name = name;
        this.ownerName = ownerName;
        if(ownerEmail.contains("@") && ownerEmail.indexOf(".") > 0 && ownerEmail.indexOf(".") != ownerEmail.length()
                && ownerEmail.lastIndexOf(".") >= ownerEmail.indexOf("@")
                && !ownerEmail.contains("..") && !ownerEmail.contains("@@")
                && ownerEmail.indexOf("@") == ownerEmail.lastIndexOf("@")
        ){
            this.ownerEmail = ownerEmail;
        }else{
            throw new IllegalEmailException();
        }
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getColor(){
        return color;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public String getOwnerEmail(){
        return ownerEmail;
    }

    public String toString(){
        return
                "Name: " + name +
                ", Owner's Name: " + ownerName +
                ", Owner's email: " + ownerEmail +
                ", Color: " + color +
                ", Gender: " + gender;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        boardStart = new GregorianCalendar(year, month, day);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        boardEnd = new GregorianCalendar(year, month, day);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        GregorianCalendar boardingDate = new GregorianCalendar(year, month, day);
        if(boardingDate.after(boardEnd) || boardingDate.before(boardStart)){
            return false;
        }
        return true;
    }


}
