/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Login;
import za.ac.cput.factory.LoginFactory;
import za.ac.cput.repository.LoginRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LoginRepositoryTest {
    private static LoginRepository repository = LoginRepository.getRepository();
    private static Login login = LoginFactory.createLogin
            ("",
                    "Tasreeq@email.com",
                    "abcdef");
    @Test
    void create() {
        Login created = repository.create(login);
        assertEquals(login.getLoginID(), created.getLoginID());
        System.out.println( "Create:" + created);
    }

    @Test
    void read() {
        Login read = repository.read(login.getLoginID());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    void getAll() {
        System.out.println("show all:");
        System.out.println(repository.getAll());
    }
}
