package za.ac.cput.entity;
/*
 * Abdul Aleem Chilwan - 220108447
 * Parent.java
 * Creation of attributes for the Parent entity
 * 07-04-2022
 */

public class Parent {
    private String parentId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;

    private Parent (Builder builder){
        this.parentId = builder.parentId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.mobileNumber = builder.mobileNumber;
        this.password = builder.password;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentID) {
        this.parentId = parentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentID=" + parentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String parentId;
        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;
        private String password;

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(Parent parent){
            this.parentId = parent.parentId;
            this.firstName = parent.firstName;
            this.lastName = parent.lastName;
            this.email = parent.email;
            this.mobileNumber = parent.mobileNumber;
            this.password = parent.password;
            return this;
        }

        public Parent build(){
            return new Parent(this);
        }
    }
}
