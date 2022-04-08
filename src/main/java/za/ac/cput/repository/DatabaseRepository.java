package za.ac.cput.repository;

/*
 * Mogamad Taariq Phillips - 220166153
 * VerificationRepository.java
 * Class created for the CRUD functions of the VerificationRepository Class
 * 07-04-2022
 */

import za.ac.cput.entity.Database;

import java.util.HashSet;
import java.util.Set;

public class DatabaseRepository implements IDatabase
{
    private static DatabaseRepository databaseRepository = null;
    private static Set<Database> databaseDB = null;

    private DatabaseRepository(){
        databaseDB = new HashSet<>();
    }

    public static DatabaseRepository getInstance(){

        if(databaseRepository == null){
            databaseRepository = new DatabaseRepository();
        }
        return databaseRepository;
    }

    @Override
    public Database create(Database newDatabase) {
        boolean success = databaseDB.add(newDatabase);

        if(!success)
            return null;
        return newDatabase;
    }

    @Override
    public Database read(String EmailAddress) {

        for(Database newDatabase: databaseDB){
            if(newDatabase.getEmailAddress().equals(EmailAddress)){
                return newDatabase;
            }
        }
        return null;
    }

    @Override
    public Database update(Database updateDatabase) {
        Database oldDatabase = read(updateDatabase.getEmailAddress());

        if(oldDatabase != null){
            databaseDB.remove(oldDatabase);
            databaseDB.add(updateDatabase);
            return updateDatabase;

        }
        return null;
    }

    @Override
    public boolean delete(String EmailAddress) {
        Database deleteDatabase = read(EmailAddress);

        if(deleteDatabase == null) {
            return false;
        }
        databaseDB.remove(deleteDatabase);
        return true;

    }

    @Override
    public Set<Database> getAll() {
        return databaseDB;
    }
}
