package za.ac.cput.repository;

/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
   IGradeRepository.java
   7 April 2022
*/


import za.ac.cput.entity.Grade;
import java.util.Set;

public interface IGradeRepository extends za.ac.cput.repository.IRepository<Grade, String> {
    public Set<Grade> getAll();
}
