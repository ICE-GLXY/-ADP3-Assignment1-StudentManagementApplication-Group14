package factory;
/*
 * Mogamad Taariq Phillips - 220166153
 * VerificationFactoryTest.java
 * Testing functions of the VerificationFactory Class
 * 07-04-2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Verification;
import za.ac.cput.factory.VerificationFactory;

import static org.junit.jupiter.api.Assertions.*;

class VerificationFactoryTest {

    @Test
    void createVerification()
    {
        Verification verification = VerificationFactory.createVerification("2220166153","2220166153@mycput.ac.za","pass2201");
        System.out.println(verification.toString());
        assertNotNull(verification);
    }
}