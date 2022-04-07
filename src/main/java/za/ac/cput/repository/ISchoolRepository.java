package za.ac.cput.repository;
/*
 * Abdul Aleem Chilwan - 220108447
 * ISchoolRepository.java
 * An interface created for the SchoolRepository class
 * 07-04-2022
 */
import za.ac.cput.entity.School;

import java.util.Set;

public interface ISchoolRepository extends IRepository<School, String> {
    //this interface has inherited the CRUD function from IRepository
    public Set<School> getAll();

}
