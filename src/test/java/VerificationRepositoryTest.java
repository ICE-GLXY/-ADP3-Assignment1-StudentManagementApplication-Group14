
/*
 * Mogamad Taariq Phillips - 220166153
 * VerificationRepositoryTest.java
 * Testing functions of the VerificationRepository Class
 * 07-04-2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Verification;
import za.ac.cput.factory.VerificationFactory;
import za.ac.cput.repository.VerificationRepository;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)


class VerificationRepositoryTest {

    private static VerificationRepository verificationDB = VerificationRepository.getInstance();
    private static Verification verification = VerificationFactory.createVerification("mtphil01","taariqphillips01@gmail.com","pwerd235");



    @Test
    void a_createVerification()
    {
        Verification created = verificationDB.create(verification);
        assertEquals(verification.getUsername(), created.getUsername());
        System.out.println("Created : " + created);
    }

    @Test
    void b_read()
    {
        Verification read = verificationDB.read(verification.getUsername());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void c_update()
    {
        Verification updated = new Verification
                .Builder()
                .copy(verification)
                .setPasswordField("MTPhillips2001")
                .build();
        assertNotNull(verificationDB.update(updated));
        System.out.println("Updated :" + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = verificationDB.delete(verification.getUsername());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void d_getAll()
    {
        System.out.println("Show all :");
        System.out.println(verificationDB.getAll());
    }
}