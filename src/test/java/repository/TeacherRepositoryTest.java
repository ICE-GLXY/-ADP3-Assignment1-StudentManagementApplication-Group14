package repository;
/*
 * Author Lelihle Gazi - (214258041)
 * TeacherRepositoryTest.java
 * 10-04-2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Teacher;
import za.ac.cput.factory.TeacherFactory;
import za.ac.cput.repository.TeacherRepository;

import static org.junit.jupiter.api.Assertions.*;

class TeacherRepositoryTest {
    private static TeacherRepository repository = TeacherRepository.getRepository();

    @Test
    void create() {
        Teacher teacher = TeacherFactory.createTeacher("1","Gazi",
                "G1404","gazi@gmail.com");
        var created = repository.create(teacher);

        // validate the properties of the teacher object
        assertEquals(teacher.getTeacherID(), created.getTeacherID());
        assertEquals(teacher.getUsername(), created.getUsername());
        assertEquals(teacher.getEmail(), teacher.getEmail());
        System.out.println("Created : " + created);
    }

    @Test
    void read() {
        Teacher teacher = TeacherFactory.createTeacher("1","Gazi",
                "G1404","gazi@gmail.com");

        repository.create(teacher);

        Teacher read = repository.read(teacher.getTeacherID());
        assertNotNull(read);
        System.out.println("Read : " + read);

    }

    @Test
    void update() {
        Teacher teacher = TeacherFactory.createTeacher("1","Gazi",
                "G1404","gazi@gmail.com");

        repository.create(teacher);
        Teacher updated = new Teacher.Builder().copy(teacher).setUserName("Lee.Gazi").build();
        // validate the teacher object was updated
        assertNotNull(repository.update(updated));
        System.out.println("Updated :" + updated);
    }

    @Test
    void delete() {

        Teacher teacher = TeacherFactory.createTeacher("1","Gazi",
                "G1404","gazi@gmail.com");

        repository.create(teacher);
        boolean success = repository.delete(teacher.getTeacherID());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void getAll() {
        System.out.println("Display all :");
        System.out.println(repository.getAll());
    }
}