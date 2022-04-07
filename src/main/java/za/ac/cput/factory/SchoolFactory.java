package za.ac.cput.factory;
/*
 * Abdul Aleem Chilwan - 220108447
 * ParentFactory.java
 * Creation of object for the School entity
 * 07-04-2022
 */
import za.ac.cput.entity.School;
import za.ac.cput.util.Helper;

public class SchoolFactory {
    public static School createSchool(String name){
        if (Helper.isEmpty(name)){
            return null;
        }
        return new School.Builder().setSchoolId(Helper.generateSmallerId()).setName(name).build();
    }
}
