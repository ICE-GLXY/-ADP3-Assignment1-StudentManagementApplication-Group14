package factory;

/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Grade;
import za.ac.cput.factory.GradeFactory;

import static org.junit.jupiter.api.Assertions.*;

public class GradeFactoryTest {

    @Test
    public void test() {

        Grade grade = GradeFactory.createGrade("9");
        System.out.println(grade.toString());
        assertNotNull(grade);
    }
}
