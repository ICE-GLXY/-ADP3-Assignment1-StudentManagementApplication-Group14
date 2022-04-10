package repository;


/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Grade;
import za.ac.cput.factory.GradeFactory;
import za.ac.cput.repository.GradeRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class GradeRepositoryTest {
    private static GradeRepository repository = GradeRepository.getRepository();

    private static Grade grade = GradeFactory.createGrade("12");

    @Test
    void a_create(){
        Grade created = repository.create(grade);
        assertEquals(grade.getGrade_id(), created.getGrade_id());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        Grade read = repository.read(grade.getGrade_id());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        Grade updated = new Grade.Builder().copy(grade).setGrade_student_id("11").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean
                success = repository.delete(grade.getGrade_id());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}

