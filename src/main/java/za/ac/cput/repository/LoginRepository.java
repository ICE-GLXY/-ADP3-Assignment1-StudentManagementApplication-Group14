/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Login;

import java.util.HashSet;
import java.util.Set;

public class LoginRepository implements ILoginRepository{

    private static LoginRepository repository = null;
    private Set<Login> loginDB = null;

    //Singleton
    private LoginRepository(){
        loginDB = new HashSet<Login>();
    }
    public static LoginRepository getRepository(){
        if (repository == null){
            repository = new LoginRepository();
        }
        return repository;
    }



    @Override
    public Login create(Login login) {
        boolean success = loginDB.add(login);
        if(!success)
            return null;
        return login;
    }

    @Override
    public Login read(String loginID) {

        Login login = loginDB.stream()
                .filter(q -> q.getLoginID()
                        .equals(loginID))
                .findAny()
                .orElse(null);
        return login;

    }

    @Override
    public Login update(Login login) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Set<Login> getAll() {return loginDB;}
}
