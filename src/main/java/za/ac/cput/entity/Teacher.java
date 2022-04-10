package za.ac.cput.entity;
/*
 * Author Lelihle Gazi - (214258041)
 * Teacher.java
 * Created entity for Teacher class
 * 08-04-2022
 */

public class Teacher {
    private String teacherID;
    private String username;
    private String password;
    private String email;



    private Teacher(Builder builder){
        this.teacherID = builder.teacherID;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;

    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static class Builder {
        private String teacherID;
        private String username;
        private String password;
        private String email;

        public Builder setTeacherID(String teacherID){
            this.teacherID = teacherID;
            return this;
        }

        public Builder setUserName(String userName){
            this.username = username;
            return this;
        }
        public Builder setPassword(String Password){
            this.password= password;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder copy(Teacher teacher){
            this.teacherID = teacher.teacherID;
            this.username = teacher.username;
            this.password = teacher.password;
            this.email = teacher.email;
            return this;

        }
        public Teacher build(){
            return  new Teacher(this);
        }

    }
}
