package factory;
/* Abdul Aleem Chilwan - 220108447
 * SchoolFactoryTest.java
 * Class created for the Testing functions of the SchoolFactory Class
 * 07-04-2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.School;
import za.ac.cput.factory.SchoolFactory;

import static org.junit.jupiter.api.Assertions.*;

class SchoolFactoryTest {

    @Test
    void createSchool()
    {
        School school = SchoolFactory.createSchool("Romans High");
        System.out.println(school.toString());
        assertNotNull(school);
    }
}