package za.ac.cput.repository;

/* IStudentRepository.java
Entity for the Student
Author: Chante Lewis: 216118395
Date: 07 April 2022
 */
import za.ac.cput.entity.Student;

import java.util.Set;

public interface IStudentRepository extends za.ac.cput.repository.IRepository<Student, String> {

    // create, read, update, delete
    public Set<Student> getAll();
}