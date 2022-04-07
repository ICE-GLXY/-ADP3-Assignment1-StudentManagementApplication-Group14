package za.ac.cput.factory;
/*
 * Abdul Aleem Chilwan - 220108447
 * ParentFactory.java
 * Creation of object for the Parent entity
 * 07-04-2022
 */
import za.ac.cput.entity.Parent;
import za.ac.cput.util.Helper;

public class ParentFactory {
    public static Parent createParent(String firstName,String lastName,String email,
                                      String mobileNumber,String password){
        if (Helper.isEmpty(firstName) || Helper.isEmpty(lastName) || Helper.isEmpty(email) ||
                Helper.isEmpty(mobileNumber) || Helper.isEmpty(password)){
            return null;
        }
        if(!Helper.isValidEmail(email)){
            return null;
        }
        return new Parent.Builder().setParentId(Helper.generateSmallerId()).setFirstName(firstName).setLastName(lastName)
                .setEmail(email).setMobileNumber(mobileNumber).setPassword(password).build();
    }
}