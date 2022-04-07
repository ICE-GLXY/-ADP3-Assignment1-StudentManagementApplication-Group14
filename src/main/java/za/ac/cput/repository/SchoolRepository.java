package za.ac.cput.repository;
/*
 * Abdul Aleem Chilwan - 220108447
 * SchoolRepository.java
 * Class created for the CRUD functions of the SchoolRepository Class
 * 07-04-2022
 */
import za.ac.cput.entity.School;
import java.util.HashSet;
import java.util.Set;

public class SchoolRepository implements ISchoolRepository{
    private static SchoolRepository repository = null;
    private Set<School> schoolDB = null;


    private SchoolRepository(){
        schoolDB = new HashSet<School>();
    }

    public static SchoolRepository getRepository(){
        if(repository == null){
            repository = new SchoolRepository();
        }
        return repository;
    }

    @Override
    public School create(School school) {
        boolean success = schoolDB.add(school);
        if(!success){
            return null;
        }
        return school;
    }

    @Override
    public School read(String schoolId) {
        School school = schoolDB.stream().filter(u -> u.getSchoolId().equals(schoolId))
                .findAny().orElse(null);
        return school;
    }


    @Override
    public School update(School school) {
        School oldUser = read(school.getSchoolId());
        if(oldUser != null){
            schoolDB.remove(oldUser);
            schoolDB.add(school);
            return school;
        }
        return null;
    }

    @Override
    public boolean delete(String schoolId) {
        School schoolToDelete = read(schoolId);
        if(schoolToDelete == null){ //nothing to delete
            return false; //nothing to delete
        }
        schoolDB.remove(schoolToDelete);
        return true;
    }

    @Override
    public Set<School> getAll() {
        return schoolDB;
    }
}