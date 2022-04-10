package factory;
/*
 * Mogamad Taariq Phillips - 220166153
 * DatabaseFactoryTest.java
 * Testing functions of the DatabaseFactory Class
 * 07-04-2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Database;
import za.ac.cput.factory.DatabaseFactory;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseFactoryTest {

    @Test
    void createDatabase()
    {
        Database database = DatabaseFactory.createDatabase("2220166153@mycput.ac.za","pass2201","pass2201",6,"Student");
        System.out.println(database.toString());
        assertNotNull(database);
    }
}