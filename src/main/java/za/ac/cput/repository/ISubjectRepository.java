package src.main.java.za.ac.cput.repository;

import src.main.java.za.ac.cput.entity.Subject;

import java.util.Set;

public interface ISubjectRepository extends za.ac.cput.repository.IRepository<Subject, String> {

    // create, read, update, delete
    public Set<Subject> getAll();

}