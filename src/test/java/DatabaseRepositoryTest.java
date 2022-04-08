
/*
 * Mogamad Taariq Phillips - 220166153
 * DatabaseRepositoryTest.java
 * Testing functions of the DatabaseRepository Class
 * 07-04-2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Database;
import za.ac.cput.factory.DatabaseFactory;
import za.ac.cput.repository.DatabaseRepository;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)


class DatabaseRepositoryTest {

    private static DatabaseRepository databaseDB = DatabaseRepository.getInstance();
    private static Database database = DatabaseFactory.createDatabase("taariqphillips01@gmail.com","pwerd235","pwerd235", 5, "Student");



    @Test
    void a_createVerification()
    {
        Database created = databaseDB.create(database);
        assertEquals(database.getEmailAddress(), created.getEmailAddress());
        System.out.println("Created : " + created);
    }

    @Test
    void b_read()
    {
        Database read = databaseDB.read(database.getEmailAddress());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void c_update()
    {
        Database updated = new Database
                .Builder()
                .copy(database)
                .setgrade(3)
                .build();
        assertNotNull(databaseDB.update(updated));
        System.out.println("Updated :" + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = databaseDB.delete(database.getEmailAddress());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void d_getAll()
    {
        System.out.println("Show all :");
        System.out.println(databaseDB.getAll());
    }
}