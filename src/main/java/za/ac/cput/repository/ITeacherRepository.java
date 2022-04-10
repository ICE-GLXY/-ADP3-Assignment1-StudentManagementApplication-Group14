package za.ac.cput.repository;
/*
 * Author Lelihle Gazi - (214258041)
 * ITeacherRepository.java
 * Created interface for TeacherRepository
 * 08-04-2022
 */

import za.ac.cput.entity.Teacher;

import java.util.Set;

public interface ITeacherRepository extends IRepository<Teacher, String> {

    public Set<Teacher> getAll();
}

