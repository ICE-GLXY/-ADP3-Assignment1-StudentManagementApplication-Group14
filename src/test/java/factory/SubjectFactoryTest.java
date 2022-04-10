package factory;

import org.junit.jupiter.api.Test;
import src.main.java.za.ac.cput.entity.Subject;
import src.main.java.za.ac.cput.factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {
    @Test
    public void test(){

        Subject subject = SubjectFactory.createSubject("MATH102");
        System.out.println(subject.toString());
        assertNotNull(subject);

    }

}