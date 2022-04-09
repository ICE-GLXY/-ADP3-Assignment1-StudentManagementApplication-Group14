/*
Author:Moegammad Tasreeq Adams (216173027)
ADP Assignment 1
Date: April 2022
 */
package za.ac.cput.entity;

public class Register {
    private String registerNumber;
    private String email;
    private String password;
    private String school;
    private String parent;
    private String student;

    private Register(){}

    private Register(Builder builder){
        this.registerNumber = builder.registerNumber;
        this.email = builder.email;
        this.password = builder.password;
        this.school = builder.school;
        this.parent = builder.parent;
        this.student = builder.student;
    }

    //getters
    public String getRegisterNumber(){return registerNumber;}

    public String getEmail() {return email;}

    public String getPassword() {
        return password;
    }

    public String getSchool() {
        return school;
    }

    public String getParent() {
        return parent;
    }

    public String getStudent() {
        return student;
    }

    //setter


    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registerID='" + registerNumber + '\'' +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", school='" + school + '\'' +
                ", parent='" + parent + '\'' +
                ", student='" + student + '\'' +
                '}';
    }

    public static class Builder{
        private String registerNumber;
        private String email;
        private String password;
        private String school;
        private String parent;
        private String student;


        public Builder setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = parent;
            return this;
        }

        public Builder setStudent(String student) {
            this.student = student;
            return this;
        }

        public Builder copy (Register register){
            this.registerNumber = register.registerNumber;
            this.email = register.email;
            this.password = register.password;
            this.school = register.school;
            this.parent = register.parent;
            this.student = register.student;
            return this;
        }
        public Register build(){return new Register(this);}
    }
}
