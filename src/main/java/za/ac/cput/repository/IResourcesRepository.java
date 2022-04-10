package za.ac.cput.repository;
/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
   IResourcesRepository.java
   7 April 2022
*/


import za.ac.cput.entity.Resources;
import java.util.Set;

public interface IResourcesRepository extends za.ac.cput.repository.IRepository<Resources, String> {
    public Set<Resources> getAll();
}
