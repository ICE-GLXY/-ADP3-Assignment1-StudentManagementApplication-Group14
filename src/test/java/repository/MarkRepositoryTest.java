package repository;
/*
 * Author Lelihle Gazi - (214258041)
 * MarkRepositoryTest.java
 * 10-04-2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Mark;
import za.ac.cput.factory.MarkFactory;
import za.ac.cput.repository.MarkRepository;

import static org.junit.jupiter.api.Assertions.*;

class MarkRepositoryTest {
    private static MarkRepository repository = MarkRepository.getRepository();
    @Test
    void create() {
        Mark mark = MarkFactory.createMark("1","Lee Mark",
                "214258041","ADP3",85.5f);
        var created = repository.create(mark);
        assertEquals(mark.getMarkID(), created.getMarkID());
        assertEquals(mark.getMarkStudentId(), created.getMarkStudentId());
        assertEquals(mark.getMarkSubjectId(), mark.getMarkSubjectId());
        System.out.println("Created : " + created);
    }

    @Test
    void read() {
        Mark mark = MarkFactory.createMark("1","Lee Mark",
                "214258041","ADP3",85.5f);
        repository.create(mark);
        Mark read = repository.read(mark.getMarkID());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void update() {
        Mark mark = MarkFactory.createMark("1","Lee Mark",
                "214258041","ADP3",85.5f);
        repository.create(mark);
        Mark updated = new Mark.Builder().copy(mark).setMarkResult(100.0f).build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated :" + updated);
    }

    @Test
    void delete() {
        Mark mark = MarkFactory.createMark("1","Lee Mark",
                "214258041","ADP3",85.5f);
        repository.create(mark);
        boolean success = repository.delete(mark.getMarkID());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void getAll() {
        System.out.println("Display all :");
        System.out.println(repository.getAll());
    }
}