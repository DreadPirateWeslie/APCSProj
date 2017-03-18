import java.io.FileNotFoundException;

/**
 * Created by student on 3/14/2017.
 */
public class PetTester {

    public static void main(String[] args){
        AnimalHospital hospital;
        try{
            hospital = new AnimalHospital("C:\\Users\\student\\IdeaProjects\\AnimalHospitalProject\\src\\PetAnimalFile.txt");
            System.out.println(hospital.getPetInfoByName("ace"));

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IllegalPetInformationException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalEmailException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

}
