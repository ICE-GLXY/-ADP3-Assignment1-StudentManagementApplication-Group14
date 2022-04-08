package za.ac.cput.factory;

import za.ac.cput.entity.Verification;
import za.ac.cput.util.Helper;

public class VerificationFactory {

    public static Verification createVerification(String username, String emailField, String passwordField) {
        if (Helper.isEmpty(username) || Helper.isEmpty(emailField) || Helper.isEmpty(passwordField)) {
            return null;

        }

        if(!Helper.isValidEmail(emailField)){
            return null;
        }

        return new Verification
                    .Builder()
                    .setUsername(username)
                    .setEmailField(emailField)
                    .setPasswordField(passwordField)
                    .build();


        }
}
