package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Register;
import za.ac.cput.factory.RegisterFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class RegisterRepositoryTest {
    private static RegisterRepository repository = RegisterRepository.getRepository();

    private static Register register = RegisterFactory.createRegister
            ("",
                    "Tasreeq@email.com",
                    "abcdef",
                    "pphs",
                    "yes",
                    "no");



    @Test
    void a_create() {
        Register created = repository.create(register);
        assertEquals(register.getRegisterNumber(), created.getRegisterNumber());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Register read = repository.read(register.getRegisterNumber());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    void c_update() {
        Register updated = new Register.Builder().copy(register)
                .setEmail("Tashi@email.com")
                .setPassword("123456")
                .setSchool("Pelican Park HIgh")
                .setParent("NO")
                .setStudent("Yes")
                .build();
        Assertions.assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }
    @Test
    void e_delete() {
        boolean success = repository.delete(register.getRegisterNumber());
        assertTrue(success);
        System.out.println("Deleted:" + true);
    }


    @Test
    void d_getAll() {
        System.out.println("show all:");
        System.out.println(repository.getAll());
    }
}
