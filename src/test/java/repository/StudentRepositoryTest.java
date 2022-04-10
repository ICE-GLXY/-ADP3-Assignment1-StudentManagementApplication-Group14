package repository;

/* StudentRepositoryTest.java
Entity for the Student
Author: Chante Lewis: 216118395
Date: 07 April 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentRepositoryTest {
    private static StudentRepository repository = StudentRepository.getRepository();
    private static Student student= StudentFactory.createStudent("San Vraagom","svraagom@yahoo.com","20 Genoa Way, Cape Town,7890","sana","sv4567","Weston High",9);

    @Test
    void a_create() {
        Student created = repository.create(student);
        assertEquals(student.getStudent_id(), created.getStudent_id());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Student read = repository.read(student.getStudent_id());
        assertNotNull(read);
        System.out.print("Read: " + read);
    }

    @Test
    void c_update() {
        Student updated = new Student.StudentBuilder().copy(student).setStudent_id("145145")
                .setStudent_name("Keegan Vraagom")
                .setEmail("keeganv@gmail.com")
                .setAddress("30 Liesbeeck, Vredenburg, 7380")
                .setUsername("kvraagom")
                .setPassword("kv12469")
                .setSchool("Vredenburg Hoer")
                .setGrade(12)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete() {
        boolean
                success = repository.delete(student.getStudent_id());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}