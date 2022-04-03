package util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {

    public static boolean isEmpty(String s){
        return (s == null || s.isBlank());
    }

    public static boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }


}
