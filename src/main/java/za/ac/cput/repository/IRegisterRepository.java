/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Register;

import java.util.Set;

public interface IRegisterRepository extends IRepository<Register, String>{
    public Set<Register> getAll();
}
