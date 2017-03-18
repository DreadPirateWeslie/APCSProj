/**
 * Created by student on 3/16/2017.
 */
public class IllegalPetInformationException extends Exception {
    public IllegalPetInformationException(){
        super("That Pet information is invalid");
    }
    public IllegalPetInformationException(String message) {super("That Pet information is invalid: " + message);}
}
