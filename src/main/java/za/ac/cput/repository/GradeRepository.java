package za.ac.cput.repository;


/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
*/

import za.ac.cput.entity.Grade;

import java.util.HashSet;
import java.util.Set;

public class GradeRepository implements IGradeRepository {
    private static GradeRepository repository = null;
    private Set<Grade> gradeDB = null;


    private GradeRepository() {
        gradeDB = new HashSet<Grade>();
    }

    public static GradeRepository getRepository() {
        if (repository == null) {
            repository = new GradeRepository();
        }
        return repository;
    }

    @Override
    public Grade create(Grade grade) {
        boolean success = gradeDB.add(grade);
        if (!success) {
            return null;
        }
        return grade;
    }

    @Override
    public Grade read(String grade_id) {
        Grade grade = gradeDB.stream()
                .filter(g -> g.getGrade_id().equals(grade_id))
                .findAny().orElse(null);
        return grade;
    }


    @Override
    public Grade update(Grade grade) {
        Grade oldGrade = read(grade.getGrade_id());
        if (oldGrade != null) {
            gradeDB.remove(oldGrade);
            gradeDB.add(grade);
            return grade;
        }
        return null;
    }

    @Override
    public boolean delete(String grade_id) {
        Grade gradeDelete = read(grade_id);
        if (gradeDelete == null) {
            return false;
        }
        gradeDB.remove(gradeDelete);
        return true;
    }

    @Override
    public Set<Grade> getAll() { return gradeDB; }
}

