package za.ac.cput.repository;

/*
 * Mogamad Taariq Phillips - 220166153
 * IDatabase.java
 * interface created for the DatabaseRepository class
 * 07-04-2022
 */

import za.ac.cput.entity.Database;


import java.util.Set;


public interface IDatabase extends IRepository<Database,String>
{
     Set<Database> getAll();
}
