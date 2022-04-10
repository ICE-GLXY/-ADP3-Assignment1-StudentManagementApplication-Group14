package factory;

import za.ac.cput.entity.Register;
import za.ac.cput.factory.RegisterFactory;

import static org.junit.jupiter.api.Assertions.*;

class RegisterFactoryTest {

    @org.junit.jupiter.api.Test

    void createRegister() {
        Register register = RegisterFactory.createRegister("","Tasreeq@email.com","12345678","PPHS","yes","no");
        assertNotNull(register);
        System.out.println(register.toString());
    }
}