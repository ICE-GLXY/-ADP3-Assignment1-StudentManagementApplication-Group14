package repository;

/* SubjectRepositoryTest.java
Entity for the Student
Author: Chante Lewis: 216118395
Date: 07 April 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Subject;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.repository.SubjectRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class SubjectRepositoryTest {
    private static SubjectRepository repository = SubjectRepository.getRepository();
    private static Subject subject= SubjectFactory.createSubject("ENG106");

    @Test
    void a_create() {
        Subject created = repository.create(subject);
        assertEquals(subject.getSubject_id(), created.getSubject_id());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Subject read = repository.read(subject.getSubject_id());
        assertNotNull(read);
        System.out.print("Read: " + read);
    }

    @Test
    void c_update() {
        Subject updated = new Subject.SubjectBuilder().copy(subject).setSubject_id("145145")
                .setSubject_name("PHYSICS105")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete() {
        boolean
                success = repository.delete(subject.getSubject_id());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}