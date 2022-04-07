package za.ac.cput.repository;

import za.ac.cput.entity.Verification;

import java.util.Set;

public interface IVerification extends IRepository<Verification,String>
{
    public Set<Verification> getAll();
}
