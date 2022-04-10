package za.ac.cput.repository;

/*
 * Mogamad Taariq Phillips - 220166153
 * IVerification.java
 * interface created for the verificationRepository class
 * 07-04-2022
 */

import za.ac.cput.entity.Verification;

import java.util.Set;

public interface IVerification extends IRepository<Verification,String>
{
    Set<Verification> getAll();
}
