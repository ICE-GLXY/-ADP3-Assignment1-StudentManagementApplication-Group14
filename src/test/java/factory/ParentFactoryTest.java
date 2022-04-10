package factory;
/* Abdul Aleem Chilwan - 220108447
        * ParentFactoryTest.java
        * Class created for the Testing functions of the ParentFactory Class
        * 07-04-2022
        */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Parent;
import za.ac.cput.factory.ParentFactory;

import static org.junit.jupiter.api.Assertions.*;

class ParentFactoryTest {

    @Test
    void createParent()
    {
        Parent parent = ParentFactory.createParent("Aryan", "Dom",
                "dom@gmail.com", "021 158 5421","1234UML");
        System.out.println(parent.toString());
        assertNotNull(parent);
    }
}