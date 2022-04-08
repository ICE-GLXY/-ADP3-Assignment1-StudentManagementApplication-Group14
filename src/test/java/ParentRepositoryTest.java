
/*
 * Abdul Aleem Chilwan - 220108447
 * ParentRepositoryTest.java
 * Class created for the Testing functions of the ParentRepository Class
 * 07-04-2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Parent;
import za.ac.cput.factory.ParentFactory;
import za.ac.cput.repository.ParentRepository;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class) //This allows the methods to run a,b,c,d,e (because you named it in that order below)

class ParentRepositoryTest {

    private static ParentRepository repository = ParentRepository.getRepository(); //We cant add the new
    //keyword because it is a singleton, therefore we need to create it this way
    private static Parent parent = ParentFactory.createParent("Abdul", "Chilwan",
            "bleem@gmail.com", "021 438 3942","123241ERD");


    @Test
    void a_create() {
        Parent created = repository.create(parent);
        assertEquals(parent.getParentId(), created.getParentId()); //checking if the email added is the same as the
        // email created right above and in this method are the same
        System.out.println("Created : " + created);
    }

    @Test
    void b_read() {
        Parent read = repository.read(parent.getParentId());
        assertNotNull(read);
        System.out.println("Read : " + read);

    }

    @Test
    void c_update() {
        Parent updated = new Parent.Builder().copy(parent).setFirstName("Lukas").build();
        assertNotNull(repository.update(updated)); //going into the method and checking if its changed to the updated
        System.out.println("Updated :" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(parent.getParentId());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all :");
        System.out.println(repository.getAll());
    }
}