package repository;

/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Resources;
import za.ac.cput.factory.ResourcesFactory;
import za.ac.cput.repository.ResourcesRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ResourcesRepositoryTest {
    private static ResourcesRepository repository = ResourcesRepository.getRepository();

    private static Resources resources = ResourcesFactory.createResources("AP English", "Exercises 12", "Grammar");
    @Test
    void a_create(){
        Resources created = repository.create(resources);
        assertEquals(resources.getResources_id(), created.getResources_id());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        Resources read = repository.read(resources.getResources_id());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        Resources updated = new Resources.Builder().copy(resources).setTextbooks("AP Mathematics").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean
                success = repository.delete(resources.getResources_id());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}

