package za.ac.cput.repository;
/*
 * Abdul Aleem Chilwan - 220108447
 * ParentRepository.java
 * Class created for the CRUD functions of the ParentRepository Class
 * 07-04-2022
 */
import za.ac.cput.entity.Parent;

import java.util.HashSet;
import java.util.Set;

public class ParentRepository implements IParentRepository{
    private static ParentRepository repository = null;
    private Set<Parent> parentDB = null;


    private ParentRepository(){
        parentDB = new HashSet<Parent>();
    }

    public static ParentRepository getRepository(){
        if(repository == null){
            repository = new ParentRepository();
        }
        return repository;
    }

    @Override
    public Parent create(Parent parent) {
        boolean success = parentDB.add(parent);
        if(!success){
            return null;
        }
        return parent;
    }

    @Override
    public Parent read(String parentId) {
        Parent parent = parentDB.stream().filter(u -> u.getParentId().equals(parentId))
                .findAny().orElse(null);
        return parent;
    }


    @Override
    public Parent update(Parent parent) {
        Parent oldUser = read(parent.getParentId());
        if(oldUser != null){
            parentDB.remove(oldUser);
            parentDB.add(parent);
            return parent;
        }
        return null;
    }

    @Override
    public boolean delete(String parentId) {
        Parent parentToDelete = read(parentId);
        if(parentToDelete == null){ //nothing to delete
            return false; //nothing to delete
        }
        parentDB.remove(parentToDelete);
        return true;
    }

    @Override
    public Set<Parent> getAll() {
        return parentDB;
    }
}