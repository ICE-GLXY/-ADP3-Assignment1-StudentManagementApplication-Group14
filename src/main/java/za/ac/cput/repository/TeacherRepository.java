package za.ac.cput.repository;
/*
 * Author Lelihle Gazi - (214258041)
 * TeacherRepository.java
 * 08-04-2022
 */

import za.ac.cput.entity.Teacher;

import java.util.HashSet;
import java.util.Set;

public class TeacherRepository implements  ITeacherRepository {

    private  static TeacherRepository repository = null;
    private Set<Teacher> teacherDB = null;

    private TeacherRepository(){teacherDB = new HashSet<Teacher>();}

    public static TeacherRepository getRepository(){

        if(repository == null){
            repository = new TeacherRepository();
        }
        return repository;
    }

    @Override
    public Teacher create(Teacher teacher) {
        this.teacherDB.add(teacher);
        return teacher;
    }

    @Override
    public Teacher read(String teacherID) {
        for (Teacher t : teacherDB){
            if(t.getTeacherID().equals(teacherID)){
                return t;
            }

        }
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        Teacher teacher1 = read(teacher.getTeacherID());
        if(teacher1 != null){
            teacherDB.remove(teacher1);
            teacherDB.add(teacher);
            return teacher;
        }
        return null;
    }

    @Override
    public boolean delete(String teacherID) {
        Teacher deleteTeacher = read(teacherID);
        if (deleteTeacher == null ){
            System.out.println("is null");
        }
        teacherDB.remove(deleteTeacher);
        System.out.println("removed");
        return true;

    }

    @Override
    public Set<Teacher> getAll() {
        return teacherDB;
    }
}

