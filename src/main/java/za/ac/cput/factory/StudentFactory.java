package za.ac.cput.factory;

import za.ac.cput.entity.Student;
import za.ac.cput.util.Helper;

public class StudentFactory{
        //creating student objects
        public static Student createStudent(String student_name, String email, String address, String username, String password, String school, int grade){
            String student_id = za.ac.cput.util.Helper.generateId();

            if(Helper.isEmpty(student_name) || Helper.isEmpty(username) || Helper.isEmpty(password) || Helper.isEmpty(school))
                return null;

            if(!Helper.isValidEmail(email))
                return null;

            Student student = new Student.StudentBuilder().setStudent_id(student_id)
                    .setStudent_name(student_name)
                    .setEmail(email)
                    .setAddress(address)
                    .setUsername(username)
                    .setPassword(password)
                    .setSchool(school)
                    .setGrade(grade)
                    .build();
            return student;

        }
}


