package za.ac.cput.factory;

import za.ac.cput.entity.Database;
import za.ac.cput.util.Helper;

public class DatabaseFactory
{
    public static Database createDatabase(String emailAddress, String Password, String passwordConfirmation, int grade, String userType)
    {

        if (Helper.isEmpty(emailAddress) || Helper.isEmpty(Password) || Helper.isEmpty(passwordConfirmation) || Helper.isEmpty(passwordConfirmation)) {
            return null;
        }

        if(!Helper.isValidEmail(emailAddress)){
            return null;
        }

        return new Database
                .Builder()
                .setemailAddress(emailAddress)
                .setemailAddress(emailAddress)
                .setPassword(Password)
                .setpasswordConfirmation(passwordConfirmation)
                .setgrade(grade)
                .setuserType(userType)
                .build();
    }
}
