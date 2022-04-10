/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Register;

import java.util.HashSet;
import java.util.Set;

public class RegisterRepository implements IRegisterRepository {

    private static RegisterRepository repository = null;
    private Set<Register> registerDB = null;

    //singleton
    private RegisterRepository(){
        registerDB = new HashSet<Register>();
    }
    public static RegisterRepository getRepository(){
        if(repository == null){
            repository = new RegisterRepository();
        }
        return repository;
    }



    @Override
    public Register create(Register register) {
        boolean success = registerDB.add(register);
        if(!success)
            return null;
        return register;
    }

    @Override
    public Register read(String registerNumber) {
        Register register = registerDB.stream()
                .filter(w -> w.getRegisterNumber()
                        .equals(registerNumber))
                .findAny()
                .orElse(null);
        return register;

    }

    @Override
    public Register update(Register register) {
        Register oldRegister = read(register.getRegisterNumber());
        if(oldRegister != null){
            registerDB.remove(oldRegister);
            registerDB.add(register);
            return register;
        }
        return null;
    }

    @Override
    public boolean delete(String registerNumber) {
        Register registerToDelete = read(registerNumber);
        if (registerToDelete == null)
            return false;
        registerDB.remove(registerToDelete);
        return true;
    }

    @Override
    public Set<Register> getAll() {return registerDB;}
}
