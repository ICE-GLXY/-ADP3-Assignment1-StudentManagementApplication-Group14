package za.ac.cput.factory;
/*
 * Author Lelihle Gazi - (214258041)
 * MarkFactoryTest.java
 * Created Mark Factory Test class
 * 08-04-2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Mark;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class MarkFactoryTest {

    @Test
    void a_create() {
        Mark mark = MarkFactory.createMark("1","Lee Mark",
                "214258041","ADP3",85.5f);

        assertNotNull(mark);

    }
}

