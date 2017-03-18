import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by student on 3/13/2017.
 */
public class AnimalHospital {

    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public AnimalHospital(String inputFile) throws IllegalPetInformationException, IllegalEmailException, FileNotFoundException {
        Scanner s =new Scanner(new File(inputFile));
        String type;
        String name;
        String ownerName;
        String ownerEmail;
        String color;
        String gender;
        String size = null;
        boolean isClipped = false;

        while(s.hasNextLine()){
            try {
                type = s.nextLine();
                name = s.nextLine();
                ownerName = s.nextLine();
                ownerEmail = s.nextLine();
                color = s.nextLine();
                gender = s.nextLine();
            }
            catch (NoSuchElementException e){
                throw new IllegalPetInformationException();
            }
            if(type.equals("DOG") || type.equals("CAT")){
                size = s.nextLine();
            }
            else{
                String temp = s.nextLine();
                if(temp.equals("true")){
                    isClipped = true;
                }
                else if(temp.equals("false")){
                    isClipped = false;
                }
                else{
                    throw new IllegalPetInformationException();
                }
            }


            if(type.equals("DOG")){
                pets.add(new Dog(name, ownerName, ownerEmail, color, size));
                pets.get(pets.size()-1).setGender(gender);
            }
            else if("CAT".equals("CAT")){
                pets.add(new Cat(name, ownerName, ownerEmail, color, size));
                pets.get(pets.size()-1).setGender(gender);
            }
            else if(type.equals("BIRD")){
                pets.add(new Bird(name, ownerName, ownerEmail, color));
                pets.get(pets.size()-1).setGender(gender);
                if(isClipped){
                    ((Bird) pets.get(pets.size()-1)).setClipped();
                }
            }
            else{
                throw  new IllegalPetInformationException(type);
            }

        }
    }

    public String getPetInfoByName(String name){
        for (Pet p : pets){
            if(p.getName().equals(name)){
                return p.toString();
            }
        }
        return "Animal not found";
    }

    public String printPetInfoByOwner(String name){
        for (Pet p : pets){
            if(p.getOwnerName().equals(name)){
                return p.toString();
            }
        }
        return "Animal not found";
    }

    public String printPetsBoarding(int month, int day, int year){
        for (Pet p : pets){
            if(p.boarding(month, day, year)){
                return p.toString();
            }
        }
        return "Animal not found";
    }

}
