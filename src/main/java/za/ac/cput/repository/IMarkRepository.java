package za.ac.cput.repository;
/*
 * Author Lelihle Gazi - (214258041)
 * IMarkRepository.java
 * Created interface for MarkRepository
 * 08-04-2022
 */

import za.ac.cput.entity.Mark;

import java.util.Set;

public interface IMarkRepository extends IRepository<Mark, String> {

    public Set<Mark> getAll();
}
