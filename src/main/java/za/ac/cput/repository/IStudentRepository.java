package src.main.java.za.ac.cput.repository;

import src.main.java.za.ac.cput.entity.Student;

import java.util.Set;

public interface IStudentRepository extends za.ac.cput.repository.IRepository<Student, String> {

    // create, read, update, delete
    public Set<Student> getAll();
}