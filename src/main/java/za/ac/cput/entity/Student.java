package za.ac.cput.entity;

/* Student.java
Entity for the Student
Author: Chante Lewis: 216118395
Date: 07 April 2022
 */
public class Student {
    private String student_id;
    private String student_name;
    private String email;
    private String address;
    private String username;
    private String password;
    private String school;
    private int grade;

    private Student(StudentBuilder builder) {
        this.student_id = builder.student_id;
        this.student_name = builder.student_name;
        this.email = builder.email;
        this.address = builder.address;
        this.username = builder.username;
        this.password = builder.password;
        this.school = builder.school;
        this.grade = builder.grade;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", school='" + school + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static class StudentBuilder {
        private String student_id;
        private String student_name;
        private String email;
        private String address;
        private String username;
        private String password;
        private String school;
        private int grade;


        public StudentBuilder setStudent_id(String student_id) {
            this.student_id = student_id;
            return this;
        }

        public StudentBuilder setStudent_name(String student_name) {
            this.student_name = student_name;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public StudentBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public StudentBuilder setSchool(String school) {
            this.school = school;
            return this;
        }

        public StudentBuilder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder copy(Student student){
            this.student_id = student.student_id;
            this.student_name = student.student_name;
            this.email = student.email;
            this.address = student.address;
            this.username = student.username;
            this.password = student.password;
            this.school = student.school;
            this.grade = student.grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
