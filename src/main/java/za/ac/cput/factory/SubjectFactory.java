package za.ac.cput.factory;

/* SubjectFactory.java
Entity for the Student
Author: Chante Lewis (216118395)
Date: 07 April 2022
 */
import za.ac.cput.entity.Subject;

public class SubjectFactory {

    //creating subject objects
    public static Subject createSubject(String subject_name){

        String subject_id = za.ac.cput.util.Helper.generateId();

        if(za.ac.cput.util.Helper.isEmpty(subject_name))
            return null;

        Subject subject = new Subject.SubjectBuilder().setSubject_id(subject_id)
                .setSubject_name(subject_name)
                .build();
        return subject;

    }

}
