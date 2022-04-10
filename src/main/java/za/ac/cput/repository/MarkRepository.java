package za.ac.cput.repository;
/*
 * Author Lelihle Gazi - (214258041)
 * MarkRepository.java
 * 08-04-2022
 */

import za.ac.cput.entity.Mark;

import java.util.HashSet;
import java.util.Set;

public class MarkRepository implements IMarkRepository {

    private static MarkRepository repository = null;
    private Set<Mark> markDB = null;

    private MarkRepository(){
        markDB = new HashSet<Mark>();

    }
    public static  MarkRepository getRepository(){
        if (repository == null){
            repository = new MarkRepository();
        }
        return repository;
    }

    @Override
    public Mark create(Mark mark) {
        this.markDB.add(mark);
        return mark;
    }

    @Override
    public Mark read(String markID) {
        for(Mark m : markDB){
            if (m.getMarkID().equals(markID)){
                return m;
            }
        }
        return null;
    }

    @Override
    public Mark update(Mark mark) {
        Mark mark1 = read(mark.getMarkID());
        if(mark1 != null){
            markDB.remove(mark1);
            markDB.add(mark);
            return mark;
        }
        return null;
    }

    @Override
    public boolean delete(String markID) {
        Mark deleteMark = read(markID);
        if(deleteMark == null){
            System.out.println("null");
        }
        markDB.remove(deleteMark);
        System.out.println("removed");
        return true;
    }

    @Override
    public Set<Mark> getAll() {
        return null;
    }

}