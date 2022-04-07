package za.ac.cput.entity;
/*
 * Abdul Aleem Chilwan - 220108447
 * School.java
 * Creation of attributes for the School entity
 * 07-04-2022
 */
public class School {
    private String schoolId;
    private String name;

    private School (Builder builder){
        this.schoolId = builder.schoolId;
        this.name = builder.name;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String parentID) {
        this.schoolId = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "School{" +
                "schoolID=" + schoolId +
                ", name='" + name + '\'' +'}';
    }

    public static class Builder{
        private String schoolId;
        private String name;

        public Builder setSchoolId(String schoolId) {
            this.schoolId = schoolId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(School school){
            this.schoolId = school.schoolId;
            this.name = school.name;
            return this;
        }

        public School build(){
            return new School(this);
        }
    }
}

