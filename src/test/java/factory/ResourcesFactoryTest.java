package factory;

/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Resources;
import za.ac.cput.factory.ResourcesFactory;
import static org.junit.jupiter.api.Assertions.*;



public class ResourcesFactoryTest {

    @Test
    public void test(){
        Resources resources = ResourcesFactory.createResources("Mathematics basics", "Exercise 2.1", "Algebric expressions");
        System.out.println(resources.toString());
        assertNotNull(resources);
    }
}
