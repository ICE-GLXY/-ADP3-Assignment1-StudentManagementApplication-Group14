package za.ac.cput.repository;

import za.ac.cput.entity.Verification;

import java.util.HashSet;
import java.util.Set;

public class VerificationRepository implements IVerification
{
    private static VerificationRepository verificationRepository = null;
    private Set<Verification> verificationDB;

    private VerificationRepository(){
        verificationDB = new HashSet<Verification>();

    }


    public static VerificationRepository getInstance(){

        if(verificationRepository == null){
            verificationRepository = new VerificationRepository();
        }
        return verificationRepository;
    }

    //adds a new customer to the database
    @Override
    public Verification create(Verification createVerification) {
        boolean success = verificationDB.add(createVerification);

        if(!success)
            return null;
        return createVerification;

    }

    @Override
    public Verification read(String username) {
        for(Verification verification: verificationDB){
            if(verification.getUsername()== username){
                return verification;
            }

        }
        return null;
    }


    //Updates customer data
    @Override
    public Verification update(Verification updateVerification) {
        Verification oldVerification = read(updateVerification.getUsername());

        if(oldVerification != null){
            verificationDB.remove(oldVerification);
            verificationDB.add(updateVerification);
            return updateVerification;
        }
        return null;
    }

    @Override
    public boolean delete(String Username) {
        Verification deleteVerification = read(Username);

        if(deleteVerification == null)
            return false;
        verificationDB.remove(deleteVerification);
        return true;
    }

    @Override
    public Set<Verification> getAll() {
        return verificationDB;
    }
}
