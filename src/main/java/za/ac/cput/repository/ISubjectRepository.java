package za.ac.cput.repository;

/* ISubjectRepository.java
Entity for the Student
Author: Chante Lewis (216118395)
Date: 07 April 2022
 */
import za.ac.cput.entity.Subject;
import java.util.Set;

public interface ISubjectRepository extends IRepository<Subject, String> {

    // create, read, update, delete
    public Set<Subject> getAll();

}