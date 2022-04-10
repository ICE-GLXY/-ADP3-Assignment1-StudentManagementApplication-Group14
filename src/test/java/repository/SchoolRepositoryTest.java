package repository;/*
 * Abdul Aleem Chilwan - 220108447
 * repository.SchoolRepositoryTest.java
 * Class created for the Testing functions of the SchoolRepository Class
 * 07-04-2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Parent;
import za.ac.cput.entity.School;
import za.ac.cput.factory.ParentFactory;
import za.ac.cput.factory.SchoolFactory;
import za.ac.cput.repository.SchoolRepository;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class SchoolRepositoryTest {

    private static SchoolRepository repository = SchoolRepository.getRepository(); //We cant add the new

    //keyword because it is a singleton, therefore we need to create it this way
    private static School school = SchoolFactory.createSchool("Cape Town High School");

    @Test
    void a_create() {
        School created = repository.create(school);
        assertEquals(school.getSchoolId(), created.getSchoolId());
        System.out.println("Created : " + created);
    }

    @Test
    void b_read() {
        School read = repository.read(school.getSchoolId());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void c_update() {
        School updated = new School.Builder().copy(school).setName("New Star High").build();
        assertNotNull(repository.update(updated)); //going into the method and checking if its changed to the updated
        System.out.println("Updated :" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(school.getSchoolId());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all :");
        System.out.println(repository.getAll());
    }
}