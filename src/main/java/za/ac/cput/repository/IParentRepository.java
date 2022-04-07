package za.ac.cput.repository;
/*
 * Abdul Aleem Chilwan - 220108447
 * IParentRepository.java
 * An interface created for the ParentRepository class
 * 07-04-2022
 */
import za.ac.cput.entity.Parent;

import java.util.Set;

public interface IParentRepository extends IRepository<Parent, String> {
    //this interface has inherited the CRUD function from IRepository
    public Set<Parent> getAll();

}