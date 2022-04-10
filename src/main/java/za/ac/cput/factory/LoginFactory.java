/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Login;
import za.ac.cput.util.Helper;

public class LoginFactory {
    public static Login createLogin(String loginID, String email, String password){
        String loginId = Helper.generateSmallerId();
        Login login = new Login.Builder()
                .setLoginID(loginId)
                .setEmail(email)
                .setPassword(password)
                .build();
        return login;
    }
}
