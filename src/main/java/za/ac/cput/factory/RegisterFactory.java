/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Register;
import za.ac.cput.util.Helper;

public class RegisterFactory {
    public static Register createRegister(String registerNumber, String email, String password, String school, String parent, String student){
        String registerId = Helper.generateSmallerId();
        Register register = new Register.Builder()
                .setRegisterNumber(registerId)
                .setEmail(email)
                .setPassword(password)
                .setSchool(school)
                .setParent(parent)
                .setStudent(student)
                .build();
        return register;

    }
}
