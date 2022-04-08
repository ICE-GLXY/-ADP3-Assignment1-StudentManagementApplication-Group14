package src.main.java.za.ac.cput.test.factory;

import org.junit.jupiter.api.Test;
import src.main.java.za.ac.cput.entity.Student;
import src.main.java.za.ac.cput.factory.StudentFactory;
import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    public void test(){

        Student student = StudentFactory.createStudent("Chante Lewis","216118395@mycput.ac.za","20 Murray Street","clewis","1245","Diazville High",12);
        System.out.println(student.toString());
        assertNotNull(student);

    }

}