/**
 * Created by student on 3/7/2017.
 */
public interface Boardable {

    void setBoardStart(int month, int day, int year);

    void setBoardEnd(int month, int day, int year);

    boolean boarding(int month, int day, int year);

}
