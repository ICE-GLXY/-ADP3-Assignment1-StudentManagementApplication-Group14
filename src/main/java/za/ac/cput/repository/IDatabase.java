package za.ac.cput.repository;

import za.ac.cput.entity.Database;


import java.util.Set;


public interface IDatabase extends IRepository<Database,String>
{
    public Set<Database> getAll();
}
