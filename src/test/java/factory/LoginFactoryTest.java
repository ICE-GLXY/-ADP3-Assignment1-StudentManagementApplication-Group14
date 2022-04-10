package factory;

import za.ac.cput.entity.Login;
import za.ac.cput.factory.LoginFactory;

import static org.junit.jupiter.api.Assertions.*;

class LoginFactoryTest {

    @org.junit.jupiter.api.Test
    void createLogin() {
        Login login = LoginFactory.createLogin("","Tasreeq@email.com","12345678");
        assertNotNull(login);
        System.out.println(login.toString());
    }
}