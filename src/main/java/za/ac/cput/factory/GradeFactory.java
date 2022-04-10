package za.ac.cput.factory;
/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
   GradeFactory.java
   April 2022
 */

import za.ac.cput.entity.Grade;
import za.ac.cput.util.Helper;

public class GradeFactory {

    public static Grade createGrade(String grade_student_id){
        if (Helper.isEmpty(grade_student_id)){
            return null;
        }
        return new Grade.Builder().setGrade_id(Helper.generateId()).setGrade_student_id(grade_student_id).build();
    }
}
