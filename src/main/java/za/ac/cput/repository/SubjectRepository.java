package src.main.java.za.ac.cput.repository;

import src.main.java.za.ac.cput.entity.Subject;

import java.util.HashSet;
import java.util.Set;

public class SubjectRepository implements ISubjectRepository {

    private static SubjectRepository repository = null;
    private Set<Subject> subjectDB = null;

    private SubjectRepository() {
        subjectDB = new HashSet<Subject>();
    }

    public static SubjectRepository getRepository() {
        if (repository == null) {
            repository = new SubjectRepository();
        }
        return repository;
    }


    @Override
    public Subject create(Subject subject) {
        boolean success = subjectDB.add(subject);
        if(!success)
            return null;
        return subject;
    }

    @Override
    public Subject read(String subject_id) {
        Subject subject = subjectDB.stream()
                .filter(s -> s.getSubject_id().equals(subject_id))
                .findAny()
                .orElse(null);
        return subject;
    }

    @Override
    public Subject update(Subject subject) {
        Subject oldSubject = read(subject.getSubject_id());
        if(oldSubject != null){
            subjectDB.remove(oldSubject);
            subjectDB.add(subject);
            return null;
        }
        return subject;
    }

    @Override
    public boolean delete(String subject_id) {
        Subject subjectDelete = read(subject_id);
        if(subjectDelete == null)
            return false;
        subjectDB.remove(subjectDelete);
        return true;
    }

    @Override
    public Set<Subject> getAll() {
        return subjectDB;
    }
}

