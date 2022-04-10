package factory;
/*
 * Author Lelihle Gazi - (214258041)
 * TeacherFactoryTest.java
 * Created Teacher Factory Test class
 * 08-04-2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Teacher;
import za.ac.cput.factory.TeacherFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class TeacherFactoryTest {
    @Test
    void a_create() {
        Teacher teacher = TeacherFactory.createTeacher("1","Gazi",
                "G1404","gazi@gmail.com");

        assertNotNull(teacher);

    }
}
