/**
 * Created by student on 3/13/2017.
 */
public class IllegalEmailException extends Exception{
    public IllegalEmailException(){
        super("That email is invalid");
    }
}
