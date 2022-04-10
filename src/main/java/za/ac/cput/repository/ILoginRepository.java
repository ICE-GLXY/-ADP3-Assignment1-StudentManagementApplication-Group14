/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Login;

import java.util.Set;

public interface ILoginRepository extends IRepository<Login, String>{
    public Set<Login> getAll();
}
