package za.ac.cput.entity;
/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
   Grade.java
   April 2022
   Grade entity
 */

public class Grade {
    private String grade_id;
    private String grade_student_id;

    private Grade (Builder builder){
        this.grade_id = builder.grade_id;
        this.grade_student_id = builder.grade_student_id;
    }

    public String getGrade_id() {return grade_id;}
    public void setGrade_id() {this.grade_id = grade_id;}

    public String getGrade_student_id() {return grade_student_id;}
    public void setGrade_student_id(String grade_student_id) {this.grade_student_id = grade_student_id;}

    @Override
    public String toString() {
        return "Grade{" +
                "grade_id" + grade_id +
                ", grade_student_id='" + grade_student_id + '\'' +'}';
    }

    public static class Builder{
        private String grade_id;
        private String grade_student_id;

        public Builder setGrade_id(String grade_id){
            this.grade_id = grade_id;
            return this;
        }

        public Builder setGrade_student_id(String grade_student_id){
            this.grade_student_id = grade_student_id;
            return this;
        }

        public Builder copy (Grade grade){
            this.grade_id = grade.grade_id;
            this.grade_student_id = grade.grade_student_id;
            return this;
        }

        public Grade build() {return new Grade(this);}
    }
}
